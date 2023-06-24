var ht = document.frm1.ht.value;
    var cmnd = document.frm1.cmnd.value;
    var tinh = document.frm1.tinh.value;
    var bosung = document.frm1.bosung.value;
    var loi = "";
function kiemtra(){
    kiemtra1();
    kiemtra2();
    kiemtra3();
    kiemtra4();
    if(loi.length==""){
        alert("Lưu thông tin thành công");
        // loi = "Lưu thông tin thành công";
        document.getElementById("loi").innerHTML = loi;
    }
    return false;
}
function kiemtra1(){
    if(ht.length < 3 || ht.length >30){
        loi = "*Tối thiểu 3 kí tự và tối đa 30 kí tự";
    }
    else{
        loi="";
    }
    document.getElementById("kq1").innerHTML = loi;
}
function kiemtra2(){
    if(cmnd.length!=9){
        loi = "*CMND phải đúng 9 ký tự";
    }
    else{
        loi="";
    }
    var s = parseInt(cmnd);
    document.getElementById("kq2").innerHTML = loi;
}
function kiemtra3(){
    if(tinh==0){
        loi = "*Bắt buộc chọn";
        document.getElementById("kq3").innerHTML = loi;
    }
    else{
        loi="";
    }
}
function kiemtra4(){
    if(bosung.length < 50 || bosung.length>1000){
        loi = "*Vui lòng điền thông tin từ 50-1000 kí tự";
    }
    else{
        loi="";
    }
    document.getElementById("kq4").innerHTML = loi;
}
function thoat(nut){ 
    var cha = nut.parentElement;
    cha.getElementsByClassName('num')[0].innerHTML ="";
}