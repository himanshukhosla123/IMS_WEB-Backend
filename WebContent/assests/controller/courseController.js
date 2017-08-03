app.controller("coursectrl",function($scope,coursefactory){

	
    $scope.loadCourses=function(){
        var promise=coursefactory.getCourseList();
        promise.then(function(data){
            $scope.courseList=data.data;
            console.log(data);
        },function(er){
            $scope.error=er;
        });
    };
    $scope.addCourse=function(){
        var promise=coursefactory.addCourse($scope.course);
        promise.then(function(data){
            console.log(data);
            $scope.courseList.push(data.data);
            
            for(x in $scope.course){
            	$scope.course[x]="";
            	console.log($scope.course[x]);
            }
            console.log($scope.course);
        },function(er){
            $scope.error=er;
        });
    };
    $scope.updateCourse=function(index){
    	var dto_obj=$scope.courseList[index];
        var promise=coursefactory.updateCourse(dto_obj);
        promise.then(function(data){
            $scope.courseList[index]=data.data;
            console.log(data);
            for(x in $scope.course){
            	$scope.course[x]=data.data[x];
            	console.log($scope.course[x]);
            }
        },function(er){
            $scope.error=er;
        });
    };
    $scope.readCourse=function(index){
        var dto_obj=$scope.courseList[index];
        console.log(dto_obj);
        var promise=coursefactory.readCourse(dto_obj);
        promise.then(function(data){
            $scope.course=data.data;
            for(x in $scope.course){
            	$scope.course[x]=data.data[x];
            	console.log($scope.course[x]);
            }
            console.log(data);
        },function(er){
            $scope.error=er;
        });
    };
    $scope.deleteCourses=function(index){
    	var dto_obj=$scope.courseList[index];
        var promise=coursefactory.deleteCourse(dto_obj);
        promise.then(function(data){
//            $scope.courseList=$scope.courseList.filter(fuction(obj){ return (obj["courseId"]!=dto_obj["courseId"]);});
        },function(er){
            $scope.error=er;
        });
    };
    
    
    

});