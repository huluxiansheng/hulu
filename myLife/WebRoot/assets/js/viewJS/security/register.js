/**
 * 发送验证码
 */
$(function(){
	$("#sendV").removeAttr("disabled");
	$("input[name='verifictionCode']").val("");
	$("#sendV").click(function(){
		if(!$("input[name='userEmail']").val()){
			alert("请填写邮箱地址！");
			return false;
		}
		$.post(contextPath+"/toSendVerifictionCode.life",{"userEmail":$("input[name='userEmail'").val()});
		$(this).attr("disabled","disabled");
		sendNum(this,60);
	});
	
});

/**
 * 发送验证码按钮效果
 * @param value
 * @param initTime
 */
function sendNum(value,initTime){
	t = setTimeout(function(){sendNum(value,initTime)}, 1000);
	if(initTime == 0){
		$(value).removeAttr("disabled");
		$(value).text("发送验证码");
		initTime = 60;
		clearTimeout(t);
	}else{
		$(value).attr("disabled","disabled");
		$(value).text(initTime+"秒后重发");
		initTime--;
	}
}

/**
 * 注册
 */
$(function(){
	$("#regBtn").click(function(){
		if(!$("input[name='userName']").val()){
			alert("注册账号不能为空！");
			return false;
		}
		if(!$("input[name='userEmail']").val()){
			alert("请填写邮箱地址！");
			return false;
		}
		if(!$("input[name='verifictionCode']").val()){
			alert("验证码不能为空！");
			return false;
		}
	});
});





$(function(){
	$("#queryList").click(function(){
		$('#table').bootstrapTable({
		    url: contextPath+'/findUserList.life',
		    columns: [{
		        field: 'userId',
		        title: '用户ID'
		    }, {
		        field: 'userName',
		        title: '用户名称'
		    }, {
		        field: 'userCreateTime',
		        title: '创建时间'
		    }, {
		        title: '操作',
		        formatter: function(value,row,index){
		        	return '<a href="deleteUser.life?userId='+row.userId+'">删除</a>';
		        }
		    }, ]
		});
	});

});










