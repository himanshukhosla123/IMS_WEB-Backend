app.factory("feeFactory", function ($q, $http) {
	var object = {
		
		addFee : function (fee) {
			var pr = $q.defer();
			$http({
				method : "post",
				url : "http://localhost:8080/IMS-Backend-own/fee",
				params : {
					method : "add",
					dto_obj : fee
				}
			}).then(function (data) {
				pr.resolve(data);
			}, function (er) {
				pr.reject(er);
			});
			return pr.promise;
		},
		
		readAllFee : function () {
			var pr = $q.defer();
			$http({
				method : "get",
				url : "http://localhost:8080/IMS-Backend-own/fee",
				params : {
					method : "readAll"
				}
			}).then(function (data) {
				pr.resolve(data);
			}, function (er) {
				pr.reject(er);
			});
			return pr.promise;
		},
		
		readFee : function (fee) {
			var pr = $q.defer();
			$http({
				method : "post",
				url : "http://localhost:8080/IMS-Backend-own/fee",
				params : {
					method : "read",
					dto_obj : fee
				}
			}).then(function (data) {
				pr.resolve(data);
			}, function (er) {
				pr.reject(er);
			});
			return pr.promise;
		},
		
		updateFee : function (fee) {
			var pr = $q.defer();
			$http({
				method : "post",
				url : "http://localhost:8080/IMS-Backend-own/fee",
				params : {
					method : "update",
					dto_obj : fee
				}
			}).then(function (data) {
				pr.resolve(data);
			}, function (er) {
				pr.reject(er);
			});
			return pr.promise;
		},
		
		deleteFee : function (fee) {
			var pr = $q.defer();
			$http({
				method : "post",
				url : "http://localhost:8080/IMS-Backend-own/fee",
				params : {
					method : "delete",
					dto_obj : fee
				}
			}).then(function (data) {
				pr.resolve(data);
			}, function (er) {
				pr.reject(er);
			});
			return pr.promise;
		}
		
	};
	return object;
});