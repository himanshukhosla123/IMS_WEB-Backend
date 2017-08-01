$(document).ready(AjaxCalls);

function AjaxCalls(){
    $(".ajaxCall").each(function(){
        var data=this.getAttribute("href");
        if(!(data==null||data==="")){
        $(this).removeAttr("href");
        this.setAttribute("role","button");
        this.setAttribute("value",data);}
        
    });
    
 $(".ajaxCall").on("click",function(){
     var path=this.getAttribute("value");
     ajaxCall(path);
     
 });
}

function ajaxCall(url){
    $.ajax({
        url:url,
        success:function(data){
        data+='<script>AjaxCalls();</script>';
        $(".content-wrapper").html(data);
        },
        error:function(){
         $(".content-wrapper").html("<h2 style='text-align:center;'>OOps Sorry! <br/>NOT FOUND</h2>");   
        }
    });
}