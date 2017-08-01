app.controller("coursectrl",function($scope,coursefactory){
//    $scope.courseList;
    $scope.loadCourses=function(){
        var promise=coursefactory.getCourseList();
        promise.then(function(data){
            $scope.courseList=data.data;
            console.log(data);
        },function(er){
            $scope.error=er;
        });
    };

});