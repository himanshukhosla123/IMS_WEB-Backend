app.factory("coursefactory",function($q,$http){
 var object={
     
     getCourseList:function(){
         var pr=$q.defer();
         $http.get("http://localhost:8080/IMS-WEB__backend/Course?method=getuserlist").then(function(data){
             pr.resolve(data);
         },function(er){
             pr.reject(er);
         });
         return pr.promise;
     }
 };
    console.log("server call");
    return object;
});