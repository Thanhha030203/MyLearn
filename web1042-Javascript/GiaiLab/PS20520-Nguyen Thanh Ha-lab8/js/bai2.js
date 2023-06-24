var t = null;
function hourr() {
    var date = new Date();
    var h = date.getHours();
    var m = date.getMinutes();
    var s = date.getSeconds();
    if (s < 10) {
        s = '0' + s;
    }
    if (m < 10) {
        m = '0' + m;
    }
    if (h < 10) {
        h = '0' + h;
    }
    document.getElementById('dongho').innerHTML = h + ":" + m + ':' + s;
}
hourr();
t = setInterval('hourr()', 1000);
function start() {
    if (t == null) {
        t = setInterval('hourr()', 1000);
        document.getElementById('hienthi').innerHTML = "STOP";
    }
    else {

        clearInterval(t);
        t = null;
        document.getElementById('hienthi').innerHTML = "START";
    }
}
var bai = [{ 'herf': 'https://longnv.name.vn/lap-trinh-javascript/javascript-la-gi' },
{ 'herf': 'https://longnv.name.vn/lap-trinh-javascript/bien-kieu-toan-tu-va-bieu-thuc-trong-javascript' },
{ 'herf': 'https://longnv.name.vn/lap-trinh-javascript/cau-truc-dieu-khien-trong-javacript' },
{ 'herf': 'https://longnv.name.vn/lap-trinh-javascript/lap-trinh-doi-tuong-trong-javascript-va-mo-hinh-bom' },
{ 'herf': 'https://longnv.name.vn/lap-trinh-javascript/mo-hinh-dom-trong-javascript' },
{ 'herf': 'https://longnv.name.vn/lap-trinh-javascript/kiem-tra-du-lieu-trong-form-voi-javascript' },
{ 'herf': 'https://longnv.name.vn/lap-trinh-javascript/gioi-thieu-ve-javascript-framework' },
{ 'herf': 'https://longnv.name.vn/lap-trinh-javascript/su-dung-angularjs' }];

console.log(bai[1].herf)

function ktra() {
    for (var i = 0; i <= 7; i++) {
        var dc = document.frm.sel.value;
        if (dc == i) {
            window.location = bai[i].herf;
            console.log(bai[i].herf);
             return true;
        }
       
    }
    alert("Bạn chưa chọn bài học");
        return false;
}
// function ok(){ 
//     var chay = document.frm.sel;
//     if(chay.value==-1){ 
//         alert("Bạn chưa chọn bài");
//         return false;
//     }
//     alert("bạn thành công")
//     return true;



// var ang = angular.module('bai3',[]);
// ang.controller('ctr1',xuli);
// function xuli ($scope){
//     // console.log($scope.tensp);
//     $scope.ktra = function (){ 
    
//     }
// }

