var ang = angular.module('ang',[]);
ang.controller('thucthi',thuchien);
function thuchien($scope){ 
    $scope.hinh = "images/teo2.jpg";
    $scope.hoten = "Nguyễn Văn Tèo";
    $scope.ngaysinh = "24/3/2004";
    $scope.gt = "Nam";
    $scope.diem = "8.5";
}