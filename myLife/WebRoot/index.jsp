<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/include/header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
			<p>这是一个超大屏幕（Jumbotron）的实例。 </p>
			<p><a class="btn btn-primary btn-lg" role="button">学习更多</a>
			</p>
			<form action="<%=contextPath %>/toLogin.life" method="post">
				<div class="form-group">
					<label>用户名称</label>
					<input type="text" name="uName" class="form-control">
				</div>
				<div class="form-group">
					<label>用户密码</label>
					<input type="password" name="uPassword" class="form-control">
				</div>
				<input type="submit" class="btn btn-default" value="提交" >
				<a class="btn btn-link" href="${ctx }/toRegisterPage.life" >注册</a>
			</form>
		</div>
		<p>当早起是一种习惯，世界就是你的。当勤奋是一种习惯，冬天也是热的。--欢迎来到MyLife.</p>
		<p>追求简单而不失优雅。</p>
		<p>网站搭建中……</p>
		<p>你可以先去看看我的新浪微博：<a href="http://weibo.com/happyjinli">oO快乐的小锦鲤Oo</a></p>
	</div>
	
	
	
</body>
</html>