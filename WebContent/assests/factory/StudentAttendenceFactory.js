app.factory("studentAttendanceFactory", function ($q, $http) {
    var ob = {};
    ob.calling=function(method,obj){
    	var x = $q.defer();
		$http({
			url : "http://localhost:8080/IMS_WORK/student",
			method : "get",
			params : {
				method :method,
				dto	: obj
			}
		}).then(function(data) {
			x.resolve(data);
		}, function(er) {
			x.reject(er);
		});
		return x.promise;
		
    	
    	
    }
/*    ob.addit = function(met, z) {
    	console.log(met+"     "+z);
		var x = $q.defer();
		$http({
			url : "http://localhost:8080/IMS_WORK/student",
			method : "get",
			params : {
				method : met,
				dto	: z
			}
		}).then(function(data) {
			x.resolve(data);
		}, function(er) {
			x.reject(er);
		});
		return x.promise;
	}
   
    
    ob.callTo = function (method) {
        var x = $q.defer();
        $http.get("http://localhost:8080/IMS_WORK/student?method="+method).then(
            function (data) {
                x.resolve(data);
            },
            function (er) {
                x.reject(er);
            });
        return x.promise;
    }
*/   return ob;
});
