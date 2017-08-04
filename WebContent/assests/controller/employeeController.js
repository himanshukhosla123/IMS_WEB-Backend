app.controller("employeeController",function($scope,employeeFactory){
	
	$scope.loadEmployeeData = function(){
		var promise = employeeFactory.getEmployeeList();
		promise.then(function(data){
			
			$scope.employeeData = data.data;
			console.log(data);
		},function(er){
			console.log(er);
			
		});
	};
	
	
});