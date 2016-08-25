mainApp.service('PageInfoService', function($http) {
	// var uid = 1;

	/*
	 * var pageDetails = [{ id: 0, 'country': '', 'language': '', 'test': '' }];
	 */
	var pageDetails = {};
	var userDetails = {};
	var eventDetails ={};
	var test ={};
	var finalJson = new Array();
	// $scope.finalJson;// = new Array();
	
	this.save = function(pageInfo) {
		pageDetails = pageInfo;
	},
	this.saveUser = function(userInfo) {
		userDetails = userInfo;
	},
	this.saveEventInfo = function(eventInfo) {
		// eventDetails = eventInfo;
		finalJson.push(pageDetails);
		finalJson.push(userDetails);
		finalJson.push(eventInfo);
		// var iTagData = $resource('http://localhost:8080/iTag/saveITagData');
		// iTagData.save();
	}
	this.getSelectedDetails = function(){
		return finalJson;
	}
	/*this.saveDetails = function(){
		$http.post("http://localhost:8080/iTag/saveITagData",{finalJson})
	   .success(function(data, status, headers) {
		   alert("Data added");
	    });
		
	}*/
	/*
	 * return { getSelectedDetails : function () { return finalJson; } }
	 */
	
});