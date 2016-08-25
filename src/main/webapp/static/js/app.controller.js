mainApp.controller('dashboardController', function($scope, $http, PageInfoService) {
	$http.get("http://localhost:8080/iTag/dashboardInfo")
    .then(function(response) {
      $scope.dashboardData = response.data;
    });
});
mainApp.controller('homeController', function($scope, $http, PageInfoService) {
	/*$rootscope.message = "Click on the hyper link to view the students list.";
	$rootscope.pageInfo = angular.copy($scope.master);
	$scope.master = {country:"country", lastName:""};*/
	//$http.get("https://whispering-woodland-9020.herokuapp.com/getAllBooks")
	$http.get("http://192.168.0.50:8080/iTag/pageInfo")
    .then(function(response) {
      $scope.data = response.data;
    //	$scope.data = response.data.country;
    });
	$scope.savePageInfo = function () {
		PageInfoService.save($scope.pageInfo);
       // $scope.newcontact = {};
    }
	
});
//mainApp.controller('pageInfoController', function($scope) {
//mainApp.controller('userInfoController', ['$scope', '$http', DataService function($scope, $http) {
mainApp.controller('userInfoController', function ($scope, PageInfoService){
	//$scope.user = PageInfoService;
	$scope.saveUserInfo = function () {
		PageInfoService.saveUser($scope.userInfo);
       // $scope.newcontact = {};
    }
});
mainApp.controller('eventInfoController', function ($scope, PageInfoService){
	$scope.saveEventInfo = function () {
		PageInfoService.saveEventInfo($scope.eventInfo);
    }
});
mainApp.controller('reviewInfoController', function ($scope, $http, PageInfoService){
	$scope.selectedData = PageInfoService.getSelectedDetails();
	$scope.saveDetails = function(){
		//var selectedDataa = new Array();
		$scope.pageName = "atgdf";
		$scope.selectedDataa = PageInfoService.getSelectedDetails();//totalJson:$scope.
		$http.post("http://192.168.0.50:8080/iTag/saveITagData",{selectedDataa:$scope.selectedDataa})
		   .success(function(data, status, headers) {
			   alert("Data added");
		    });
	}
});
