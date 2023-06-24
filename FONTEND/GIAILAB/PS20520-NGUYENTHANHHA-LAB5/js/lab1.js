var app = angular.module("Thanhha", []);
app.controller("ha1", function ($scope) {
    $scope.Save = function () {
        $scope.Thongbaoht = (($scope.Students.Subject.name == null) ? "Vui lòng điền vào họ và tên" : "");
        $scope.Thongbaob = (($scope.Students.Subject.brith == null) ? "Vui lòng điền ngày sinh" : "")
        $scope.Thongbaom = (($scope.Students.Subject.mark == null) ? "Vui lòng điền điểm số" : ($scope.hl = (($scope.mark <= 10) & ($scope.mark >= 0) ? (($scope.mark >= 5) ? "Đậu" : "Rớt") : "Lỗi (Điểm là con số và nằm trong khoảng 0-10)")
        ))
        $scope.$parent.Students.Subjects[$scope.$parent.index] = $scope.Students.Subject
    }
    $scope.Cancle = function () {
        $scope.$parent.Students.Subject = ($scope.$parent.Students.Subjects[$scope.$parent.index])
    }
}
)
app.controller("ha2", function ($scope) {
    $scope.$parent.Students = {
        Subjects: [
            { name: "Nguyễn Văn Tèo", brith: "20-01-1995", mark: 8.5 },
            { name: "Phạm Thị Nở", brith: "15-11-1985", mark: 9.0 },
            { name: "Hồ Xuân Hương", brith: "15-11-1985", mark: 7.3 }
        ]
    }
    $scope.edit = function (index) {
        $scope.$parent.index = index;
        $scope.$parent.Students.Subject = ($scope.$parent.Students.Subjects[index])
    }
}
)
var apps = angular.module("thanhha", []);
apps.controller("ha1", function ($scope) {
    $scope.Subject = {};
    $scope.index = -1;

    $scope.Students = {
        Subjects: [
            { name: "Nguyễn Văn Tèo", brith: "20-01-1995", mark: 8.5 },
            { name: "Phạm Thị Nở", brith: "15-11-1985", mark: 9.0 },
            { name: "Hồ Xuân Hương", brith: "15-11-1985", mark: 7.3 }
        ]
    }
    $scope.edit = function (index) {
        $scope.index = index;
        $scope.Subject = angular.copy($scope.Students.Subjects[index])
    }
    $scope.Save = function () {
        $scope.Thongbaoht = (($scope.Subject.name == null) ? "Vui lòng điền vào họ và tên" : "");
        $scope.Thongbaob = (($scope.Subject.brith == null) ? "Vui lòng điền ngày sinh" : "")
        // $scope.Thongbaom = (($scope.Subject.mark== null) ? "Vui lòng điền điểm số" : ($scope.hl = (($scope.mark <= 10) & ($scope.mark >= 0) ? (($scope.mark >= 5) ? "Đậu" : "Rớt") : "Lỗi (Điểm là con số và nằm trong khoảng 0-10)")
        // ))
        $scope.Students.Subjects.push(angular.copy($scope.Subject))
        $scope.New();
    }
    $scope.Update = function () {
        // $scope.Thongbaoht = (($scope.Subject.name == null) ? "Vui lòng điền vào họ và tên" : "");
        // $scope.Thongbaob = (($scope.Subject.brith == null) ? "Vui lòng điền ngày sinh" : "")
        // $scope.Thongbaom = (($scope.Subject.mark== null) ? "Vui lòng điền điểm số" : ( (($scope.mark <= 10) & ($scope.mark >= 0) ? "": "Lỗi (Điểm là con số và nằm trong khoảng 0-10)")
        // ))
        $scope.Students.Subjects[$scope.index] = angular.copy($scope.Subject);
        $scope.New();
    }
    $scope.Delete = function () {
        $scope.Students.Subjects.splice($scope.index, 1);
        $scope.New();
    }

    $scope.New = function () {
        $scope.Subject = {};
        $scope.index = -1;
    }
    $scope.Cancle = function () {
        $scope.Subject = ($scope.Students.Subjects[$scope.index])
    }
}
)
var p = angular.module("pro", []).controller("pros", function ($scope) {
    $scope.products = [
        { name: "IP14", img: "images/1.jpeg", price: "$1500" },
        { name: "Macbook", img: "images/2.jpg", price: "$1500" },
        { name: "Samsung s23", img: "images/8.jpg", price: "$1500" },
        { name: "Oppo", img: "images/4.png", price: "$1500" },
        { name: "Vivo", img: "images/5.jpg", price: "$1500" },
        { name: "Applewatch", img: "images/6.jpg", price: "$1500" },
        { name: "Tablent", img: "images/7.jpg", price: "$1500" },
        { name: "Desktop", img: "images/8.jpg", price: "$1500" }
    ]
})