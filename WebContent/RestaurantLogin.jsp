<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML>
<html>
<head>
<title>商家登录页面</title>
<!-- Restaurant Theme files -->
<link href="Restaurant/css/RestaurantLoginStyle.css" rel="stylesheet" type="text/css" media="all"/>
<!-- Restaurant Theme files -->
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /> 
<meta name="keywords" content="Login form web template, Sign up Web Templates, Flat Web Templates, Login signup Responsive web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<link href="commonCSS/fileinput.css" media="all" rel="stylesheet" type="text/css" />
<link rel="stylesheet" href="commonCSS/bootstrap-3.3.5-dist/css/bootstrap.css" type="text/css" />
<link rel="stylesheet" href="Client/css/font-awesome.min.css" type="text/css" />
</head>

<body style="font-family: Microsoft JhengHei">
<div class="login">
	<h2></h2>
	<div class="login-top">
		<h1>登录页面</h1>
		<div class="tip">
			<s:property value="#request.tip" />
		</div>
		<div class="tip">
			<s:fielderror/>
		</div> 
		<form  action="RestaurantLogin" method="post">
			<input type="text"  name="Restaurant.ID" placeholder="User Id">
			<input type="password"   name="Restaurant.password" placeholder="Password">
	    <div class="forgot">
	    	<input type="submit" value="登录" >
	    </div>
	    </form>
	</div>
	<div class="login-bottom-Restaurant">
		<h3>没有账号？&nbsp;<a href="RestaurantRegisterHome.jsp">点此注册</a></h3>
	</div>
</div>	
<div class="copyright">
	<p>Copyright &copy;</p>
</div>
<script src="commonJS/jquery.min.js" type="text/javascript"></script>
<script src="commonJS/fileinput.js" type="text/javascript"></script>	
<script src="commonJS/fileinput_locale_zh.js" type="text/javascript"></script>
<script src="commonCSS/bootstrap-3.3.5-dist/js/bootstrap.js" type="text/javascript"></script>
<script>
	    $("#file-0").fileinput({
	        'allowedFileExtensions' : ['jpg','jpeg', 'png','gif'],
	        maxFilesNum: 10,
	    });
	    $("#file-1").fileinput({
	        uploadUrl: '#', // you must set a valid URL here else you will get an error
	        allowedFileExtensions : ['jpeg', 'jpg', 'png','gif'],
	        overwriteInitial: false,
	        maxFilesNum: 10,
	        //allowedFileTypes: ['image', 'video', 'flash'],
	        slugCallback: function(filename) {
	            return filename.replace('(', '_').replace(']', '_');
	        }
		});
	    /*
	    $(".file").on('fileselect', function(event, n, l) {
	        alert('File Selected. Name: ' + l + ', Num: ' + n);
	    });
	    */
		$("#file-3").fileinput({
			showUpload: false,
			showCaption: false,
			browseClass: "btn btn-primary btn-lg",
			fileType: "any",
	        previewFileIcon: "<i class='glyphicon glyphicon-king'></i>"
		});
		$("#file-4").fileinput({
			uploadExtraData: {kvId: '10'}
		});
	    $(".btn-warning").on('click', function() {
	        if ($('#file-4').attr('disabled')) {
	            $('#file-4').fileinput('enable');
	        } else {
	            $('#file-4').fileinput('disable');
	        }
	    });    
	    $(".btn-info").on('click', function() {
	        $('#file-4').fileinput('refresh', {previewClass:'bg-info'});
	    });
	    /*
	    $('#file-4').on('fileselectnone', function() {
	        alert('Huh! You selected no files.');
	    });
	    $('#file-4').on('filebrowse', function() {
	        alert('File browse clicked for #file-4');
	    });
	    */
	    $(document).ready(function() {
	        $("#test-upload").fileinput({
	            'showPreview' : false,
	            'allowedFileExtensions' : ['jpg', 'png','gif'],
	            'elErrorContainer': '#errorBlock'
	        });
	        /*
	        $("#test-upload").on('fileloaded', function(event, file, previewId, index) {
	            alert('i = ' + index + ', id = ' + previewId + ', file = ' + file.name);
	        });
	        */
	    });
</script>
</body>
</html>