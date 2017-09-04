	
(function($, doc) {
	    var mySwiper = new Swiper ('.swiper-container', {
	        autoplay: 5000,//可选选项，自动滑动
	        loop: true,
	        pagination: '.swiper-pagination',
	    })
    
		$.init();
		$.ready(function() {
			var _getParam = function(obj, param) {
				return obj[param] || '';
			};
			//普通示例
			var userPicker = new $.PopPicker({
				layer : 3
			});
			/*userPicker.setData([{
				value: '2',
				text: '男'
			}, {
				value: '1',
				text: '女'
			}]);*/
			var showProjectPickerButton = doc.getElementById('showProjectPicker');
			//var userResult = doc.getElementById('sexResult');
			var projectResultValue = doc.getElementById('projectResultValue');
			var formObj = $("form");
			showProjectPickerButton.addEventListener('tap', function(event) {
				userPicker.show(function(items) {
					projectResultValue = _getParam(items[0], 'value');
					formObj.submit();
				});
			}, false);
		});
	})(mui, document);
	