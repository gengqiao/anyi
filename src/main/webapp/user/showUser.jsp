<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix='fmt' uri="http://java.sun.com/jsp/jstl/fmt" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta name="renderer" content="webkit">
<title>展示用户</title>
<link rel="stylesheet" href="/css/pintuer.css">
<link rel="stylesheet" href="/css/admin.css">
<script src="/js/jquery.js"></script>
<script src="/js/pintuer.js"></script>
</head>
<body>
<div class="panel admin-panel">
  <div class="panel-head"><strong class="icon-reorder"> 内容列表</strong></div>
  <div class="padding border-bottom">  
  <button type="button" class="button border-yellow" onclick="window.location.href='/user/addUser.jsp'">
  <span class="icon-plus-square-o"></span> 添加用户
  </button>
  </div>
  <table class="table table-ho	ver text-center">
    <tr>
      <th width="10%">用户名</th>
      <th width="10%">角色</th>
      <th width="10%">姓名</th>
      <th width="10%">手机</th>
      <th width="15%">邮箱</th>
      <th width="10%">登录次数</th>
      <th width="20%">最后登录时间</th>
      <th width="15%">操作</th>
    </tr>
   <c:forEach var="u" items="${userList}" varStatus="us" >
     <tr>
      <td>${u.loginid}</td>     
      <td>${u.peRole.name}</td>     
      <td>${u.userName}</td>
      <td>${u.mobilePhone}</td>
      <td>${u.email}</td>
      <td>${u.loginnum}</td>
      <td><fmt:formatDate value="${u.lastlogindate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
      <td>
      <div class="button-group">
      <a class="button border-main" href="#add"><span class="icon-edit"></span> 修改</a>
      <a class="button border-red" href="javascript:void(0)" onclick="return del(1,1)">
      <span class="icon-trash-o"></span> 删除</a>
      </div></td>
    </tr>
   </c:forEach>
    
    
  </table>
</div>
<script type="text/javascript">
function del(id,mid){
	if(confirm("您确定要删除吗?")){
	
	}
}
</script> 
</body></html>