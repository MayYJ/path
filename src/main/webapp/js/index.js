$(function(){
    // $("#container").css("background-color","yellow");
    $(".pro1").click(function(){
        $(".info").animate({right:'20px'});
        $(".info1").animate({right:'-1000px'});
        $(".info2").animate({right:'-1000px'});
        $(".info3").animate({right:'-1000px'});
    });
    $(".cancel1").click(function(){
        $(".info").animate({right:'20px'});
        $(".info1").animate({right:'-1000px'});
        $(".info2").animate({right:'-1000px'});
        $(".info3").animate({right:'-1000px'});
    });
    $(".sure").click(function(){
        $(".info").animate({right:'-1000px'});
        $(".info1").animate({right:'20px'});
        $(".info2").animate({right:'-1000px'});
        $(".info3").animate({right:'-1000px'});
    });
    $(".sure1").click(function(){
        $(".info").animate({right:'-1000px'});
        $(".info2").animate({right:'20px'});
        $(".info1").animate({right:'-1000px'});
        $(".info3").animate({right:'-1000px'});
    });
    $(".sure2").click(function(){
        $(".info").animate({right:'-1000px'});
        $(".info3").animate({right:'20px'});
        $(".info1").animate({right:'-1000px'});
        $(".info2").animate({right:'-1000px'});
    });
    $(".cancel2").click(function(){
        $(".info").animate({right:'-1000px'});
        $(".info1").animate({right:'20px'});
        $(".info2").animate({right:'-1000px'});
        $(".info3").animate({right:'-1000px'});
    });
    $(".cancel3").click(function(){
        $(".info").animate({right:'-1000px'});
        $(".info1").animate({right:'-1000px'});
        $(".info2").animate({right:'20px'});
        $(".info3").animate({right:'-1000px'});
    });
    $(".pro4").click(function(){
        $(".info3").animate({right:'20px'});
        $(".info1").animate({right:'-1000px'});
        $(".info2").animate({right:'-1000px'});
        $(".info").animate({right:'-1000px'});
    });

});