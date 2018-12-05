<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>残疾人服务中心</title>
<link rel="stylesheet" href="css/style.css" type="text/css" media="all"/>
<script src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
//图片滚动 调用方法 imgscroll({speed: 30,amount: 1,dir: "up"});
$.fn.imgscroll = function(o){
	var defaults = {
		speed: 40,
		amount: 0,
		width: 1,
		dir: "left"
	};
	o = $.extend(defaults, o);
	
	return this.each(function(){
		var _li = $("li", this);
		_li.parent().parent().css({overflow: "hidden", position: "relative"}); //div
		_li.parent().css({margin: "0", padding: "0", overflow: "hidden", position: "relative", "list-style": "none"}); //ul
		_li.css({position: "relative", overflow: "hidden"}); //li
		if(o.dir == "left") _li.css({float: "left"});
		
		//初始大小
		var _li_size = 0;
		for(var i=0; i<_li.size(); i++)
			_li_size += o.dir == "left" ? _li.eq(i).outerWidth(true) : _li.eq(i).outerHeight(true);
		
		//循环所需要的元素
		if(o.dir == "left") _li.parent().css({width: (_li_size*3)+"px"});
		_li.parent().empty().append(_li.clone()).append(_li.clone()).append(_li.clone());
		_li = $("li", this);

		//滚动
		var _li_scroll = 0;
		function goto(){
			_li_scroll += o.width;
			if(_li_scroll > _li_size)
			{
				_li_scroll = 0;
				_li.parent().css(o.dir == "left" ? { left : -_li_scroll } : { top : -_li_scroll });
				_li_scroll += o.width;
			}
				_li.parent().animate(o.dir == "left" ? { left : -_li_scroll } : { top : -_li_scroll }, o.amount);
		}
		
		//开始
		var move = setInterval(function(){ goto(); }, o.speed);
		_li.parent().hover(function(){
			clearInterval(move);
		},function(){
			clearInterval(move);
			move = setInterval(function(){ goto(); }, o.speed);
		});
	});
};
//友情链接下拉框跳转弹出新窗口
function frlink(selObj){
window.open(selObj.options[selObj.selectedIndex].value);}
</script>
</head>

<body>
<div id="hearder2" class="clearfix">
	<div class="logo">
   	  <img src="images/logo.jpg">
  </div>
  <div class="logo-name">残疾人服务平台</div>
    <div class="form-tools">
   	  <form id="search" name="search" action="SerchResult" method="post">
   	    <div class="tools-link">
   	    
   	    <c:if test="${USERNAME==null}">
        	<a href="login.jsp" target="_blank"><font size="2px">登&nbsp;录</font></a>&nbsp;&nbsp;|
        	<a href="register.jsp" target="_blank"><font size="2px">注&nbsp;册</font></a>
        	</c:if>
       <c:if test="${USERNAME!=null}"> 
            <a href="#" target="_blank" onclick="return false;"><font size="2px" color="black">用户：${USERNAME}</font></a>
            &nbsp;&nbsp;|
            <a href="QuitSession" target="_blank"><font size="2px" color="black">退出</font></a>
           </c:if> 
        
        	&nbsp;&nbsp;|
        	<a href="form.jsp" target="_blank"><font size="2px">我要报名</font></a>
        </div>	
        <div class="search-box">
            <input type="text" name="key" id="textfield" class="input-text" placeholder="请输入搜索关键词">
            <input type="image" src="images/search.png" class="input-submit" />
        </div>
        <div class="tools-link">
             热搜：&nbsp;&nbsp;<c:forEach items="${KEY }" var="k">
        	<a href="SerchResult?key=${k.keyword }" target="_blank"><font color="red" size="2px">${k.keyword }</font></a>&nbsp;&nbsp;
        	</c:forEach>
        </div>
  	  </form>
    </div>
</div>
<div id="slider-box" style="background:url(${BG.picaddress}) center center;"></div>
<!-- div2 -->
<div id="div2" class="clearfix">
	<div class="left260">
    	<div class="title-box">精彩推荐</div>
            <ul>
                <c:forEach items="${LISTC }" var="listc">
                <li><a href="ShowDetail?id=commends&name=${listc.comname }">${listc.comname }</a></li>
                </c:forEach>
            </ul>
    </div>
    <div class="center450">
        <div class="tabbox">
            <div class="title-box">残疾人优惠政策</div>
            <div class="content">
                    <div style="display:block;" class="tb">
                    	<ul>
                    	<c:forEach items="${LISTPO }" var="listpo">
                    	<li><a href="ShowDetail?id=policys&name=${listpo.polname }">${listpo.polname }</a></li>
                    	</c:forEach>                      	
                        </ul>
                    </div>
            </div>
        </div>
    </div>
</div>
<script>
$(function(){
	$(".tabbox .tab a").mouseover(function(){
		$(this).addClass('on').siblings().removeClass('on');
		var index = $(this).index();
		number = index;
		$('.tabbox .content .tb').hide();
		$('.tabbox .content .tb:eq('+index+')').show();
	});
	
	var auto = 1;  //等于1则自动切换，其他任意数字则不自动切换
	if(auto ==1){
		var number = 0;
		var maxNumber = $('.tabbox .tab a').length;
		function autotab(){
			number++;
			number == maxNumber? number = 0 : number;
			$('.tabbox .tab a:eq('+number+')').addClass('on').siblings().removeClass('on');
			$('.tabbox .content .tb:eq('+number+')').show().siblings().hide();
		}
		var tabChange = setInterval(autotab,3000);
		//鼠标悬停暂停切换
		$('.tabbox').mouseover(function(){
			clearInterval(tabChange);
		});
		$('.tabbox').mouseout(function(){
			tabChange = setInterval(autotab,3000);
		});
	  }
});
</script>

<div id="div4">
	<div class="title-box">最新信息</div>
</div>
<div class="scrollleft clearfix">
	<ul>
	<c:forEach items="${LISTPI }" var="listpi">
	    <li>
			<a href="#" onclick="return false"><img src="${listpi.picaddress }"/></a>
			<span>${listpi.picname }</span>
		</li>	
	</c:forEach>
		
	</ul>
</div>
<script type="text/javascript">
$(document).ready(function(){

	$(".scrollleft").imgscroll({
		speed: 40,    //图片滚动速度
		amount: 0,    //图片滚动过渡时间
		width: 1,     //图片滚动步数
		dir: "left"   // "left" 或 "up" 向左或向上滚动
	});
	
});
</script> 
<div id="div6">Copyright &copy; 2018 残疾人服务中心 All rights reserved.</div>
</body>
</html>
