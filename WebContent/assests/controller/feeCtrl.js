app.controller("feeCtrl", function ($scope, feeFactory) {
    
	$scope.onAddMode = function () {
		$scope.addMode = true;
	};
	
	$scope.manageAddorUpdateFee = function () {
		var obj = $scope.fee;
	    if ($scope.doDisable === false && $scope.addMode === true) {
            $scope.addFee(obj);
	    } else if ($scope.doDisable === false && $scope.addMode === false) {
            $scope.updateFee(obj);
	    }
	};
	
    $scope.addFee = function (obj) {
        console.log(obj);
        var promise = feeFactory.addFee(obj);
        promise.then(function (data) {
            $scope.feeList.push(data.data);
        }, function (er) {
            $scope.error = er;
        });
    };
    
    $scope.readAllFee = function () {
		var promise = feeFactory.readAllFee();
		promise.then(function (data) {
			$scope.feeList = data.data;
		}, function (er) {
			$scope.error = er;
		});
	};
    
    $scope.readFee = function (index, doDisable) {
        var obj = $scope.feeList[index];
        var promise = feeFactory.readFee(obj);
        $scope.doDisable = doDisable;
        promise.then(function (data) {
            $scope.fee = data.data;
            for (x in $scope.fee) {
                $scope.fee[x] = data.data[x];
            }
		}, function (er) {
			$scope.error = er;
		});
    };
    
    $scope.updateFee = function (obj) {
        var promise = feeFactory.updateFee(obj);
        promise.then(function (data) {
            $scope.fee = data.data;
            for (x in $scope.fee) {
                $scope.feeList[0] = data.data;
            }
		}, function (er) {
			$scope.error = er;
		});
    };
    
    $scope.deleteFee = function (index) {
        var obj = $scope.feeList[index];
        var promise = feeFactory.deleteFee(obj);
        promise.then(function (data) {
            $scope.feeList.splice(index, 1);
		}, function (er) {
			$scope.error = er;
		});
    };

    $scope.resetFeilds = function () {
        $scope.doDisable = false;
        for (x in $scope.fee) {
            $scope.fee[x] = "";
        }
        $scope.addMode = false;
    };
    
    $scope.isCheque = function () {
        console.log("Payment Mode : ", $scope.fee["paymentMode"]);
        if($scope.fee["paymentMode"] == "Cheque") {
            return true;
        }
        else {
            return true;
        }
    }
    
});