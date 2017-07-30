app.factory("calcfactory",function(){
   var object={};
    object.add=function(firstNo,secondNo){
       return parseInt(firstNo)+parseInt(secondNo);
   };
    
   object.subtract=function(firstNo,secondNo){
       return parseInt(firstNo)-parseInt(secondNo);
   };
    
   object.multiply=function(firstNo,secondNo){
       return parseInt(firstNo)*parseInt(secondNo);
   };
    
   object.divide=function(firstNo,secondNo){
       return parseInt(firstNo)/parseInt(secondNo);
   };
    return object;
});