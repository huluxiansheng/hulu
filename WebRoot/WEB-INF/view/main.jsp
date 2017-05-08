<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/include/header.jsp" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>    
<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.12.1/js/bootstrap-select.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.12.1/css/bootstrap-select.min.css">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>从热爱生活开始</title>

<script type="application/javascript">
	
	$(function(){
		$('.selectpicker').selectpicker({
			style: "btn-default",
			size: 4,
			width: 80
		});
	});
</script>
</head>
<body>
	<div class="container">
		<div class="jumbotron">
			<form action="${ctx}/d">
				<div class="row">
					<div class="col-xs-4 text-right">
						<select class="selectpicker" name="">
							<option value="">类型</option>
							<c:forEach items="${mtList }" var="v">
								<option value="${v.typeId }">${v.typeName }</option>
							</c:forEach>
						</select>
					</div>
					<div class="col-xs-4">
						<div class="input-group">
							<span class="input-group-addon">￥</span>
							<input type="text" class="form-control" name=""/>
						</div>
					</div>
					<div class="col-xs-4 text-left">
						<div class="btn-group">
							<button type="submit" class="btn btn-default">
								计入
								<span class="glyphicon glyphicon-pencil"></span>
							</button>
						</div>
					</div>
				</div>
			</form>
		</div>
	</div>
</body>
</html>