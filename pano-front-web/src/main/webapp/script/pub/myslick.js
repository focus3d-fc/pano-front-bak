

$(function(){
	$('.regular').slick({
		  dots: false,
		  infinite: false,
		  speed: 10,
		  fade: false,
		  autoplay: false,
	      autoplaySpeed: 10
	});
	resizeSlider();
});
function resizeSlider(){
	var winW = $(window).width();
	var winH = $(window).height();
	var factor;
	if(winW > winH){
		factor = winW * 0.7;
	} else {
		factor = winW;
	}
	var opoWinW = factor * 0.65 / 0.75;
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
	
	$("section").css("position", "absolute");
	$("section").height(opoWinH);
	$("section").width(opoWinW);
	$('.regular').slick('slickGoTo', 0);
}


$(window).resize(function() {
	setTimeout("resizeSlider()", 500);
});