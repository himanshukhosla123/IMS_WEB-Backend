app.controller("feeCtrl", function($scope, feeFactory) {
    
    $scope.addFee = function () {
        var promise = feeFactory.addFee($scope.fee);
        promise.then(function (data) {
            $scope.feeList.push(data.data);
            for(x in $scope.fee){
            	$scope.fee[x]="";
            	console.log($scope.fee[x]);
            }
            console.log($scope.fee);
        }, function (er) {
            $scope.error = er;
        });
    };
    
    $scope.readAllFee = function () {
		var promise = feeFactory.readAllFee();
		promise.then(function (data) {
			$scope.feeList = data.data;
            console.log("data : "+data.data);
		}, function (er) {
			$scope.error = er;
		});
	};
    
    $scope.readFee = function (index) {
        var obj = $scope.feeList[index];
        var promise = feeFactory.readFee(obj);
        promise.then(function (data) {
			$scope.feeList = data.data;
            for(x in $scope.fee){
            	$scope.fee[x] = data.data[x];
            	console.log($scope.fee[x]);
            }
		}, function (er) {
			$scope.error = er;
		});
    };
    
    $scope.updateFee = function (index) {
        var obj = $scope.feeList[index];
        var promise = feeFactory.updateFee(obj);
        promise.then(function (data) {
			$scope.feeList[index] = data.data;
            for(x in $scope.fee){
            	$scope.fee[x] = data.data[x];
            	console.log($scope.fee[x]);
            }
		}, function (er) {
			$scope.error = er;
		});
    };
    
    $scope.deleteFee = function (index) {
        var obj = $scope.feeList[index];
        var promise = feeFactory.deleteFee(obj);
        promise.then(function (data) {
			$scope.feeList = data.data;
		}, function (er) {
			$scope.error = er;
		});
    };
});