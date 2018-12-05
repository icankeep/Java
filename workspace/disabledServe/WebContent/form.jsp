<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>报名页面</title>
<link rel="stylesheet" href="css/style.css" type="text/css" media="all"/>
<style type="text/css">
input[type="submit"]{background:#0067ca;font-size:15px;color:#FFFFFF;border:0;text-shadow:0 -1px 0 #535353;margin:5px 5px 0 0;padding:0 0 3px 0;display:block;width:106px;height:35px;text-align:center;font-weight:bold;line-height:33px; border-radius:3px;}
input[type="button"]{background:#0067ca;font-size:15px;color:#FFFFFF;border:0;text-shadow:0 -1px 0 #535353;margin:5px 5px 0 0;padding:0 0 3px 0;display:block;width:106px;height:35px;text-align:center;font-weight:bold;line-height:33px; border-radius:3px;}
input.button_button{background:#0067ca;margin:0;width:106px;height:35px;border:0;font-size:15px;color:#FFFFFF;text-shadow:0 -1px 0 #535353;padding:0 0 3px 0;text-align:center;font-weight:bold;line-height:33px;cursor:pointer; display: inline-block; margin-right:30px; border-radius:3px;}

/*Tooltips*/
.tooltips_main{position:absolute;left:0;margin:-5px 0 0 2px;z-index:999;}
.tooltips_box,.tooltips,.msg{display:inline-block;*display:inline;*zoom:1;position:relative;border-style:solid;border-color:#FF1F1F;}
.tooltips,.msg{border-width:0 1px;*left:-2px;background-color:#FFCFCF;}
.tooltips_box{border-width:1px;line-height:1.5;}
.tooltips{margin:0 -2px;}
.msg{margin:1px -2px;padding:0 6px;color:#2F2C2C;text-shadow:0 1px 0 #FFFFFF;font-size:12px;}
.ov{background:url('images/tri.gif') no-repeat scroll 0 0 transparent;position:absolute;left:30%;overflow:hidden;width:15px;height:15px;margin:16px 0 0 0;display:inline;}
/*regist*/
.register .form_submit{border-bottom:1px dotted #0f62c5;}
.register .form_submit .fieldset .field-group{min-height:55px;}
.register .form_submit .fieldset .field-group .title{float:left;width:120px;text-align:right;margin:4px 0 0 0;font-size:14px;}
.register .form_submit .fieldset .field-group .control-group{float:left;width:300px;margin:0 10px;}
.register .form_submit .fieldset .field-group .tips{float:left;width:250px;color:#8E8E8E;}
.register .div_submit{width:100%;margin:10px 0; text-align:center;}

/*end regist*/
.fieldset .input_add_background{height:30px;width:112px;float:left;margin:0 2px 0 0;}
.fieldset .input_add_background input.register_input_ot{background-color:#f9f9f9;border:1px solid #ccc; border-radius:3px;color:#4F4F4F;font-size:12px;height:18px;outline:medium none;width: 100px;padding:5px 10px;}
.fieldset .input_add_long_background{height:30px;width:286px;float:left;margin:0 0 15px 0;display:inline;}
.fieldset .input_add_long_light_background{height:30px;width:286px;float:left;}
.fieldset .input_add_long_background input.register_input{background-color:#f9f9f9;border:1px solid #ccc; border-radius:3px;color:#4F4F4F;font-size:12px;height:18px;outline:medium none;width: 270px;padding:5px 10px;}
.fieldset .input_text{display:inline-block;position:absolute;vertical-align:top;margin:6px 0 0 10px;z-index:2;font-style:italic;color:#BFBFBF;}
.select-style {background-color: #f9f9f9; border:1px solid #ccc; border-radius:3px; color: #4F4F4F; font-size: 12px; height: 30px; outline: medium none; width: 270px; padding: 1px;}
.textarea-style {background-color: #f9f9f9; border:1px solid #ccc; border-radius:3px; color: #4F4F4F; font-size: 12px; outline: medium none; width: 270px; height: 58px; padding: 1px; }
.fieldset .input_add_long_background input.time_input{background-color:#f9f9f9;border:1px solid #ccc; border-radius:3px;color:#4F4F4F;font-size:12px;height:18px;outline:medium none;width: 30px;padding:5px 10px; text-align:center;}


</style>
<script src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="js/script.js"></script>
</head>
<script type="text/javascript">
window.onload=function(){
	if('${key}' == 1){
		 alert("提交成功，请等待审批");
	     window.location='IndexContent';	 
	 }
}
</script>
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
           </c:if> 
        
        	&nbsp;&nbsp;|
        	<a href="form.jsp" target="_blank"><font size="2px">我要报名</font></a>
        </div>	
        <div class="search-box">
            <input type="text" name="key" id="textfield" class="input-text" placeholder="请输入搜索关键词">
            <input type="image" src="images/search.png" class="input-submit" />
        </div>
  	  </form>
    </div>
</div>
<!-- detail -->
<div id="detail2-box" class="clearfix">
	<div class="tit-80"><a href="index2.jsp">返回首页</a> - 申请报名</div>  
    <div class="content-box">
    	<h1>残疾人信息申请表</h1>
        <div class="content">
<!-- form -->
<div class="body_main clearfix"> 
		<div id="register" class="register clearfix">
			<form id="form" action="ReqSub" method="post" onSubmit="return check();">
				<div id="form_submit" class="form_submit clearfix">
					<div class="fieldset">
					
					    <div class="field-group">
							<label class="required title">姓名</label>
							<span class="control-group" id="email_input">
								<div class="input_add_long_background">
									<input class="register_input" type="text" id="username" name="username" maxLength="50">
								</div>
							</span>
						</div>
						<div class="field-group">
							<label class="required title">电话</label>
							<span class="control-group" id="mobile_input">
								<div class="input_add_long_background">
									<input class="register_input" type="text" id="mobile" name="mobile" maxLength="11" onblur="__changeUserName('mobile');">
								</div>
							</span>
						</div>
						
						<div class="field-group">
							<label class="required title">性别</label>
							<span class="control-group" id="email_input">
								<div class="input_add_long_background">
                                    <select name="sex" id="sex" class="register_input select-style">
                                      <option value="" selected>--- 选择性别 ---</option>
                                      <option value="男">男</option>
                                      <option value="男">女</option>                                    
                                    </select>
								</div>
							</span>
						</div>
						<div class="field-group">
							<label class="required title">残疾类型</label>
							<span class="control-group" id="email_input">
								<div class="input_add_long_background">
                                    <select name="kind" id="kind" class="register_input select-style">
                                      <option value="" selected>--- 选择残疾类型 ---</option>
                                      <option value="视力残疾">视力残疾</option>
                                      <option value="听力残疾">听力残疾</option>
                                      <option value="肢体残疾">肢体残疾</option>
                                      <option value="智力残疾">智力残疾</option>
                                      <option value="精神残疾">精神残疾</option>
                                      <option value="多重残疾">多重残疾</option>
                                    </select>
								</div>
							</span>
						</div>
        
						<div class="field-group">
						  <label class="required title">情况概述</label>
							<span class="control-group" id="textarea1">
								<textarea name="content" id="content" class="textarea-style"></textarea>
							</span>
						</div>
					</div>
					
				</div>
			  	<div id="div_submit" class="div_submit">
                    <input type="reset" name="reset" id="reset" value="重置" class='button_button disabled'>
                    <input id="submit" type="submit" value="提交" class='button_button disabled'>
				</div>
			</form>
		</div>
</div>

<!-- form end -->
        </div>
    </div>
</div>

<div id="div6">Copyright &copy; 2018 残疾人服务中心 All rights reserved.</div>
<script type="text/javascript">
function __changeUserName(of){
	var username=$('#'+of).val();
		if(username=='' || !isMobilePhone(username)) {
			showTooltips('mobile_input','请输入正确的手机号码');
			return;
		}
}

function check() {
	hideAllTooltips();
	var ckh_result = true;    
	if($('#mobile').val()=='' || !isMobilePhone($('#mobile').val())) {            
		showTooltips('mobile_input','手机号码不正确');
		ckh_result = false;
	}
	return ckh_result;
}

function checkMobilePhone(telphone) {
	if(telphone=='' || !isMobilePhone(telphone)) {
		showTooltips('mobile_input','请输入正确的手机号码');
	}else{
		hideTooltips('mobile_input');
	}
}

function isMobilePhone(value) {
	if(value.search(/^(\+\d{2,3})?\d{11}$/) == -1)
	return false;
	else
	return true;
} 
</script>
</body>
</html>
