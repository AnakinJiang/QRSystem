<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<%@ taglib prefix="s" uri="/struts-tags"%>
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="Client/css/Basicstyle.css"
	type="text/css">
<script src="Client/js/checkreginfo.js" type="text/javascript"></script>
<link rel="stylesheet" type="text/css" href="Client/css/component.css" />
</head>
<body>
	<div class="container">
		<div class="main clearfix"></div>
		<div class="md-overlay"></div>
		<div class="inputsec">
			<form action="ClientRegister" id="basic" method="post">
				<ul>
					<li><label class="fl mr2">手机号：</label> <input type="text" tabindex="3"
						name="client.ID" id="id" autocomplete="off"
						value="请输入11位手机号"
						maxlength="11" style="ime-mode:disabled" class="txt-m fl "
						onClick="if(value==defaultValue){value='';this.style.color='#333'}">
						<div class="msg-error" id="idErr">
							<s:fielderror fieldName="client.ID" />
						</div></li>

					<li><label class="fl mr2">密码：</label> <input type="password" tabindex="3"
						name="client.password" id="pw" autocomplete="off"
						maxlength="20" onfocus="usercenter_check.hide_note('tel-tip')"
						style="ime-mode:disabled" class="txt-m fl " 
						onClick="if(value==defaultValue){value='';this.style.color='#333'}">
						<div class="msg-error" id="pwErr">
							<s:fielderror fieldName="client.password" />
						</div></li>

					<li><label class="fl mr2">确认密码：</label> <input type="password"
						onblur="checkrpw(this.value.toString())" tabindex="3"
						name="client.confirmPassword" id="rpw" autocomplete="off"
						maxlength="20" onfocus="usercenter_check.hide_note('tel-tip')"
						style="ime-mode:disabled" class="txt-m fl " 
						onClick="if(value==defaultValue){value='';this.style.color='#333'}">
						<div class="msg-error" id="rpwErr">
							<s:fielderror fieldName="client.confirmPassword" />
						</div></li>

					<li><label class="fl mr2">姓名：</label> <input type="text" tabindex="3"
						name="client.name" id="tel" autocomplete="off"
						maxlength="20" onfocus="usercenter_check.hide_note('tel-tip')"
						onblur="usercenter_check.check_tel()" style="ime-mode:disabled"
						class="txt-m fl " 
						onClick="if(value==defaultValue){value='';this.style.color='#333'}">
						<div class="msg-error" id="unErr">
							<s:fielderror fieldName="client.name" />
						</div> </li>
						
					<li class="clr"><label class="db fl">&nbsp;</label><input
						type="submit" class="db fl next" value="完成注册" /></li>
				</ul>
			</form>
		</div>
	</div>

	</div>

	<!-- classie.js by @desandro: https://github.com/desandro/classie -->
	<script src="Client/js/classie.js"></script>
	<script src="Client/js/modalEffects.js"></script>

	<!-- for the blur effect -->
	<!-- by @derSchepp https://github.com/Schepp/CSS-Filters-Polyfill -->
	<script>
		// this is important for IEs
		var polyfilter_scriptpath = '/js/';
	</script>
	<script src="Client/js/cssParser.js"></script>
	<script src="Client/js/css-filters-polyfill.js"></script>
</body>
</html>