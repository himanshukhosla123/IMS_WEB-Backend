app.controller("expenseCtrl", function($scope, expenseFactory) {
	$scope.loadExpense = function() {
		var promise = feeFactory.getFeeList();
		promise.then(function(data) {
			$scope.expenseList = data.data;
		}, function(er) {
			$scope.error = er;
		});
	}
});