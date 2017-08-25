//添加套餐到购物车
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