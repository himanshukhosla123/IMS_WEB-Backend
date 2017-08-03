app.factory("coursefactory",function($q,$http){
 var object={
     
     getCourseList:function(){
         var pr=$q.defer();
         $http({
            url:"http://localhost:8080/IMS-WEB__backend/course",
        	method:"get",
        	params:{method:"getuserlist"}
         }).then(function(data){
             pr.resolve(data);
         },function(er){
             pr.reject(er);
         });
         return pr.promise;
     },
     
     addCourse:function(course){
    	 var pr=$q.defer();
         $http({
        	 method:"post",
        	 url:"http://localhost:8080/IMS-WEB__backend/course",
        	 params:{method:'add',
        		     dto_obj:course
        	 }              
         }
         ).then(function(data){
         
             pr.resolve(data);
         },function(er){
             pr.reject(er);
         });
         return pr.promise;
     },
     readCourse:function(course){
    	 var pr=$q.defer();
    	 $http({
        	 method:"post",
        	 url:"http://localhost:8080/IMS-WEB__backend/course",
        	 params:{method:'read',
        		     dto_obj:course
        	         } 
         }).then(function(data){
             pr.resolve(data);
         },function(er){
             pr.reject(er);
         });
         return pr.promise;
     },
     updateCourse:function(course){
    	 var pr=$q.defer();
         console.log(course);
    	 $http({
        	 method:"post",
        	 url:"http://localhost:8080/IMS-WEB__backend/course",
        	 params:{method:'update',
        		     dto_obj:course
        	         } 
         }).then(function(data){
             pr.resolve(data);
         },function(er){
             pr.reject(er);
         });
         return pr.promise;
     },
     deleteCourse:function(course){
    	 var pr=$q.defer();
    	 $http({
        	 method:"post",
        	 url:"http://localhost:8080/IMS-WEB__backend/course",
        	 params:{method:'delete',
        		     dto_obj:course
        	         } 
         }).then(function(data){
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