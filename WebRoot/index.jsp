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
		<div class="jumbotron" >
			<h5>早起是一种习惯，世界就是你的。勤奋是一种习惯，冬天也是热的。--欢迎来到MyLife.</h5>
			<h5>追求简单而不失优雅。网站搭建中……</h5>
			<h5>这是我的新浪微博：<a href="http://weibo.com/happyjinli" target="_blank" >oO快乐的小锦鲤Oo</a></h5>
		</div>
		<form action="<%=contextPath %>/toLogin.life" method="post">
			<div class="row">
				<div class="col-sm-4">
					<div class="input-group">
						<span class="input-group-addon">用户名称</span>
						<input type="text" name="uName" class="form-control">
					</div>
				</div>
				<div class="col-sm-4">
					<div class="input-group">
						<span class="input-group-addon">用户密码</span>
						<input type="password" name="uPassword" class="form-control">
					</div>
				</div>
				<div class="col-sm-3">
					<button type="button" class="btn btn-default">登录</button>
					<a class="btn btn-link" href="${ctx }/toRegisterPage.life">注册</a>
				</div>
			</div>
		</form>
	</div>
</body>
</html>