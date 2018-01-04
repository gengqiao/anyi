package com.gq.handlers;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.gq.beans.Contract;
import com.gq.beans.ContractExample;
import com.gq.beans.ContractExample.Criteria;
import com.gq.service.ContractService;
import com.gq.service.SsoService;

@Controller
@RequestMapping("/contract")
public class ContractController extends BaseController {
	@Resource
	ContractService contractServiceimp;
	@Resource(name = "ssoServiceimp")
	SsoService ssoService;
	/**
	 * 添加合同信息
	 * @param contract
	 * @return
	 */
	@ResponseBody  
	@RequestMapping(value = "/addContract")
	public Object addContract(Contract contract){
		Date now=new Date();
		//登记时间取填表时间	
		contract.setRegisterdate(now);
		int i=contractServiceimp.addContract(contract);
		if(i==1){
		 return true;
		}
		return false; 
	}
	/**
	 * 查询所有合同信息
	 * @return
	 */
	@RequestMapping(value = "/selectContract")
	public String selectContract(){
		List<Contract>	contract=new ArrayList<Contract>();
		ContractExample example=new ContractExample();
		example.setOrderByClause("id desc");
		ContractExample.Criteria criteria =example.createCriteria();
		criteria.isValid();
		contract=contractServiceimp.selectByExample(example);
		request.setAttribute("contract", contract);
		return "/contract/showContract.jsp";
	}
	/**
	 * 通过id查询合同信息
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/selectContractById")
	public ModelAndView  selectById(Integer id){
		Contract contract=contractServiceimp.selectByPrimaryKey(id);
		ModelAndView mv=new ModelAndView();
		mv.addObject("contract", contract);
		mv.setViewName("/contract/updContract.jsp");  
		return mv;
	}
	/**
	 * 更细合同信息
	 * @param contract
	 * @return
	 */
	@ResponseBody  
	@RequestMapping(value = "/updContract")
	public Object updContract(Contract contract){
		Date now=new Date();
		//更新时间
		contract.setRegisterdate(now);
		int i=contractServiceimp.updContract(contract);
		if(i==1){
		 return true;
		}
		return false; 
	}
	/**
	 * 更细合同信息
	 * @param contract
	 * @return
	 */
	@ResponseBody  
	@RequestMapping(value = "/delContract")
	public Object delContract(int id){
		int i=contractServiceimp.deleteByPrimaryKey(id);
		if(i==1){
		 return true;
		}
		return false; 
	}
	/**
	 * 查询所有合同信息
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	@RequestMapping(value = "/selectContractByItem")
	public String selectContractByItem(String searchSeq,String searchClient,String searchProjectName) throws UnsupportedEncodingException{
		List<Contract>	contract=new ArrayList<Contract>();
		ContractExample example=new ContractExample();
		example.setOrderByClause("id desc");
		ContractExample.Criteria criteria =example.createCriteria();
		criteria.isValid();
		if(StringUtils.isNotBlank(searchSeq)){
			//searchSeq=URLDecoder.decode(searchSeq);
			searchSeq=new String(searchSeq.getBytes("iso-8859-1"),"UTF-8");
			criteria.andSeqLike("%"+searchSeq+"%");
			request.setAttribute("searchSeq", searchSeq);
		}
		if(StringUtils.isNotBlank(searchClient)){
			searchClient=new String(searchClient.getBytes("iso-8859-1"),"UTF-8");
			criteria.andClientLike("%"+searchClient+"%");
			request.setAttribute("searchClient", searchClient);
		}
		if(StringUtils.isNotBlank(searchProjectName)){
			searchProjectName=new String(searchProjectName.getBytes("iso-8859-1"),"UTF-8");
			criteria.andProjectnameLike("%"+searchProjectName+"%");
			request.setAttribute("searchProjectName", searchProjectName);
		}
		contract=contractServiceimp.selectByExample(example);
		request.setAttribute("contract", contract);
		return "/contract/showContract.jsp";
	}
	
}
