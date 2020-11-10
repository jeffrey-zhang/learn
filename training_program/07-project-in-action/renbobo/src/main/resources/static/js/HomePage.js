$(function(){
		$(".title li").click(function(){
//            var $this=$(this);
//            alert($this.index());
			$(this).addClass("active").siblings().removeClass("active");
			$("#content .mod").eq($(".title li").index(this)).show().siblings("#content .mod").hide();
		});
	});


