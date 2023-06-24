
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
	var dos = document.frm.do;
	var dens = document.frm.den;
	var trang = document.frm.trang;
	// var thongbao ="";
	if(tensp.value==""){ 
		return false;
	}
	if(soluong==""){ 
	
		return false;
	}
	if(nsx == 0){ 
		return false;
	}
	if(tinhtrang != 1 && tinhtrang !=2){ 

		return false;	
	}
	if(dos.checked == false && dens.checked == false && trang.checked == false){ 
		alert("sai");
		return false;	
	}
	alert("Bạn đã hoàn thành form");
	return true;
	
	
}


