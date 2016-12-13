<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String userName = new String(request.getParameter("userName").getBytes("iso-8859-1"), "utf-8");
String role = new String(request.getParameter("role").getBytes("iso-8859-1"), "utf-8");

%>
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
   <script src="/js/layer/layer.js"></script>
    <script type="text/javascript" src="/js/jquery.form.js"></script>
</head>
<body>
<div class="panel admin-panel">
  <div class="body-content">
    <form method="post" class="form-x" action="/sso/addUser.do"  id="ajaxForm" onsubmit="return false;">
       <%--隐藏域id --%>
       <input type="hidden" value="<%=request.getParameter("id") %>" name="id"  />
      <div class="form-group">
        <div class="label">
          <label>用户名：</label>
        </div>
        <div class="field">
          <input type="text" value="<%=request.getParameter("loginid") %>" readonly="readonly" class="input  w100" id="loginid" name="loginid" placeholder="请输入用户名"  />
          <div class="tips"></div>
        </div>
      </div>
        <div class="form-group">
        <div class="label">
          <label>角色：</label>
        </div>
        <div class="field">
          <select class="input w100" name="peRole.id" id="role" data-validate="required:请选择用户角色" style="color:#999" >
			</select>
        </div>
      </div>
         <div class="form-group">
        <div class="label">
          <label>姓名：</label>
        </div>
        <div class="field">
          <input type="text" class="input w100" value="<%=userName %>" name="userName" data-validate="required:必填,chinese:姓名必须为中文" placeholder="请输入用户姓名" />
          <div class="tips"></div>
        </div>
      </div>
         <div class="form-group">
        <div class="label">
          <label>电话：</label>
        </div>
        <div class="field">
          <input type="text" class="input w100" value="<%=request.getParameter("mobilePhone") %>" name="mobilePhone"  data-validate="required:必填,mobile:仅能输入电话或手机" placeholder="请输入手机号，方便联系" />
          <div class="tips"></div>
        </div>
      </div>
         <div class="form-group">
        <div class="label">
          <label>邮箱：</label>
        </div>
        <div class="field">
          <input type="text" class="input w100" value="<%=request.getParameter("email") %>" name="email" data-validate="required:必填,email:请输入正确的邮箱" placeholder="请输入用户邮箱"  />
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label></label>
        </div>
        <div class="field">
          <button class="button bg-main icon-check-square-o" style="" type="button" id="btnAjaxSubmit">修改</button>
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
				var check="";
				if(data[i].name=='<%=role%>'){
					check=" selected='selected'";
				}
				html+="<option value='"+data[i].id+"' "+check+">"+data[i].name+"</option>"
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
					url:"/sso/updateUserById.do",
					data:$("#ajaxForm").serialize(),
					type:"post",
					dataType:"json",
					success:function (data){
						if(data!=null&&data){
							layer.alert('修改成功', {
								  icon: 1,
								  title:'提示信息'
								},
								 function(){
									parent.location.reload();
								}
							
							);
						}else{
							 layer.msg('修改失败', {icon: 2});
						}
					}
				}); 
			});
		});
	}); 
	</script>
</html>