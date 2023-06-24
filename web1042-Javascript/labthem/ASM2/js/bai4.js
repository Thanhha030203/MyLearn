thanhcong = false;
thongbao1 = "", thongbao2 = "", thongbao3 = "", thongbao4 = "";
function kiemtra(){
    kiemtra1();
    kiemtra2();
    kiemtra3();
    kiemtra4();
    if(thongbao1 == "" && thongbao2 == "" && thongbao3 == "" && thongbao4 == ""){
        alert("Đặt hàng thành công");
    } 
    return thanhcong;
}
function kiemtra1(){
    var sp = document.getElementById("tensp");
    if(sp.value.length == 0){
        thongbao1 = "*Vui lòng nhập tên sản phẩm";
        thanhcong = false;
    }else{
        thongbao1 = "";
        thanhcong = true;
    }
    document.getElementById("kq1").innerHTML = thongbao1;
}
function kiemtra2(){
    var loai = document.getElementById("loai");
    if(loai.value == ""){
        thongbao2 = "*Chọn 1 loại sản phẩm đi <br>";
        thanhcong = false;
    }else{
        thongbao2 = "";
        thanhcong = true;
    }
    document.getElementById("kq2").innerHTML = thongbao2;
}
function kiemtra3(){
    var gia = document.getElementById("gia");
    if(gia.value == ""){
        thongbao3 = "*Bạn chưa nhập giá trị <br>";
        thanhcong = false;
    }else{
        thongbao3 = "";
        thanhcong = true;
    }
    if(isNaN(gia.value)==true){
        thongbao3 = "*Bạn cần nhập giá trị số <br>";
        thanhcong = false;
    }else{
        thongbao3 = "";
        thanhcong = true;
    }
    if(parseInt(gia.value) <= 0){
        thongbao3 = "*Bạn cần nhập giá trị dương <br>";
        thanhcong = false;
    }else{
        thongbao3 = "";
        thanhcong = true;
    }
    document.getElementById("kq3").innerHTML = thongbao3;
}
function kiemtra4(){
    var radios = document.getElementsByName("diachi");
    if(radios[0].checked == false && radios[1].checked == false){
        thongbao4 = "*Vui lòng chọn nơi giao hàng";
        thanhcong = false;
    }else{
        thongbao4 = "";
        thanhcong = true;
    }
    document.getElementById("kq4").innerHTML = thongbao4;
}