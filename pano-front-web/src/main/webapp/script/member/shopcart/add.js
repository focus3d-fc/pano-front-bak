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

$(function(){
	
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