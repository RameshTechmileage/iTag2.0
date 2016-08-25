var mainApp = angular.module("mainApp", ['ngRoute']);

mainApp.config(function($routeProvider) {
	$routeProvider
		.when('/dashboard', {
			templateUrl: 'static/pages/dashboard.html',
			controller: 'dashboardController'
		}).when('/home', {
			templateUrl: 'static/pages/home.html',
			controller: 'homeController'
		}).when('/userInfo', {
			templateUrl: 'static/pages/userInfo.html',
			controller: 'userInfoController'
		}).when('/eventInfo', {
			templateUrl: 'static/pages/eventInfo.html',
			controller: 'eventInfoController'
		}).when('/reviewInfo', {
			templateUrl: 'static/pages/reviewInfo.html',
			controller: 'reviewInfoController'
		})
		.otherwise({
			redirectTo: '/dashboard'
		});
});

/*mainApp.controller('StudentController', function($scope, $http) {
	$scope.message = "Click on the hyper link to view the students list.";
	$http.get("https://whispering-woodland-9020.herokuapp.com/getAllBooks")
    .then(function(response) {
      $scope.data = response.data;
    });

	
});
*/
