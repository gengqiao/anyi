<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix='fmt' uri="http://java.sun.com/jsp/jstl/fmt" %>  

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改合同信息</title>
	<script   type="text/javascript"  src="/js/jquery.js"></script>
	<script  type="text/javascript"  src="/js/pintuer.js"></script>  
    <link rel="stylesheet" href="/css/pintuer.css">
    <link rel="stylesheet" href="/css/admin.css">
    <script src="/js/layer/layer.js"></script>
    <script language="javascript" type="text/javascript" src="/js/My97DatePicker/WdatePicker.js"></script>
    <style type="text/css">
	.wen{ width:25%; float:left;line-height: 40px;font-weight: bold;}
	.w75{ width:70%; float:left;}
	.table-hover td{width:50%;}
    .form-x .form-group .field {float: left; width: 75%;}
    </style>
</head>
<body>
<div class="body-content">
    <form method="post" class="form-x" action="/contract/updContract.do"  id="ajaxForm">
     <input type="hidden" name="id" value="${contract.id }">
   <table class="table table-condensed table-striped contracttable ">
     <tr>
		<td >
		 <div class="form-group">
          <label class="wen" >项目编号：</label>
          <div class="field">
         <input type="text" class="input w75" value="${contract.seq }"  name="seq" data-validate="required:必填" placeholder="请输入项目编号"  />
		</div>
		</div>
		</td>
		<td >
		   <div class="form-group">
          <label class="wen" >委托单位：</label>
          <div class="field">
         <input type="text" class="input w75" value="${contract.client }"  name="client" data-validate="required:必填"  placeholder="请输入委托单位"  />
		  </div>
		  </div>
		</td>
	</tr >
		<tr>
		<td >
		 <div class="form-group">
          <label class="wen" >项目名称：</label>
          <div class="field">
         <input type="text" class="input w75" value="${contract.projectname }"  name="projectname" data-validate="required:必填" placeholder="请输入项目名称"  />
		</div>
		</div>
		</td>
		<td >
		 <div class="form-group">
          <label class="wen" >合同额：</label>
          <div class="field">
          <input type="text" class="input w75" value="${contract.contractamount }"   name="contractamount" data-validate="required:必填,plusdouble:只能输入数字" placeholder="请输入合同额"  />
		  </div>
		  </div>
		</td>
	</tr>
	<tr  >
		<td >
		 <div class="form-group">
          <label class="wen" >已收款：</label>
          <div class="field">
         <input type="text" class="input w75"  value="${contract.receipted }" name="receipted" data-validate="required:必填,plusdouble:只能输入数字" placeholder="请输入已收款"  />
		</div>
		</div>
		</td>
		<td >
		 <div class="form-group">
          <label class="wen" >是否含税：</label>
          <div class="field">
			<div class="button-group radio">
			  <c:if test="${contract.containtax=='是' ||contract.containtax==''}">
				<label class="button active">
					<input name="containtax"  checked="checked" value="是"  type="radio"><span class="icon icon-check"></span> 是
				</label>
				<label class="button">
					<input name="containtax"  value="否" type="radio"><span class="icon icon-times"></span> 否
				</label>
			</c:if>
			<c:if test="${contract.containtax=='否'}">
			 <label class="button">
					<input name="containtax"  checked="checked" value="是" type="radio"><span class="icon icon-times"></span> 是
				</label>
				<label class="button active">
					<input name="containtax"   value="否"  type="radio"><span class="icon icon-check"></span> 否
				</label>
			</c:if>
			</div>		  
			</div>
		  </div>
		</td>
	</tr>
	 <tr>
		<td >
		<div id="paydate">
		 <div class="form-group" >
          <label class="wen" >付款时间：</label>
          <div class="field">
         	<div class="floatleft" > 时间：<input style="width: 73%;display:inline;" type="text" class="input"  onClick="WdatePicker()" name="paydatetime"  placeholder="点击选择时间"  /></div>
       		<div class="floatleft">  金额：<input style="width: 73%;display:inline;" type="text" class="input"  name="paydatenum" data-validate="plusdouble:金额只能输入数字"  placeholder="输入回款金额"  /></div>
		    <span class="increment" onclick="createPayDate()" title="点击增加回款次数" id="increment">+</span>
		   <input style="display: none" id="paymentdate" name="paymentdate" value="${contract.paymentdate }"/>
		  </div>
		  </div>
		 </div> 
		</td>
		 <td >
		 <div class="form-group">
          <label class="wen" >资质出具时间：</label>
          <div class="field">
         <input type="text" class="input w75" value=" <fmt:formatDate value="${contract.qualificationsdate }" pattern="yyyy-MM-dd"/> " name="qualificationsdate"   onClick="WdatePicker()" placeholder="点击选择时间"  />
		</div>
		</div>
		</td> 
	</tr>
	
	<tr>
		<td >
		 <div class="form-group">
          <label class="wen" >报告出具时间：</label>
          <div class="field">
         <input type="text" class="input w75" value="<fmt:formatDate value="${contract.reportdate }" pattern="yyyy-MM-dd"/> " name="reportdate"   onClick="WdatePicker()" placeholder="点击选择时间"  />
		</div>
		</div>
		</td>
		<td >
		 <div class="form-group">
          <label class="wen" >项目联系人：</label>
          <div class="field">
          <input type="text" class="input w75"   value="${contract.contacts }"  name="contacts" data-validate="chinese:只能输入中文" placeholder="请输入项目联系人"  />
		  </div>
		  </div>
		</td>
	</tr>
	
	<tr>
		<td >
		 <div class="form-group">
          <label class="wen" >联系方式：</label>
          <div class="field">
         <input type="text" class="input w75" value="${contract.contactsphone }"    name="contactsphone" data-validate="tel:联系方式只能是手机或者电话" placeholder="请输入联系方式"  />
		</div>
		</div>
		</td>
		<td >
		 <div class="form-group">
          <label class="wen" >接洽日期：</label>
          <div class="field">
          <input type="text" class="input w75" value="  <fmt:formatDate value="${contract.jieqiadate }" pattern="yyyy-MM-dd"/> " name="jieqiadate"  onClick="WdatePicker()" placeholder="点击选择时间"  />
		  </div>
		  </div>
		</td>
	</tr>
	<tr>
		<td >
		 <div class="form-group">
          <label class="wen" >合同日期：</label>
          <div class="field">
         <input type="text" class="input w75" value="  <fmt:formatDate value="${contract.hetongdate }" pattern="yyyy-MM-dd"/>" name="hetongdate" onClick="WdatePicker()" placeholder="点击选择时间"  />
		</div>
		</div>
		</td>
		<td >
		 <div class="form-group">
          <label class="wen" >表或书：</label>
          <div class="field">
           <c:if test="${contract.type=='表' ||contract.type==''}">
         	 <div class="button-group radio">
				<label class="button active">
					<input name="type" value="表"   checked="checked" type="radio">表
				</label>
				<label class="button">
					<input name="type" value="书"  type="radio">书
				</label>
				</div>
			</c:if>
		  <c:if test="${contract.type=='书'}">
			 <div class="button-group radio">
				
				<label class="button">
					<input name="type" value="表"  type="radio">表
				</label>
				<label class="button active">
					<input name="type" value="书"   checked="checked" type="radio">书
				</label>
				</div>
			</c:if>	
				
			</div>
		  </div>
		</td>
	</tr>
	<tr>
		<td >
		 <div class="form-group">
          <label class="wen" >项目负责人：</label>
          <div class="field">
		    <select class="input w75" name="fkUserId" id="user"  data-validate="required:请选择项目负责人" style="color:#999" >
			</select>
		</div>
		</div>
		</td>
		<td >
		 <div class="form-group">
          <label class="wen" >接任务时间：</label>
          <div class="field">
          <input type="text" class="input w75" value="  <fmt:formatDate value="${contract.hetongdate }" pattern="yyyy-MM-dd"/> " name="receivedate"  onClick="WdatePicker()" placeholder="点击选择时间"  />
		  </div>
		  </div>
		</td>
	</tr>
	
	
		<tr>
		<td >
		 <div class="form-group">
          <label class="wen" >收集资料看现场时间：</label>
        <div class="field">
          <input type="text" class="input w75" value="  <fmt:formatDate value="${contract.collectingdata }" pattern="yyyy-MM-dd"/> " name="collectingdata"  onClick="WdatePicker()" placeholder="点击选择时间"  />
		  </div>
		</div>
		</td>
		<td >
		 <div class="form-group">
          <label class="wen" >监测时间：</label>
          <div class="field">
          <input type="text" class="input w75" value="  <fmt:formatDate value="${contract.monitordate }"   pattern="yyyy-MM-dd"/>" name="monitordate" onClick="WdatePicker()" placeholder="点击选择时间"  />
		  </div>
		  </div>
		</td>
	</tr>
	
	
		<tr>
		<td >
		 <div class="form-group">
          <label class="wen" >工程分析完成时间：</label>
        <div class="field">
          <input type="text" class="input w75" value="  <fmt:formatDate value="${contract.analysisdate }"  pattern="yyyy-MM-dd"/>"  name="analysisdate"  onClick="WdatePicker()" placeholder="点击选择时间"  />
		  </div>
		</div>
		</td>
		<td >
		 <div class="form-group">
          <label class="wen" >公参完成时间：</label>
          <div class="field">
          <input type="text" class="input w75" value="  <fmt:formatDate value="${contract.gongcandate }" pattern="yyyy-MM-dd"/>"  name="gongcandate"  onClick="WdatePicker()" placeholder="点击选择时间"  />
		  </div>
		  </div>
		</td>
	</tr>
	
		<tr>
		<td >
		 <div class="form-group">
          <label class="wen" >内审时间：</label>
        <div class="field">
          <input type="text" class="input w75" value="  <fmt:formatDate value="${contract.neishendate }" pattern="yyyy-MM-dd"/> "  name="neishendate"  onClick="WdatePicker()" placeholder="点击选择时间"  />
		  </div>
		</div>
		</td>
		<td >
		 <div class="form-group">
          <label class="wen" >专家会时间：</label>
          <div class="field">
          <input type="text" class="input w75" value="  <fmt:formatDate value="${contract.expertdate }" pattern="yyyy-MM-dd"/> "  name="expertdate"  onClick="WdatePicker()" placeholder="点击选择时间"  />
		  </div>
		  </div>
		</td>
	</tr>
	
		<tr>
		<td >
		 <div class="form-group">
          <label class="wen" >评估意见出具时间：</label>
        <div class="field">
          <input type="text" class="input w75"  value="  <fmt:formatDate value="${contract.assessdate }" pattern="yyyy-MM-dd"/> " name="assessdate"  onClick="WdatePicker()" placeholder="点击选择时间"  />
		  </div>
		</div>
		</td>
		<td >
		 <div class="form-group">
          <label class="wen" >预定批复时间：</label>
          <div class="field">
          <input type="text" class="input w75" value="  <fmt:formatDate value="${contract.scheduleddate }" pattern="yyyy-MM-dd"/>" name="scheduleddate"  onClick="WdatePicker()" placeholder="点击选择时间"  />
		  </div>
		  </div>
		</td>
	</tr>
	
	<tr>
		<td >
		 <div class="form-group">
          <label class="wen" >实际批复时间：</label>
        <div class="field">
          <input type="text" class="input w75" value="  <fmt:formatDate value="${contract.actualdate }" pattern="yyyy-MM-dd"/>" name="actualdate"  onClick="WdatePicker()" placeholder="点击选择时间"  />
		  </div>
		</div>
		</td>
		<td >
		 <div class="form-group">
          <label class="wen" >存档时间：</label>
          <div class="field">
          <input type="text" class="input w75" value="  <fmt:formatDate value="${contract.getreplydate }" pattern="yyyy-MM-dd"/> " name="getreplydate"  onClick="WdatePicker()" placeholder="点击选择时间"  />
		  </div>
		  </div>
		</td>
	</tr> 
	<tr><td colspan="2"> 
<!-- 	 <button class="button bg-main icon-check-square-o" type="submit"> 提交</button>
 -->	 <button class="button bg-main icon-check-square-o" type="button" id="btnAjaxSubmit">提交</button>
	 </td></tr>
</table>
   </form>
</div>
</body>
<script type="text/javascript">
$(function() {
	//遍历付款时间
	var json=eval('${contract.paymentdate }');
	$.each(json,function(i,item){
	  if(i>0){
		  createPayDate();
	  }	  
	});
	var time=$('input[name="paydatetime"]');
	var num=$('input[name="paydatenum"]');
	$.each(json,function(i,item){
		$(time[i]).val(item.time);
		$(num[i]).val(item.num);
	});
	
	$("#btnAjaxSubmit").click(function() {
		checkPaydate();
		$("#ajaxForm").ajaxSubmit(function() {
			$.ajax({
				url:"/contract/updContract.do",
				data:$("#ajaxForm").serialize(),
				type:"post",
				dataType:"json",
				success:function (data){
					if(data!=null&&data){
						layer.msg('更新成功', {icon: 1});
					}else{
						 layer.msg('更新失败', {icon: 2});
					}
				}
			}); 
		});
	});
}); 


$.ajax({
	url:"/sso/showAllUser.do",
	dataType:"json",
	success: function (data){
		var html="<option value=\"\">请选择用户</option>";
		for( var i=0;i<data.length;i++){
			var che="";
			if( ${contract.ssoUser.id }==data[i].id){
				che="selected=\"selected\"";
			}
			html+="<option value='"+data[i].id+"' "+che+" >"+data[i].userName+"</option>"
		}
		$("#user").html(html);
	}
});
function checkPaydate(){
	var time=$('input[name="paydatetime"]');
	var num=$('input[name="paydatenum"]');
	var ltime=time.length;
	var lnum=num.length;
	var json="[";
	for(var i=0;i<ltime;i++){
		var timeval=$(time[i]).val();
		var numval=$(num[i]).val();
		if((timeval==""&&numval!="")||(timeval!=""&&numval=="")){
			layer.msg('付款时间和金额不能不空', {icon: 2});
			return;
		}
		json+="{\"time\":\""+timeval+"\",\"num\":\""+numval+"\"},";
	}
	json=json.substring(0,json.length-1);
	json+="]";
	$("#paymentdate").val(json);
}
/**
 * 创建付款时间
 */
function createPayDate(){
	$("#paydate").append('<div class="form-group">'
			 + '<label class="wen" >付款时间：</label>'
			 + '<div class="field">'
	         +'<div class="floatleft" > 时间：<input style="width: 73%;display:inline;" type="text" class="input"  onClick="WdatePicker()" name="paydatetime"  placeholder="点击选择时间"  /></div>'
	       	 +'<div class="floatleft">  金额：<input style="width: 73%;display:inline;" type="text" class="input"  name="paydatenum" data-validate="plusdouble:金额只能输入数字"  placeholder="输入回款金额"  /></div>'
			 + ' <span class="increment" onclick="delPayDate(this)" title="点击删除本次回款">-</span>'
			 + '</div>'
			 +'</div>');
}
/**
 * 删除付款时间
 */
function delPayDate(obj){
	layer.confirm('您确定要删除本次回款记录吗？', {
		  btn: ['确定','再想想'] 
		}, function(){
			$(obj).parent().parent().remove();
			 layer.msg('删除成功', {icon: 1});
		}, function(){});
}
</script>
</html>