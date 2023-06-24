var app = angular.module("thanhha",["ngRoute"]);
var indexCart=0;
app.controller("homectrl",function($scope,$rootScope,$routeParams,$http){ 
    $scope.addCart=function(p,t){
        if(typeof $rootScope.cart=='undefined'){
        $rootScope.cart=[];
        };
        $scope.countCart=$rootScope.cart.length;
        if($rootScope.cart.filter(i => i.Id == p.Id).length==0){
            $rootScope.cart.push(p);
            
            $rootScope.cart[$scope.countCart].quantity=p.Type[0].buy;       
        }
        
    } 

    $rootScope.TongTien=0;
    if(typeof $rootScope.cart!='undefined'){
        for(var i=0; i<$rootScope.cart.length;i++){
            $rootScope.cart[i].vouchertien = $rootScope.cart[i].quantity*$rootScope.cart[i].Type[0].Pieces;
            $rootScope.TongTien=$rootScope.TongTien+ $rootScope.cart[i].vouchertien ;
         
         }
    }
  
$rootScope.giams="MG10"
    $scope.Voucher = function(index){ 
        console.log($scope.giams)
        if($rootScope.giams =="MG10"){ 
       
            $rootScope.cart[index].vouchertien  = $rootScope.cart[index].Type[0].Pieces * $rootScope.cart[index].quantity *0.9;
            // console.log( $rootScope.cart[index].vouchertien +'a')
            // console.log( $rootScope.TongTien +'a')
            // console.log( $rootScope.cart[index].quantity +'q')
            // console.log( $rootScope.cart[index].Type[0].Pieces +'p')
            $rootScope.TongTien = ($rootScope.TongTien-$rootScope.cart[index].quantity*$rootScope.cart[index].Type[0].Pieces)+ $rootScope.cart[index].vouchertien;
        }
        if($rootScope.giams =="MG20"){ 
            $rootScope.cart[index].vouchertien= $rootScope.cart[index].Type[0].Pieces * $rootScope.cart[index].quantity *0.8;
            $rootScope.TongTien=($rootScope.TongTien-$rootScope.cart[index].quantity*$rootScope.cart[index].Type[0].Pieces)+ $rootScope.cart[index].vouchertien;
        }
        if($rootScope.giams =="MG30"){ 
            $rootScope.cart[index].vouchertien= $rootScope.cart[index].Type[0].Pieces * $rootScope.cart[index].quantity *0.7;
            $rootScope.TongTien=($rootScope.TongTien-$rootScope.cart[index].quantity*$rootScope.cart[index].Type[0].Pieces)+ $rootScope.cart[index].vouchertien;
        }
        else{ 
            $rootScope.cart[index].vouchertien = $rootScope.cart[index].Type[0].Pieces * $rootScope.cart[index].quantity;
            $rootScope.TongTien=($rootScope.TongTien-$rootScope.cart[index].quantity*$rootScope.cart[index].Type[0].Pieces)+ $rootScope.cart[index].vouchertien;
        }

         }
         $scope.addClick=function(index){
            $rootScope.cart[index].quantity= $rootScope.cart[index].quantity+1;
            $rootScope.cart[index].vouchertien= $rootScope.cart[index].Type[0].Pieces * $rootScope.cart[index].quantity;
            if(typeof $rootScope.cart!='undefined'){
                $rootScope.TongTien=0;
                
                for(var i=0; i<$rootScope.cart.length;i++){

                $rootScope.TongTien = $rootScope.TongTien + $rootScope.cart[i].vouchertien;
                console.log("tien: "+$rootScope.cart[i].Type[0].Pieces)
             }
        }
        }
    $scope.subClick=function(index){
                
       if($rootScope.cart[index].quantity >1){
        $rootScope.cart[index].quantity= $rootScope.cart[index].quantity-1;
        $rootScope.cart[index].vouchertien= $rootScope.cart[index].Type[0].Pieces * $rootScope.cart[index].quantity;
       }
   if(typeof $rootScope.cart!='undefined'){
    $rootScope.TongTien=0;
 
    for(var i=0; i<$rootScope.cart.length;i++){
       
    $rootScope.TongTien  = $rootScope.TongTien +  $rootScope.cart[i].vouchertien;
    console.log("tien: "+$rootScope.cart[i].Type[0].Pieces)
    }
}
}
$scope.tinhtien = function(index){ 
    if($scope.check ==1){ 
        console.log("a")
    }
    else{ 
        console.log("b")
    }
}
   $scope.product_type ={};
    $scope.chooseTypea = function (index){ 
        $scope.indexType = index;
        console.log($scope.indexType)
        // $scope.product_type = angular.copy($scope.product_list[id].Type[index]);
        // console.log($scope.product_type)
    }
    $scope.addClicksa=function(id,index){
        console.log(index) 
      if(typeof $scope.product_list[id].Type[index].buy=='undefined'){
        $scope.product_list[id].Type[index].buy= 1;
      } 
      else{ 
        
        $scope.product_list[id].Type[index].buy =$scope.product_list[id].Type[index].buy+ 1;
      }
    }
    $scope.subClicksa=function(id,index){
        if($scope.product_list[id].Type[index].buy >1){
            $scope.product_list[id].Type[index].buy= $scope.product_list[id].Type[index].buy-1;
           }
       if(typeof $rootScope.cart!='undefined'){
        $rootScope.TongTien=0;
        for(var i=0; i<$rootScope.cart.length;i++){
        $rootScope.TongTien  = $rootScope.TongTien +  $rootScope.cart[i].vouchertien;
        console.log("tien: "+$rootScope.cart[i].Type[0].Pieces)
        }
    }
 
    }
    $scope.del=function(index){
        console.log(index +" a")
        $rootScope.cart.splice(index,1);
        console.log($rootScope.cart.length)
        if(typeof $rootScope.cart!='undefined'){
            $rootScope.TongTien=0;
            for(var i=0; i<$rootScope.cart.length;i++){
            $rootScope.TongTien=$rootScope.TongTien+$rootScope.cart[i].quantity*$rootScope.cart[i].Type[0].Pieces;
         }
    }
}

$scope.Status = "Xem thêm"
 $scope.mores= function(){ 
    
     $scope.more = !$scope.more
     if($scope.more){ 
        $scope.Status = "Ẩn bớt"
   
     }
     else{ 
        $scope.Status = "Xem thêm"
     }

 }
 
    $scope.product_list = [];
    $http.get('js/project.json').then(function(reponse){ 
        $scope.product_list = reponse.data;
       
    });
    $scope.kq = true;
    // console.log( "mopdel ;à "+$scope.$rootScope.SearchText)
   $scope.giam= function(){ 
       $scope.kq = false;
   }
   $scope.tang= function(){ 
    $scope.kq = true;
}

        
    $scope.tim= $routeParams.search;
    console.log( $scope.tim)
    $scope.index=$routeParams.url;
    console.log($routeParams.url)

})
app.config(function($routeProvider){ 
    $routeProvider
    .when("/product/:url",{
        templateUrl: "product.html?" ,
        controller : "homectrl"
    })
    .when("/cart/",{
        templateUrl: "cart.html" ,
        controller : "homectrl"
    })
    .when("/listproduct/:search",{
        templateUrl: "ListProduct.html?" ,
        controller : "homectrl"
    })
    .otherwise( {
        templateUrl : "home.html",
        controller : "homectrl"
    })
})
