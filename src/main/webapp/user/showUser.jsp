<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<script src="/js/layer/layer.js"></script>
<script src="/js/json2.js"></script>
<style type="text/css">
.highlight { background: yellow; color: red; }
#tip { background: #FFFFCC; border: 1px solid #999; width: 50px; text-align: center; display: none; font-size: 12px; }
#search_box { background: white; opacity: 0.8; text-align:left }
#search_btn { background: #0f79be; margin-top: 6px; border-radius: 2px; border: 0px; width: 100px; line-height: 24px; color: white; }
#searchstr { font-size: 14px; height: 20px; }
</style>
</head>
<body>
<div class="panel admin-panel">
  <div class="panel-head"><strong class="icon-reorder"> 内容列表</strong></div>
  <div class="padding border-bottom">  
  <button type="button"  class="button  button-little border-yellow" onclick="add()">
  <span class="icon-plus-square-o"></span> 添加用户
  </button> 
   <div id="search_box">
		<input class="" id="searchstr" type="text" size="20"   placeholder="请输入要查找的内容"  name="searchstr" />　
        <input class="" id="search_btn" type="button" value="页内查找" />
	 </div>
  </div>
  <div class="padding border-bottom"> 
   
  </div>
  <table class="table table-condensed table-hover	ver text-center" id="content">
    <tr>
      <th width="8%">用户名</th>
      <th width="10%">角色</th>
      <th width="10%">姓名</th>
      <th width="10%">手机</th>
      <th width="15%">邮箱</th>
      <th width="10%">登录次数</th>
      <th width="20%">最后登录时间</th>
      <th width="15%">操作</th>
    </tr>
   <c:forEach var="u" items="${userList}" varStatus="us" >
     <tr id="${u.id}">
      <td>${u.loginid}</td>     
      <td>${u.peRole.name}</td>     
      <td>${u.userName}</td>
      <td>${u.mobilePhone}</td>
      <td>${u.email}</td>
      <td>${u.loginnum}</td>
      <td><fmt:formatDate value="${u.lastlogindate}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
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
function add(){
	layer.open({
		  type: 2,
		  title:'添加用户',
		  area: ['820px', '500px'], //宽高
		  maxmin: true,
		  anim:1,
		  shade: 0.6,
		  content:'/user/addUser.jsp' ,
	      cancel:function (index, layero){
	    	  location.reload();
	      }
	});
}


function upd(id){
	var tdList = $("#"+id).children("td");
	var loginid=tdList.eq(0).text();
	var role=tdList.eq(1).text();
	var userName=tdList.eq(2).text();
	var mobilePhone=tdList.eq(3).text();
	var email=tdList.eq(4).text();
	var content ='/user/updUser.jsp?loginid='+loginid+'&role='+role+'&userName='+userName+'&mobilePhone='+mobilePhone+'&email='+email+'&id='+id;
			layer.open({
				  type: 2,
				  title:'修改用户信息',
				  area: ['820px', '500px'], //宽高
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
					url:'/sso/delectUserById.do',
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
<script>
 (function($) {
    $.fn.fixDiv = function(options) {
        var defaultVal = {
            top: 10
        };
        var obj = $.extend(defaultVal, options);
		$this = this;
        var _top = $this.offset().top;
        var _left = $this.offset().left;
        $(window).scroll(function() {
            var _currentTop = $this.offset().top;
            var _scrollTop = $(document).scrollTop();
            if (_scrollTop > _top) {
                $this.offset({
                    top: _scrollTop + obj.top,
                    left: _left
                });
            } else {
                $this.offset({
                    top: _top,
                    left: _left
                });
            }
        });
        return $this;
    };
})(jQuery); 
$(function(){
	$("#search_box").fixDiv({ top: 0 });
	$('#search_btn').click(highlight);//点击search时，执行highlight函数；
	$('#searchstr').keydown(function (e) {
	    var key = e.which;
	    if (key == 13) highlight();
	})
	
	var i = 0;
	var sCurText;
	function highlight(){
		clearSelection();//先清空一下上次高亮显示的内容；
		
		var flag = 0;
	    var bStart = true;
		
		
		$('#tip').text('');
	    $('#tip').hide();
	    var searchText = $('#searchstr').val();
		var _searchTop = $('#searchstr').offset().top+30;
		var _searchLeft = $('#searchstr').offset().left;
		if($.trim(searchText)==""){
			//alert(123);
			showTips("请输入要查找的内容",_searchTop,3,_searchLeft);
			return;
		}
			
			
		var searchText = $('#searchstr').val();//获取你输入的关键字；
		var regExp = new RegExp(searchText, 'g');//创建正则表达式，g表示全局的，如果不用g，则查找到第一个就不会继续向下查找了；
		var content = $("#content").text();
		if (!regExp.test(content)) {
			showTips("没有找到内容",_searchTop,3,_searchLeft);
	        return;
	    } else {
	        if (sCurText != searchText) {
	            i = 0;
	            sCurText = searchText;
	         }
	     }
		
		$('tr').each(function(){
			var html = $(this).html();
			var newHtml = html.replace(regExp, '<span class="highlight">'+searchText+'</span>');//将找到的关键字替换，加上highlight属性；

			$(this).html(newHtml);//更新；
			flag = 1;
		});
		
		if (flag == 1) {
			if ($(".highlight").size() > 1) {
				var _top = $(".highlight").eq(i).offset().top+$(".highlight").eq(i).height();
				var _tip = '找到内容';
				var _left = $(".highlight").eq(i).offset().left;
	            var _tipWidth = $("#tip").width();
				if (_left > $(document).width() - _tipWidth) {
	                    _left = _left - _tipWidth;
	            }
				$("#tip").html(_tip).show();
	            $("#tip").offset({ top: _top, left: _left });
	            $("#search_btn").val("查找下一个");
			}else{
				var _top = $(".highlight").offset().top+$(".highlight").height();
				var _tip = '找到内容';
	            var _left = $(".highlight").offset().left;
	            $('#tip').show();
	            $("#tip").html(_tip).offset({ top: _top, left: _left });
			}
			$("html, body").animate({ scrollTop: _top - 50 });
	        i++;
	        if (i > $(".highlight").size() - 1) {
	            i = 0;
	        }
		}
	}
	function clearSelection(){
		$('tr').each(function(){
			//找到所有highlight属性的元素；
			$(this).find('.highlight').each(function(){
				$(this).replaceWith($(this).html());//将他们的属性去掉；
			});
		});
	}
	
	//mask
	var tipsDiv = '<div class="tipsClass"></div>'; 
	$( 'body' ).append( tipsDiv );
	function showTips( tips, height, time,left ){ 
		var windowWidth = document.documentElement.clientWidth; 
		$('.tipsClass').text(tips);
		$( 'div.tipsClass' ).css({ 
		'top' : height + 'px', 
		'left' :left + 'px', 
		'position' : 'absolute', 
		'padding' : '8px 6px', 
		'background': '#000000', 
		'font-size' : 14 + 'px', 
		'font-weight': 900,
		'margin' : '0 auto', 
		'text-align': 'center', 
		'width' : 'auto', 
		'color' : '#fff', 
		'border-radius':'2px', 
		'opacity' : '0.8' ,
		'box-shadow':'0px 0px 10px #000',
		'-moz-box-shadow':'0px 0px 10px #000',
		'-webkit-box-shadow':'0px 0px 10px #000'
		}).show(); 
		setTimeout( function(){$( 'div.tipsClass' ).fadeOut();}, ( time * 1000 ) ); 
	} 
})
/**/
</script>
<div id="tip"></div>
</body>
</html>