app.controller("studentController",function($scope,studentFactory){
   $scope.loadStudentData = function(){
	   var promise = studentFactory.getJson();
	   promise.then(function(data){
		   $scope.studentData = data.data;
		   console.log(data);
	   },function(er){
		   console.log(er);
	   });
	   
   
   };
   
});