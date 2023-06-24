// bai2
angular.module("myapp",[]).controller("myctrl",function($scope){ 
    $scope.Student = {
        name : "Nguyễn Văn tèo",
        brith : "20-01-1995",
        sex : "Nam",
        mark: "8.5",
        images : "hinh/HTB1soSyeRGw3KVjSZFwq6zQ2FXa4.jpg"
        
    }
    $scope.name = "Nguyễn Văn tèo";
    $scope.brith = "20-01-1995";
    $scope.sex = "Nam";
    $scope.mark="8.5";
    $scope.images ="hinh/HTB1soSyeRGw3KVjSZFwq6zQ2FXa4.jpg"
})
angular.module("haapp",[]).controller("hactrl",function($scope){ 
    $scope.Student = [
        { "images" : "hinh/HTB1soSyeRGw3KVjSZFwq6zQ2FXa4.jpg", name : "Nguyễn Văn tèo", "brith" : "20-01-1995", "sex" : "Nam","mark": "8.5" },
        { "images" : "hinh/HTB1soSyeRGw3KVjSZFwq6zQ2FXa4.jpg","name": "Nguyễn Văn tèo"," brith" : "20-01-1995", "sex ": "Nam","mark": "8.5" },
        { "images" : "hinh/HTB1soSyeRGw3KVjSZFwq6zQ2FXa4.jpg","name" : "Nguyễn Văn tèo", "brith" : "20-01-1995", "sex" : "Nam","mark": "8.5" },
    ]
})

angular.module("haapps",[]).controller("actrl",function($scope){ $scope.tinh=
function(){ $scope.s = $scope.height * $scope.width; $scope.c = 2*(parseFloat
($scope.height) + parseFloat($scope.width)); } })

angular.module("apps",[]).controller("actrl",function($scope){ $scope.tinh=
function(){ 

        $scope.Thongbaoht = (($scope.name == null)?"Vui lòng điền vào họ và tên":"");
                $scope.Thongbaob = (($scope.brith == null)?"Vui lòng điền ngày sinh":"")

        $scope.Thongbaos = (($scope.sex == null)?"Vui lòng điền giới tính":"")

        $scope.Thongbaom = (($scope.mark == null)?"Vui lòng điền điểm số":($scope.hl = (($scope.mark<=10)&($scope.mark>=0)?(($scope.mark>=5)?"Đậu":"Rớt"):"Lỗi (Điểm là con số và nằm trong khoảng 0-10)")
))

        // $scope.hl = (($scope.mark<=10)&($scope.mark>=0)?(($scope.mark>=5)?"Đậu":"Rớt"):"Lỗi (Điểm là con số và nằm trong khoảng 0-10)")
    }

})