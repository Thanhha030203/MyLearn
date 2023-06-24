var ang = angular.module('bai2',[]);
ang.controller('thucthi',thuchien);
function thuchien($scope){
    $scope.tinh = function (){ 
        var d = parseFloat($scope.dai);
        var r = parseFloat($scope.rong);
        $scope.cv = (d+r)*2;
        $scope.dt = d*r;
    }
}