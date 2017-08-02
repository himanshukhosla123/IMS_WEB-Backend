app.factory("feeFactory", function($q, $http) {
	var object = {
		getFeeList : function() {
			var pr = $q.defer();
			$http.get("http://localhost:8080/IMS-Backend-own/fee?method=readAllFee").then(function() {
				pr.resolve(data);
			}, function() {
				pr.reject(er);
			});
			return pr.promise;
		}
	}
	return object;
});