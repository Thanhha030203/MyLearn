
var ang = angular.module('bai3',[]);
ang.controller('ctr1',xuli);
function xuli ($scope){
	// console.log($scope.tensp);
	$scope.ktra = function (){ 
	
	}
}
function vali(){ 
	var tensp = document.frm.tensp;
	var soluong = document.frm.soluong.value;
	var nsx = document.frm.nsx.value;
	var tinhtrang = document.frm.tinhtrang1.value;
	var mau1 = document.frm.do;
	var mau2 = document.frm.den;
	var mau3 = document.frm.trang;
	// var thongbao ="";
	if(tensp.value==""){ 
		alert("nhập");
		return false;
	}
	if(soluong==""){ 
		alert("nhập");
		return false;
	}
	if(nsx == 0){ 
		alert("nhập lại");
		return false;
	}
	if(tinhtrang != 1 && tinhtrang !=2){ 
		alert('hello');
		return false;	
	}

	alert("Bạn đã hoàn thành form");
	return true;
	
}
