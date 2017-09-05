
var prodDetailCache = new Array();
$(function(){
	$("#arrow_left").click(function(){
		var index = $(this).attr("index");
		showProductDetail(index);
		index --;
		var prevIndex = index > 0 ? index : 0;
		$(this).attr("index", prevIndex);
		$("#arrow_right").attr("index", prevIndex + 1);
		console.info("left:" + $(this).attr("index") + ",right:" + $("#arrow_right").attr("index"));
	});
	$("#arrow_right").click(function(){
		var prodDetailLen = prodDetailCache.length;
		var index = $(this).attr("index");
		showProductDetail(index);
		index ++;
		var nextIndex = index < prodDetailLen ? index : (prodDetailLen - 1);
		$(this).attr("index", nextIndex);
		$("#arrow_left").attr("index", --nextIndex);
		console.info("left:" + $("#arrow_left").attr("index") + ",right:" + $(this).attr("index"));
	});
	
	$("#closeProductDetail").click(function(){
		$("#moreProd").hide();
	});
	resizeSlider();
});

function showProductDetail(index){
	var data = prodDetailCache[index];
	var nameP = data.nameP;
	var materialNameP = data.materialNameP;
	var materialColorP = data.materialColorP;
	var parameterP = data.parameterP;
	var modelP = data.modelP;
	$("#nameP").text(nameP);
	$("#materialNameP").text(materialNameP);
	$("#materialColorP").text(materialColorP);
	$("#parameterP").text(parameterP);
	$("#modelP").text(modelP);
}

function resizeSlider(){
	var winW = $(window).width();
	var winH = $(window).height();
	var factor;
	if(winW > winH){
		factor = winW * 0.7;
	} else {
		factor = winW;
	}
	var opoWinW = factor * 0.55 / 0.75;
	var opoWinH = factor * 0.65;
	var opoWinTop = (winH - opoWinH) / 2;
	var opoWinLeft = (winW - opoWinW) / 2;
	$("#moreProd").css("position", "absolute");
	$("#moreProd").height(opoWinH);
	$("#moreProd").width(opoWinW);
	$("#moreProd").css("left", opoWinLeft);
	var h = $("#moreProd").height();
	$("#moreProd").css("top", opoWinTop);
	$("#moreProd").css("z-index", 1000);
	
	$(".prod_hotspot").css("position", "absolute");
	$(".prod_hotspot").height(opoWinH * 0.8);
	$(".prod_hotspot").width(opoWinW * 0.8);
	$(".prod_hotspot").css("left", 20);
	$(".prod_hotspot").css("top", 20);
}


$(window).resize(function() {
	setTimeout("resizeSlider()", 500);
});