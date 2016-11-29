<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-cn">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <title>网站信息</title>  
    <link rel="stylesheet" href="/css/pintuer.css">
    <link rel="stylesheet" href="/css/admin.css">
    <script src="/js/jquery.js"></script>
    <script src="/js/pintuer.js"></script>  
    <script type="text/javascript" src="/js/jquery.form.js"></script>
</head>
<body>
<div class="panel admin-panel">
  <div class="panel-head"><strong><span class="icon-pencil-square-o"></span> 添加用户信息</strong></div>
  <div class="body-content">
    <form method="post" class="form-x" action="/sso/addUser.do"  id="ajaxForm" onsubmit="return false;">
      <div class="form-group">
        <div class="label">
          <label>用户名：</label>
        </div>
        <div class="field">
          <input type="text" class="input  w50" id="loginid" name="loginid" data-validate="required:必填,mobile:用户名必须为11位手机号,ajax#/sso/checkLoginId.do?loginId=:该账号已存在" placeholder="请输入用户名"  />
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>密码：</label>
        </div>
        <div class="field">
          <input type="password" class="input w50" id="password" name="password" size="50" placeholder="请输入密码" data-validate="required:请输入密码,length#>=5:密码不能小于5位" />         
          <div class="tips"></div>
        </div>
      </div>
      
        <div class="form-group">
        <div class="label">
          <label>角色：</label>
        </div>
        <div class="field">
          <select class="input w50" name="peRole.id" id="role" data-validate="required:请选择用户角色" style="color:#999" >
			</select>
        </div>
      </div>
         <div class="form-group">
        <div class="label">
          <label>姓名：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" name="userName" data-validate="required:必填,chinese:姓名必须为中文" placeholder="请输入用户姓名" />
          <div class="tips"></div>
        </div>
      </div>
         <div class="form-group">
        <div class="label">
          <label>电话：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" name="mobilePhone"  data-validate="required:必填,mobile:仅能输入电话或手机" placeholder="请输入手机号，方便联系" />
          <div class="tips"></div>
        </div>
      </div>
         <div class="form-group">
        <div class="label">
          <label>邮箱：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" name="email" data-validate="required:必填,email:请输入正确的邮箱" placeholder="请输入用户邮箱"  />
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label></label>
        </div>
        <div class="field">
         <!--  <button class="button bg-main icon-check-square-o" type="submit"> 提交</button> -->
          <button class="button bg-main icon-check-square-o" type="button" id="btnAjaxSubmit">提交</button>
        </div>
      </div>
    </form>
  </div>
</div>
</body>
<script type="text/javascript">
	$.ajax({
		url:"/sso/selectValideRole.do",
		dataType:"json",
		success: function (data){
			var html="<option value=\"\">请选择用户角色</option>";
			for( var i=0;i<data.length;i++){
				html+="<option value='"+data[i].id+"'>"+data[i].name+"</option>"
			}
			$("#role").html(html);
		}
	});
	
 	$(function() {
		$("#btnAjaxSubmit").click(function() {
			$("#ajaxForm").ajaxSubmit(function() {
				var loginId=$("#loginid").val();
				var password=$("#password").val()
				$.ajax({
					url:"/sso/addUser.do",
					data:$("#ajaxForm").serialize(),
					type:"post",
					dataType:"json",
					success:function (data){
						if(data!=null&&data.success){
							alert("添加成功！新用户的用户名为"+loginId+";密码为:"+password);
							window.location.href='/sso/showUser.do';
						}else{
							alert("添加失败，请重试");
						}
					}
				}); 
			});
		});
	}); 
	</script>
</html>