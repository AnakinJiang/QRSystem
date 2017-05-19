<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<%@ taglib prefix="s" uri="/struts-tags"%>
<head>
<meta charset="utf-8">
<title>注册页面</title>
<link rel="stylesheet" href="Client/css/ClientRegisterStyle1.css"  type="text/css">
</head>
<body>
 <header>
   <div class="w12 header">
   <a class="db logo fl"><!-- <img src="Client/img/logo.jpg" width="327" height="94"  alt=""/> --></a>
   <div class="fr logofr"><a href="index.jsp">返回首页</a> |<a>客服中心</a><br>
      如注册遇到问题请拨打：<strong style="font-size:14px;">123456</strong></div>
   </div>
 </header>
 <div class="head_border"></div>
 <section class="w12 login">
 <em class="fr">已经是会员，请&nbsp;&nbsp;<a class="db logbtn fr" href="ClientLogin.jsp">前往登录</a> </em>
 </section>
 <section class="main w12">
   <div class="title"><a class="title1 db fl">顾客</a><a class="title2 db fl">商家</a></div>
   <div class="fr tit2"><span class="arr"></span></div>
   <div ><iframe id="content" src="ClientRegister.jsp" height="600px" width="100%" frameborder="0" ></iframe></div>
 </section>
</body>
</html>