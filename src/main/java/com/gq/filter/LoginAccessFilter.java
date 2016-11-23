package com.gq.filter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.lang.StringUtils;
import com.gq.constant.SsoConstant;

public class LoginAccessFilter implements Filter {
	private String encoding = null;
	private static ConcurrentMap<String, Set<String>> whiteList = null;
	private static final String WHITE_LIST_EXCEL_PATH = "";
	private static final String WHITE_LIST_EXCEL_FILENAME = "loginAccessWhiteList.txt";
	/**
	 * 白名单里三种形式的uri：1.精确匹配，2.前缀形式（如/error/*），3.后缀形式（如*.css）
	 */
	private static final String EXACT_URI_SET_KEY = "exactURI";
	private static final String PREFIX_URI_SET_KEY = "prefixURI";
	private static final String SUFFIX_URI_SET_KEY = "suffixURI";
	private static Map<String, Set<String>> getWhiteListMap(HttpServletRequest request) throws Exception {
		String rootPath=request.getSession().getServletContext().getRealPath("/");
		//已经初始化，则直接返回白名单
		if(null != whiteList){
			return whiteList;
		}
		whiteList = new ConcurrentHashMap<String, Set<String>>();
		File file = new File(rootPath + WHITE_LIST_EXCEL_PATH + WHITE_LIST_EXCEL_FILENAME);
		//指定路径下没有找到文件，则到默认的路径下找
		if(!file.exists()){
			file = new File(rootPath + WHITE_LIST_EXCEL_FILENAME);
		}
		Set<String> exactUriSet = new HashSet<String>();
		Set<String> prefixUriSet = new HashSet<String>();
		Set<String> suffixUriSet = new HashSet<String>();
		if(file.exists()){
				InputStreamReader read = new InputStreamReader( new FileInputStream(file),"utf-8");
                BufferedReader bufferedReader = new BufferedReader(read);
                String url = null;
                while((url = bufferedReader.readLine()) != null){
					if(StringUtils.isNotBlank(url) && url.length()>1){
						if(url.startsWith("*")){
							suffixUriSet.add(url);
						}else if(url.endsWith("*")){
							prefixUriSet.add(url);
						}else{
							exactUriSet.add(url);
						}
					}
                }
                read.close();
		}
		whiteList.put(EXACT_URI_SET_KEY, exactUriSet);
		whiteList.put(PREFIX_URI_SET_KEY, prefixUriSet);
		whiteList.put(SUFFIX_URI_SET_KEY, suffixUriSet);
		return whiteList;
	} 
	public void doFilter(ServletRequest srequest, ServletResponse sresponse,
			FilterChain filterChain) throws IOException, ServletException {

		HttpServletResponse response = (HttpServletResponse) sresponse;
		HttpServletRequest request = (HttpServletRequest) srequest;
		HttpSession session = request.getSession();
		if (encoding != null) {
			// 设置request字符编码
			request.setCharacterEncoding(encoding);
			// 设置response字符编码
			response.setContentType("text/html;charset=" + encoding);
		}
		if(session.getAttribute(SsoConstant.SSO_USER_SESSION)!=null){
			filterChain.doFilter(request, response);
			return;
		}
		String url = request.getRequestURI(); 
		String space = request.getContextPath()+ "/";
		if(space.equals(url)){
			filterChain.doFilter(request, response);
			return;
		}
		if (isUrlInWhiteList(url,request)) {
			filterChain.doFilter(request, response);
			return ;
		} else {
			response.sendError(403);
			return;
		}
	}
	
	private boolean isUrlInWhiteList(String uri,HttpServletRequest request){
		try {
			getWhiteListMap(request);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(whiteList!=null){
			Set<String> exactUriSet = whiteList.get(EXACT_URI_SET_KEY);
			if (exactUriSet != null && exactUriSet.size() > 0) {
				for (String exactUri : exactUriSet) {
					if(uri.equals(exactUri)){
						return true;
					}
				}
			}
			
			Set<String> prefixUriSet = whiteList.get(PREFIX_URI_SET_KEY);
			if (prefixUriSet != null && prefixUriSet.size() > 0) {
				for (String prefixUri : prefixUriSet) {
					prefixUri = prefixUri.substring(0, prefixUri.length()-1);
					if(uri.startsWith(prefixUri)){
						return true;
					}
				}
			}
			
			Set<String> suffixUriSet = whiteList.get(SUFFIX_URI_SET_KEY);
			if (suffixUriSet != null && suffixUriSet.size() > 0) {
				for (String suffixUri : suffixUriSet) {
					suffixUri = suffixUri.substring(1);
					if(uri.endsWith(suffixUri)){
						return true;
					}
				}
			}
			
		}
		return false;
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		encoding = null;
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		encoding = arg0.getInitParameter("encoding");
	}
	
}