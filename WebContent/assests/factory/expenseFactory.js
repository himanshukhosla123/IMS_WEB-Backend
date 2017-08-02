app.factory("expenseFactory", function($q, $http) {
	var object = {
		getexpenseList : function() {
			var pr = $q.defer();
			$http.get("").then(function() {
				pr.resolve(data);
			}, function() {
				pr.reject(er);
			});
			return pr.promise;
		}
	}
	return object;
});