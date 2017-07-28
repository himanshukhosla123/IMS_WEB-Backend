app.controller("calcctrl",function($scope,calcfactory){
   $scope.do=function(exp){
       $scope.result=calcfactory[exp]($scope.firstNum,$scope.secondNum);
   };
   
});