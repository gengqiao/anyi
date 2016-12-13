<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@page import="com.gq.beans.SsoUser" %>   
 <%
 //从session中获得用户名
 String loginId=((SsoUser)session.getAttribute("user_session")).getLoginid();
 %>   
<!DOCTYPE html>
<html lang="zh-cn">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta name="renderer" content="webkit">
<title></title>
<link rel="stylesheet" href="/css/pintuer.css">
<link rel="stylesheet" href="/css/admin.css">
<script src="/js/jquery.js"></script>
<script src="/js/pintuer.js"></script>
<script src="/js/layer/layer.js"></script>
</head>
<body>
<div class="panel admin-panel">
  <div class="panel-head"><strong><span class="icon-key"></span> 修改会员密码</strong></div>
  <div class="body-content">
    <form method="post" class="form-x" action="" id="ajaxForm">
      <div class="form-group">
        <div class="label">
          <label for="sitename">管理员帐号：</label>
        </div>
        <div class="field">
          <label style="line-height:33px;">
           <%=loginId %>
          </label>
        </div>
      </div>      
      <div class="form-group">
        <div class="label">
          <label for="sitename">原始密码：</label>
        </div>
        <div class="field">
          <input type="password" class="input w50" id="mpass" name="oldPass" size="50" placeholder="请输入原始密码" data-validate="required:请输入原始密码,ajax#/sso/changePassWord.do?flag=1&oldPass=:原密码输入错误" />       
        </div>
      </div>      
      <div class="form-group">
        <div class="label">
          <label for="sitename">新密码：</label>
        </div>
        <div class="field">
          <input type="password" class="input w50" name="newPass" size="50" placeholder="请输入新密码" data-validate="required:请输入新密码,length#>=5:新密码不能小于5位" />         
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label for="sitename">确认新密码：</label>
        </div>
        <div class="field">
          <input type="password" class="input w50" name="renewpass" size="50" placeholder="请再次输入新密码" data-validate="required:请再次输入新密码,repeat#newPass:两次输入的密码不一致" />          
        </div>
      </div>
      
      <div class="form-group">
        <div class="label">
          <label></label>
        </div>
        <div class="field">
          <button class="button bg-main icon-check-square-o" type="button" id="btnAjaxSubmit">提交</button>
        </div>
      </div>      
    </form>
  </div>
</div>
</body>
<script type="text/javascript">
$(function() {
	$("#btnAjaxSubmit").click(function() {
		$("#ajaxForm").ajaxSubmit(function() {
			$.ajax({
				url:"/sso/changePassWord.do",
				data:$("#ajaxForm").serialize(),
				type:"post",
				dataType:"json",
				success:function (data){
					if(data!=null&&data.success){
						layer.msg('修改成功', {icon: 1},function() {
							location.reload();
						});
					}else{
						 layer.msg('添加失败', {icon: 2});
					}
				}
			}); 
		});
	});
}); 
</script>
</html>