app.controller("feeCtrl", function($scope, feeFactory) {
	$scope.loadFee = function() {
		var promise = feeFactory.getFeeList();
		promise.then(function(data) {
			$scope.feeList = data.data;
		}, function(er) {
			$scope.error = er;
		});
	}
});