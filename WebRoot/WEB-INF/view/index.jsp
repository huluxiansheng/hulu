<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/include/header.jsp" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>    
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>从热爱生活开始</title>
</head>
<body>
	
	
	
	
	<div class="container">
		<div class="jumbotron">
			<h1>欢迎登陆页面！</h1>
			<p>这是一个超大屏幕（Jumbotron）的实例。${user.userName }===${user.userEmail }</p>
			<p><a class="btn btn-primary btn-lg" role="button">学习更多</a>
			</p>
			<p> SESSION：${session}  </p>
		</div>
	</div>
	
	
	<div class="container">
	
	
	</div>
</body>
</html>