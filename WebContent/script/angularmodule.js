/**
 * 
 */
var  mod=angular.module("mymod",[]);

mod.controller("mycontroller",function($scope,$http)
		{
	alert("controller loaded");
	 $http.get("CustomerListEmitter").then(function(response)
			 {
	    	
	        $scope.customers = response.data;
	        
	    });
	 
	 $scope.update=function(cif){
		alert($scope.a); 
		$http.get("CustomerEmitter?cif="+$scope.cif).then(function(response)
				 {
		    	
		        $scope.customers = response.data;
		        alert("data received");
		    });
		 
	 };
		});
	
		 

	