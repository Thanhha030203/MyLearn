var app = angular.module("myapp",[]);

app.controller("myctrl",function($scope,$http){ 
$scope.product_list = [];
$http.get('data.json').then(function(reponse){ 
    $scope.product_list = reponse.data;
   
});
});
