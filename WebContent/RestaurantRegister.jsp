<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<%@ taglib prefix="s" uri="/struts-tags"%>
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="Restaurant/css/Basicstyle.css"
	type="text/css">
<script src="Restaurant/js/checkreginfo.js" type="text/javascript"></script>
<script type="text/javascript">
	document.createElement("section");
	document.createElement("article");
	document.createElement("footer");
	document.createElement("header");
	document.createElement("hgroup");
	document.createElement("nav");
	document.createElement("menu");
</script>
<link rel="stylesheet" type="text/css" href="Restaurant/css/component.css" />
<sx:head />
</head>
<body>

	&nbsp;&nbsp;
	<div class="container">
		<!-- Top Navigation -->


		<div class="main clearfix"></div>

		<s:property value="#request.tip" />
		<div class="inputsec">
			<form action="RestaurantRegister" id="basic" method="post">
				<ul>
					<li><label class="fl mr2">用户名：</label> <input type="text"
						onblur="checkid(this.value.toString())" tabindex="3"
						name="restaurant.ID" id="id" autocomplete="off" maxlength="20"
						style="ime-mode: disabled" class="txt-m fl " 
						onClick="if(value==defaultValue){value='';this.style.color='#333'}">
						<div class="msg-error" id="idErr">
							<s:fielderror>
								<s:param>restaurant.ID</s:param>
							</s:fielderror>
						</div></li>

					<li><label class="fl mr2">密码：</label> <input type="password"
						onblur="checkpw(this.value.toString())" tabindex="3"
						name="restaurant.password" id="pw" autocomplete="off"
						maxlength="20" onfocus="usercenter_check.hide_note('tel-tip')"
						style="ime-mode: disabled" class="txt-m fl " value=""
						onClick="if(value==defaultValue){value='';this.style.color='#333'}">
						<div class="msg-error" id="pwErr">
							<s:fielderror>
								<s:param>restaurant.password</s:param>
							</s:fielderror>
						</div></li>

					<li><label class="fl mr2">确认密码：</label> <input type="password"
						onblur="checkrpw(this.value.toString())" tabindex="3"
						name="restaurant.confirmPassword" id="rpw" autocomplete="off"
						maxlength="20" onfocus="usercenter_check.hide_note('tel-tip')"
						style="ime-mode: disabled" class="txt-m fl " value=""
						onClick="if(value==defaultValue){value='';this.style.color='#333'}">
						<div class="msg-error" id="rpwErr">
							<s:fielderror>
								<s:param>restaurant.confirmPassword</s:param>
							</s:fielderror>
						</div></li>

					<li><label class="fl mr2">店名：</label> <input type="text"
						onblur="checkun(this.value)" tabindex="3"
						name="restaurant.name" id="tel" autocomplete="off"
						maxlength="20" onfocus="usercenter_check.hide_note('tel-tip')"
						onblur="usercenter_check.check_tel()" style="ime-mode: disabled"
						class="txt-m fl " 
						onClick="if(value==defaultValue){value='';this.style.color='#333'}">
						<div class="msg-error" id="unErr">
							<s:fielderror>
								<s:param>restaurant.name</s:param>
							</s:fielderror>
						</div></li>
						
					<li><label class="fl mr2">菜式：</label> 
					<s:select name="restaurant.foodType" list="{'川菜','粵菜'}"></s:select></li>
					
					<li><label class="fl mr2">2人桌：</label> <input type="text"
						onblur="checknum1(this.value)" tabindex="3"
						name="restaurant.A" id="num1" autocomplete="off"
						maxlength="20" onfocus="usercenter_check.hide_note('tel-tip')"
						onblur="usercenter_check.check_tel()" style="ime-mode: disabled"
						class="txt-m fl " 
						onClick="if(value==defaultValue){value='';this.style.color='#333'}">
						<div class="msg-error" id="num1Err">
							<s:fielderror>
								<s:param>restaurant.A</s:param>
							</s:fielderror>
						</div></li>
						
					<li><label class="fl mr2">3~4人桌：</label> <input type="text"
						onblur="checknum2(this.value)" tabindex="3"
						name="restaurant.B" id="num2" autocomplete="off"
						maxlength="20" onfocus="usercenter_check.hide_note('tel-tip')"
						onblur="usercenter_check.check_tel()" style="ime-mode: disabled"
						class="txt-m fl "
						onClick="if(value==defaultValue){value='';this.style.color='#333'}">
						<div class="msg-error" id="num2Err">
							<s:fielderror>
								<s:param>restaurant.B</s:param>
							</s:fielderror>
						</div></li>
											<li><label class="fl mr2">5~8人桌：</label> <input type="text"
						onblur="checknum3(this.value)" tabindex="3"
						name="restaurant.C" id="num3" autocomplete="off"
						maxlength="20" onfocus="usercenter_check.hide_note('tel-tip')"
						onblur="usercenter_check.check_tel()" style="ime-mode: disabled"
						class="txt-m fl " 
						onClick="if(value==defaultValue){value='';this.style.color='#333'}">
						<div class="msg-error" id="num3Err">
							<s:fielderror>
								<s:param>restaurant.C</s:param>
							</s:fielderror>
						</div></li>
											<li><label class="fl mr2">8人以上桌：</label> <input type="text"
						onblur="checknum4(this.value)" tabindex="3"
						name="restaurant.D" id="num4" autocomplete="off"
						maxlength="20" onfocus="usercenter_check.hide_note('tel-tip')"
						onblur="usercenter_check.check_tel()" style="ime-mode: disabled"
						class="txt-m fl " 
						onClick="if(value==defaultValue){value='';this.style.color='#333'}">
						<div class="msg-error" id="num4Err">
							<s:fielderror>
								<s:param>restaurant.D</s:param>
							</s:fielderror>
						</div></li>

											<li><label class="fl mr2">平均等待時間（分）：</label> <input type="text"
						onblur="checktime(this.value)" tabindex="3"
						name="restaurant.time" id="time" autocomplete="off"
						maxlength="20" onfocus="usercenter_check.hide_note('tel-tip')"
						onblur="usercenter_check.check_tel()" style="ime-mode: disabled"
						class="txt-m fl "
						onClick="if(value==defaultValue){value='';this.style.color='#333'}">
						<div class="msg-error" id="timeErr">
							<s:fielderror>
								<s:param>restaurant.time</s:param>
							</s:fielderror>
						</div></li>
					<li class="clr"><label class="db fl">&nbsp;</label><input
						type="submit" class="db fl next" value="完成注册" /></li>
				</ul>
			</form>
		</div>
	</div>

	</div>

	<!-- classie.js by @desandro: https://github.com/desandro/classie -->
	<script src="Restaurant/js/classie.js"></script>
	<script src="Restaurant/js/modalEffects.js"></script>

	<!-- for the blur effect -->
	<!-- by @derSchepp https://github.com/Schepp/CSS-Filters-Polyfill -->
	<script>
		// this is important for IEs
		var polyfilter_scriptpath = '/js/';
	</script>
	<script src="Restaurant/js/cssParser.js"></script>
	<script src="Restaurant/js/css-filters-polyfill.js"></script>
</body>
</html>