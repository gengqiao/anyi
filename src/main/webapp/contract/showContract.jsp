<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix='fmt' uri="http://java.sun.com/jsp/jstl/fmt" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta name="renderer" content="webkit">
<title>展示合同信息</title>
<link rel="stylesheet" href="/css/pintuer.css">
<link rel="stylesheet" href="/css/admin.css">
<script src="/js/jquery.js"></script>
<script src="/js/pintuer.js"></script>
<script src="/js/layer/layer.js"></script>
<script src="/js/json2.js"></script>
</head>
<body style="width:2800px">
<div class="panel admin-panel">
  <div class="panel-head"><strong class="icon-reorder"> 内容列表</strong> <br>
	  项目编号：<input type="text" id="searchSeq" value="${searchSeq}" class="radius-big"   style="width:80px"/>
	    委托单位：<input type="text" id="searchClient" value="${searchClient }" class="radius-big" style="width:180px"/>     
	   项目名称：<input type="text" id="searchProjectName" value="${searchProjectName }" class="radius-big"  style="width:180px"/> 
	  <button class="button border-main" onclick="search()">查找</button>    
    </div>
  <table class="table table-condensed table-hover table-bordered	ver text-center" id="content">
    <tr>
      <th style="width:45px">项目编号</th>
      <th style="width:50px">委托单位</th>
      <th style="width:50px">项目名称</th>
      <th style="width:40px">合同额</th>
      <th style="width:50px">已收款</th>
      <th style="width:30px">是否含税</th>
      <th style="width:130px">付款时间</th>
      <th style="width:45px">资质出具时间</th>
      <th style="width:45px">报告出具时间</th>
      <th style="width:40px">项目联系人</th>
      <th style="width:30px">联系方式</th>
      <th style="width:30px">接洽日期</th>
      <th style="width:30px">合同日期</th>
      <th style="width:30px">表或书</th>
      <th style="width:40px">项目负责人</th>
      <th style="width:40px">接任务时间</th>
      <th style="width:60px">收集资料看现场时间</th>
      <th style="width:30px">监测时间</th>
      <th style="width:30px">工程分析完成时间</th>
      <th style="width:30px">公参完成时间</th>
      <th style="width:30px">内审时间</th>
      <th style="width:30px">专家会时间</th>
      <th style="width:30px">评估意见出具时间</th>
      <th style="width:30px">预定批复时间</th>
      <th style="width:30px">实际批复时间</th>
      <th style="width:30px">存档时间</th>
      <th style="width:100px">操作</th> 
    </tr>
    <c:forEach var="u" items="${contract}"  >
     <tr id="${u.id}">
      <td>${u.seq}</td> 
      <td>${u.client}</td>     
      <td>${u.projectname}</td>     
      <td>${u.contractamount}</td>
      <td>${u.receipted}</td>
      <td>${u.containtax}</td>
      <!-- 付款时间 -->
      <td>
       <span style="display: none" class="payNone">${u.paymentdate }</span> 
       <span class="payValue"></span>
      </td>
 	  <td><fmt:formatDate value="${u.qualificationsdate}" pattern="yyyy-MM-dd"/></td>
      <td><fmt:formatDate value="${u.reportdate}" pattern="yyyy-MM-dd"/></td>
      <td>${u.contacts}</td>
      <td>${u.contactsphone}</td>
      <td><fmt:formatDate value="${u.jieqiadate}" pattern="yyyy-MM-dd"/></td>
      <td><fmt:formatDate value="${u.hetongdate}" pattern="yyyy-MM-dd"/></td>
      <td>${u.type}</td>
       <td>${u.ssoUser.userName}</td>
       <td><fmt:formatDate value="${u.receivedate}" pattern="yyyy-MM-dd"/></td>
       <td><fmt:formatDate value="${u.collectingdata}" pattern="yyyy-MM-dd"/></td>
       <td><fmt:formatDate value="${u.monitordate}" pattern="yyyy-MM-dd"/></td>
       <td><fmt:formatDate value="${u.analysisdate}" pattern="yyyy-MM-dd"/></td>
       <td><fmt:formatDate value="${u.gongcandate}" pattern="yyyy-MM-dd"/></td>
       <td><fmt:formatDate value="${u.neishendate}" pattern="yyyy-MM-dd"/></td>
       <td><fmt:formatDate value="${u.expertdate}" pattern="yyyy-MM-dd"/></td>
       <td><fmt:formatDate value="${u.assessdate}" pattern="yyyy-MM-dd"/></td>
       <td><fmt:formatDate value="${u.scheduleddate}" pattern="yyyy-MM-dd"/></td>
      <td><fmt:formatDate value="${u.actualdate}" pattern="yyyy-MM-dd"/></td>
       <td><fmt:formatDate value="${u.getreplydate}" pattern="yyyy-MM-dd"/></td>
      <td>
      <div class="button-group">
      <a class="button border-main" href="#add" onclick="upd('${u.id}')"><span class="icon-edit"></span> 修改</a>
      <a class="button border-red" href="javascript:void(0)" onclick="del('${u.id}')">
      <span class="icon-trash-o"></span> 删除</a>
      </div></td>
    </tr>
   </c:forEach> 
  </table>
</div>
<script type="text/javascript">
function search(){
	var searchSeq=$("#searchSeq").val();
	var searchClient=$("#searchClient").val();
	var searchProjectName=$("#searchProjectName").val();
	var url="/contract/selectContractByItem.do?";
	if(searchSeq!=null&&searchSeq!=""){
		url+="searchSeq="+searchSeq+"&";
	}
	if(searchClient!=""&&searchClient!=null){
		url+="searchClient="+searchClient+"&";
	}
	if(searchProjectName!=""&&searchProjectName!=null){
		url+="searchProjectName="+searchProjectName+"&";
	}
	url=url.substring(0,url.length-1);
	url=encodeURI(url);
	window.location.href=url;
}
</script>
<script type="text/javascript">
$(document).ready(function(){ 
	　　var pay= $(".payNone");
	   var payVal=$(".payValue");
       for(var i=0;i<pay.length;i++){
    	  var str=$(pay[i]).text();
    	  if(str!=null&&str!=""){
    		  var 	json= eval($(pay[i]).text());
    		  var text="";
    		  $.each(json,function(i,item){
    		   text+="时间："+item.time+"金额："+item.num+"<br>";
    		  });
   		   $(payVal[i]).html(text) ;

    	  }else{
    		  $(payVal[i]).text("") ;
    	  }
    	
       }	   
	}); 

</script>
<script type="text/javascript">
function upd(id){
	var content ='/contract/selectContractById.do?id='+id;
			layer.open({
				  type: 2,
				  title:'修改用户信息',
				  area: ['1120px', '500px'], //宽高
				  maxmin: true,
				  anim:1,
				  shade: 0.6,
				  content:content ,
			      cancel:function (index, layero){
			    	  location.reload();
			      }
			});

}


function del(id){
	layer.confirm('您确定要删除吗？', {
		  btn: ['确定','再想想'] 
		}, function(){
			 $.ajax({
					url:'/contract/delContract.do',
					dataType:'json',
					data:{"id":id},
					success : function (data){
					  if(data){
						  layer.msg('删除成功', {icon: 1});
						  $("#"+id).remove();
					  }	else{
						  layer.msg('删除失败', {icon: 2});
					  }
					}
				 });
		}, function(){});
}
</script> 
<div id="tip"></div>
</body>
</html>