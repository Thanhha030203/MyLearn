
   var  loi1 = "", loi2 = "", loi3 = "", loi4 = "";
   var dl ;
function kiemtra(){
    ht = document.frm1.ht.value;
    cmnd = document.frm1.cmnd.value;
    tinh = document.frm1.tinh.value;
    bosung = document.frm1.bosung.value;
     test1();
     test2();
     test3();
     test4();
     if(loi1 == "" && loi2 == "" && loi3 == "" && loi4 == ""){
         alert("Lưu thông tin thành công");
     }
     return dl;
 }
 function test1(){
    document.getElementById('kq1').innerHTML ="Tối thiểu 3 kí tự";
     if(ht.length < 3 || ht.length >30){
         loi1 = "Tối thiểu 3 kí tự";
         dl = false;
     }else {
         loi1 = "";
         dl = true;
     }
     document.getElementById("kq1").innerHTML = loi1;
 }
 function test2(){
    document.getElementById('kq2').innerHTML ="*Vui lòng nhập đủ 9 số";
     if(cmnd.length!=9){
         loi2 = "*Vui lòng nhập đủ 9 số";
         dl = false;
     }else {
         loi2 = "";
         dl = true;
     }
     var s = parseInt(cmnd);
     document.getElementById("kq2").innerHTML = loi2;
 }
 function test3(){
    document.getElementById('kq3').innerHTML ="*Bắt buộc";
     if(tinh==0){
         loi3 = "*Bắt buộc";
         dl = false;
     }else {
         loi3 = "";
         dl = true;
     }
     document.getElementById("kq3").innerHTML = loi3;
 }
 function test4(){
     document.getElementById('kq4').innerHTML="Vui lòng nhập thông tin tưg 50-1000 kí tự"
     if(bosung.length < 50 || bosung.length>1000){
         loi4 = "*Vui lòng nhập thông tin tưg 50-1000 kí tự";
         dl= false;
     }else {
         loi4 = "";
         dl = true;
     }
     document.getElementById("kq4").innerHTML = loi4;
 }
 function thoat(nut){ 
    var cha = nut.parentElement;
    cha.getElementsByClassName('num')[0].innerHTML ="";
}