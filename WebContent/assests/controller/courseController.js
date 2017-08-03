app.controller("coursectrl",function($scope,coursefactory){

     
    $scope.loadCourses=function(){
        var promise=coursefactory.getCourseList();
        promise.then(function(data){
            $scope.courseList=data.data;
        },function(er){
            $scope.error=er;
        });
    };
    $scope.addCourse=function(dto_obj){
        console.log(dto_obj);
        var promise=coursefactory.addCourse(dto_obj);
        promise.then(function(data){
            $scope.courseList.push(data.data);
            console.log($scope.course);
        },function(er){
            $scope.error=er;
        });
    };
    $scope.updateCourse=function(dto_obj){
        console.log(dto_obj);
        var promise=coursefactory.updateCourse(dto_obj);
        promise.then(function(data){
            $scope.courseList[0]=data.data;
            console.log(data);
        },function(er){
            $scope.error=er;
        });
    };
    $scope.readCourse=function(index,doDisable){
        $scope.doDisable=doDisable;
        var dto_obj=$scope.courseList[index];
        var promise=coursefactory.readCourse(dto_obj);
        promise.then(function(data){
            $scope.course=data.data;
            for(x in $scope.course){
            	$scope.course[x]=data.data[x];
            }
        },function(er){
            $scope.error=er;
        });
    };
    $scope.deleteCourse=function(index){
    	var dto_obj=$scope.courseList[index];
        var promise=coursefactory.deleteCourse(dto_obj);
        
            console.log("Calling delete course");
        promise.then(function(data){
          $scope.courseList.splice(index,1);
         console.log($scope.courseList);
        },function(er){
            $scope.error=er;
        });
    };
    
    $scope.resetFeilds=function(){   
     $scope.doDisable=false;  
    for(x in $scope.course){
            	$scope.course[x]="";
    }
    $scope.addMode=false;    
    };
    
    $scope.onAddMode=function(){
        $scope.addMode=true;
        
    };
    
    $scope.manageAddorUpdateCourse=function(){
        var dto_obj=$scope.course;
        if($scope.doDisable===false&&$scope.addMode===true){
           $scope.addCourse(dto_obj);
            console.log("calling add course")
        }
        else if($scope.doDisable===false&&$scope.addMode===false){
            $scope.updateCourse(dto_obj);
            console.log("Calling update course");
        }
        $scope.resetFeilds();
    }

});