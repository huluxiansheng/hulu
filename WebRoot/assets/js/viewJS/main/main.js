/**
 * 主页版面
 */
	

$(function(){
	$('.selectpicker').selectpicker({
		style: "btn-default",
		size: 4,
		width: 80
	});
});

$(function(){
	$("#addMoney").click(function(){
		if(!$("select option:selected").val()){
			alert("请选择类型！");
			return false;
		}
		if(!$("input[name='spendMoney']").val()){
			alert("请填入金额！");
			return false;
		}
		$.post(contextPath+"/main/insertSpend.life",$("#formId").serializeObject(),function(data){
			if(!data.length){
				alert("添加成功！");
			}
		});
	});
});
