app.config(function($routeProvider,$locationProvider){
	$locationProvider.hashPrefix('');
    $routeProvider.when("/",{
        templateUrl:"ims-web/dashboard.html",
//        controller:"homeCtrl"
    }).when("/dashboard",{
        templateUrl:"ims-web/dashboard.html",
//        controller:"homeCtrl"
    }).when("/studentManager",{
        templateUrl:"ims-web/staff/studentManager.html",
        controller:"studentController"
    }).when("/employeeManager",{
        templateUrl:"ims-web/staff/employeeManager.html",
        controller:"employeeController"
    }).when("/feeManagement",{
        templateUrl:"ims-web/accounts/feeManagement.html",
        controller:""
    }).when("/expenses",{
        templateUrl:"ims-web/accounts/expenses.html",
        controller:""
    }).when("/transactions",{
        templateUrl:"ims-web/accounts/transactions.html",
        controller:""
    }).when("/batchManager",{
        templateUrl:"ims-web/coursesAndBatches/BatchManager.html",
        controller:""
    }).when("/courseManager",{
        templateUrl:"ims-web/coursesAndBatches/courseManager.html",
        controller:"coursectrl"
    }).when("/batchAttendance",{
        templateUrl:"ims-web/attendance/batchAttendance.html",
        controller:""
    }).when("/studentAttendance",{
        templateUrl:"ims-web/attendance/studentAttendance.html",
        controller:""
    }).when("/employeeAttendance",{
        templateUrl:"ims-web/attendance/employeeAttendance.html",
        controller:""
    }).when("/enquiry",{
        templateUrl:"ims-web/enquiry.html",
        controller:""
    }).when("/calendar",{
        templateUrl:"ims-web/calendar.html",
        controller:""
    }).when("/reports",{
        templateUrl:"ims-web/reports.html",
        controller:""
    }).when("/mailSms",{
        templateUrl:"ims-web/mailSms.html",
        controller:""
    }).otherwise({template:"Error Page , No Match Found"
        ,redirectTo:"/"});
});