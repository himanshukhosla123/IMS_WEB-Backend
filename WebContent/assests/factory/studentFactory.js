app.factory("studentFactory",function($http,$q){
	console.log("Asynch call");
	
   var object={
		   
		 getJson:function(){
			
			 var pr = $q.defer();
			 $http.get("http://localhost:8080/IMS-WEB_master/StudentController?function=read").then(function(data){
				 pr.resolve(data);
			 },function(er){
				 pr.reject(er);
			 
			 });
			  return pr.promise;  
		}  
		   
   };
    	
    return object;
});