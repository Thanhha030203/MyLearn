var app = angular.module("ha",[]).controller("ctrlAdmin",function($scope,$http){ 
    $scope.user_list = [];
    $http.get('user.json').then(function(reponse){ 
        $scope.user_list = reponse.data;
       
    });
 

})

var apps = angular.module("thanhha",[]).controller("ctrlLogin",function($scope,$http){ 
    $scope.user_list_login = [];
    $scope.u = {}
    $http.get('user.json').then(function(reponse){ 
        $scope.user_list_login = reponse.data;
       
    });
    $scope.login= function(user, pass){ 
        console.log(user+"â")
    for( var i=0 ; i <$scope.user_list_login.length ;i++){ 
    
        if(($scope.user_list_login[i].UserName == user ) & ($scope.user_list_login[i].Password == pass))
        $scope.u = angular.copy($scope.user_list_login[i])
    }
}

})