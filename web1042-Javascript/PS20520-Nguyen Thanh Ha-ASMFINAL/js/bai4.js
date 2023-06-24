var ten = document.getElementById('ten').innerText;
var mauchu = document.getElementById('mauchu').innerText;
var maubo = document.getElementById('bo');
var names = document.frm;
// for(var i=0;i<ten.length;i++){ 
// 	console.log(ten[0]);
// 	}
index = 0;
stt=0;

document.getElementById('ten').innerText = "";
setInterval(function () {
	if (index >= ten.length) {
		document.getElementById('ten').innerText = "";
		index = 0;
	}
	document.getElementById('ten').innerText += ten[index];
	document.getElementById('ten').style.color = mau[index];
	index++
}, 400);
var mau = ['#f79533', '#f37055', '#ef4e7b', '#a166ab', '#5073b8', ' #1098ad', '#07b39b','#6fba82'];
var ang = angular.module('bai4', []);
ang.controller('thucthi', xuli);
function xuli($scope) {
	$scope.kiemtra = function () {
		alert('bạn đã đăng ký thành công');
		window.location = "kiem.html";
	}

}
setInterval(function () {
	if (stt >= mau.length-1) {
		stt = 0;
	}
	document.getElementById('mauchu').style.color = mau[stt];
	stt++
}, 500);
stt1 =0;
// setInterval(function () {
// 	if (stt1 >= mau.length-1) {
// 		stt1 = 0;
// 	}
// 	document.getElementById('bo').style.border ="3px solid "+ mau[stt1];
// 	stt1++;
// },500);


// function kiemloi1(){ 
// 		if(names.hoten.value==""){ 
// 		document.getElementById("loi2").innerHTML = 'Báo động 2';
// 		return false;
// 	}
// 	else{ 
// 		document.getElementById("loi1").innerHTML = '';
// 		return true;
// 	}
// }
// function kiemloi2(){
// 	if(names.masv.value==""){ 
// 		document.getElementById("loi1").innerHTML = 'Báo động 1';
// 		return false;
// 	}
// 	else{ 
// 		document.getElementById("loi2").innerHTML = '';
// 		return false;
// 	}
// }
// function kiemloi3(){
// 	if(names.email.value==""){ 
// 		document.getElementById("loi3").innerHTML = 'Báo động 3';
// 		return false;
// 	}
// 	else{ 
// 		document.getElementById("loi3").innerHTML = '';

// 	return true;
// }
// }
// function kiemloi(){ 
// 	kiemloi1();
// 	kiemloi2();
// 	kiemloi3();
// 	if(kiemloi1() && kiemloi2() && kiemloi3()){ 
// 		return true;
// 	}
// 	return false;
// }


// console.log(document.getElementsByTagName('h5')[0].innerHTML)
// function kiem() {

// 	var ma = document.frm.masv.value;
// 	if (ma == "") {
// 		document.getElementsByTagName('h5')[0].innerText="Chưa nhập dữ liệu";	
// 		return false;
// 	}
// 	else{
// 		document.getElementsByTagName('h5')[0].innerText="";	
// 	}
// 	var mail = document.frm.email.value;
// 	if (mail == "") {
// 		document.getElementsByTagName('h5')[2].innerText="Chưa nhập dữ liệu";	
// 		return false;
// 	}
// 	else{
// 		document.getElementsByTagName('h5')[2].innerText="";	
// 	}
// 	var hoten = document.frm.hoten.value;
// 	if (hoten == "") {
// 		document.getElementsByTagName('h5')[1].innerText="Chưa nhập dữ liệu";	
// 		return false;
// 	}
// 		else{
// 			document.getElementsByTagName('h5')[1].innerText="";	
// 		}

// 	var gioitinh = document.frm.gioitinh.value;
// 	if (gioitinh != 1 && gioitinh != 2) {
// 		return false;
// }
// 	var st1 = document.frm.st1;
// 	var st2 = document.frm.st2;
// 	var st3 = document.frm.st3;
// 	var st4 = document.frm.st4;
// 	var st5 = document.frm.st5;
// 	var st6 = document.frm.st6;

// 	if (st1.checked == false && st2.checked == false && st3.checked == false && st4.checked == false && st5.checked == false && st6.checked == false ) {
// 		return false;
// 	}
// 	var qt = document.frm.qt.value;
// 	if(qt !=1 &&  qt !=2 && qt !=3 && qt !=4 && qt !=5 && qt !=6 ){ 
// 		return false;
// 	}
// return true;
// }
 