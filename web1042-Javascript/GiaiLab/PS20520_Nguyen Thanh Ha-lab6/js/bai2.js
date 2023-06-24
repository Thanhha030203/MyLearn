function hienthi(v){
    vc = document.getElementById("vc");
    vc.style.display = (v==true)? "" : "none";
}
thanhcong = true;
tb1 = "", tb2 = "", tb3 = "", tb4 = "";
function kiemtra(){
    kiemtra1();
    kiemtra2();
    kiemtra3();
    kiemtra4();
    if(tb1 == "" && tb2 == "" && tb3 == "" && tb4 == ""){
           prompt("Bạn thấy dịch vu như thế nào","");
           alert("Cảm ơn đã đánh giá!!!");  
    } 
    return thanhcong;
}
function kiemtra1(){
    var sp = document.getElementById("tensp");
    if(sp.value.length == 0){
        tb1 = "*Vui lòng nhập tên sản phẩm";
        thanhcong = false;
    }else{
        tb1 = "";
        thanhcong = true;
    }
    document.getElementById("kq1").innerHTML = tb1;
}
function kiemtra2(){
    var loai = document.getElementById("loai");
    if(loai.value == ""){
        tb2 = "*Chọn 1 loại sản phẩm đi <br>";
        thanhcong = false;
    }
    document.getElementById("kq2").innerHTML = tb2;
}
function kiemtra3(){
    var gia = document.getElementById("gia");
    if(gia.value == ""){
        tb3 = "*Bạn chưa nhập giá trị <br>";
        thanhcong = false;
    }
    if(isNaN(gia.value)==true){
        tb3 = "*Bạn cần nhập giá trị số <br>";
        thanhcong = false;
    }
    if(parseInt(gia.value) <= 0){
        tb3 = "*Bạn cần nhập giá trị dương <br>";
        thanhcong = false;
    }
    document.getElementById("kq3").innerHTML = tb3;
}
function kiemtra4(){
    var radios = document.getElementsByName("diachi");
    if(radios[0].checked == false && radios[1].checked == false){
        tb4 = "*Vui lòng chọn nơi giao hàng";
        thanhcong = false;
    }
    document.getElementById("kq4").innerHTML = tb4;
}
document.getElementById('vc').style.display="none";