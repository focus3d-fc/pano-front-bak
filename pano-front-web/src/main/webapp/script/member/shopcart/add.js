//全景里面点击套餐，添加套餐到购物车
function addToShopcar(packageSn){
	var panoDomain = $("#panoDomain").val();
	$.ajax({
	    url: panoDomain + "/shopcart/add",
	    type:'GET',
	    async:false,
	    timeout:5000,
	    dataType: "json",
	    data:{
	    	packageEncryptSn : packageSn
	    },
	    success:function(data){
	    	var status = data.status;
	    	if(status == 1){
	    		alert("添加至购物车");
	    	} else {
	    		alert("从购物车删除");
	    	}
	    },
	    error:function(xhr,textStatus){
	    	if(xhr.getResponseHeader('sessionstatus') === "timeout"){
	    		window.location.href = "/member/login/nomal";
	    	}
	    }
	});
}

var totalPrice = 0.0;
$(function(){
	$("input[id^='selectItem_']").click(function(){
		var status = $(this).attr("status");
		var price = parseFloat($(this).attr("price"));
		if(!status || status == 0){
			$(this).attr("status", 1);
			totalPrice += price;
		} else {
			$(this).attr("status", 0);
			$(this).attr("checked", false);
			$("#selectAll").attr("checked", false);
			$("#selectAll").attr("status", 0);
			totalPrice -= price;
		}
		$("#totalPrice").text(totalPrice);
	});
	
	$("#selectAll").click(function(){
		totalPrice = 0.0;
		var status = $(this).attr("status");
		if(!status || status == 0){
			$(this).attr("status", 1);
			$("input[id^='selectItem_']").prop('checked', true);
			$("input[id^='selectItem_']").attr("status", 1);
			$("input[id^='selectItem_']").each(function(){
				var price = parseFloat($(this).attr("price"));
				totalPrice += price;
			});
		} else {
			$(this).attr("status", 0);
			$(this).attr("checked", false);
			$("input[id^='selectItem_']").prop('checked', false);
			$("input[id^='selectItem_']").attr("status", 0);
			$("input[id^='selectItem_']").each(function(){
				var price = parseFloat($(this).attr("price"));
				totalPrice -= price;
			});
		}
		$("#totalPrice").text(totalPrice);
	});
	
	$("a[id^='closeOrOpen_']").click(function(){
		var status = $(this).attr("status");
		if(!status || status == 0){
			$(this).parent().prev().show(200);
			$(this).text("");
			$(this).append("点击收起 <i class='iconfont'>&#xe60c;</i>");
			$(this).attr("status", 1);
		} else {
			$(this).parent().prev().hide(200);
			$(this).text("");
			$(this).append("点击展开 <i class='iconfont'>&#xe612;</i>");
			$(this).attr("status", 0);
		}
	});
	
	
	$("#addToOrder").click(function(){
		var packageSns = "";
		$("input[id^='selectItem']:checked").each(function(){
			packageSns += $(this).val() + ",";
		});
		if(!packageSns){
			alert("请选择一个套餐");
		} else {
			$("#packageSns").val(packageSns);
			$("form").submit();
		}
	});
});