thanhcong = true;
thongbao1 = "", thongbao2 = "", thongbao3 = "", thongbao4 = "", thongbao5 = "", thongbao6 = "";
function kiemtra(){
    kiemtra1();
    kiemtra2();
    kiemtra3();
    kiemtra4();
    kiemtra5();
    kiemtra6();
    if(thongbao1 == "" && thongbao2 == "" && thongbao3 == "" && thongbao4 == "" && thongbao5 == "" && thongbao6 == ""){
        alert("Đăng kí thành công");
    } 
    return thanhcong;
}
function kiemtra1(){
    var sv = document.getElementById("masv");
    if(sv.value.length == 0){
        thongbao1 = "*Vui lòng nhập mã sinh viên";
        thanhcong = false;
    }else{
        if(sv.value.length != 7){
            thongbao1 = "*Mã sinh viên phải đúng 7 ký tự";
            thanhcong = false;
        }else{
            thongbao1 = "";
            thanhcong = true;
        }
    }
    document.getElementById("kq1").innerHTML = thongbao1;
}
function kiemtra2(){
    var ht = document.getElementById("hoten");
    if(ht.value == ""){
        thongbao2 = "*Vui lòng nhập Họ và tên";
        thanhcong = false;
    }else{
        if(ht.value.length > 30){
            thongbao2 = "*Nhập tối đa 30 ký tự";
            thanhcong = false;
        }else{
            thongbao2 = "";
            thanhcong = true;
        }
    }
    document.getElementById("kq2").innerHTML = thongbao2;
}
function kiemtra3(){
    var email = document.getElementById("email");
    if(email.value == ""){
        thongbao3 = "*Bạn chưa nhập email";
        thanhcong = false;
    }else{
        if(email.value == ""){
            thongbao3 = "*Email nhập chưa đúng ";
            thanhcong = false;
        }else{
            thongbao3 = "";
            thanhcong = true;
        }
    }
    document.getElementById("kq3").innerHTML = thongbao3;
}
function kiemtra4(){
    var radios = document.getElementsByName("gioitinh");
    if(radios[0].checked == false && radios[1].checked == false){
        thongbao4 = "*Vui lòng chọn giới tính";
        thanhcong = false;
    }else{
        thongbao4 = "";
        thanhcong = true;
    }
    document.getElementById("kq4").innerHTML = thongbao4;
}
function kiemtra5(){
    var checkboxs = document.getElementsByName("sothich");
    if(checkboxs[0].checked == false && checkboxs[1].checked == false && checkboxs[2].checked == false && checkboxs[3].checked == false && checkboxs[4].checked == false){
        thongbao5 = "*Vui lòng chọn sở thích";
        thanhcong = false;
    }else{
        thongbao5 = "";
        thanhcong = true;
    }
    document.getElementById("kq5").innerHTML = thongbao5;
}
function kiemtra6(){
    var selects = document.getElementById("quoctich");
    if(selects.value == 0){
        thongbao6 = "*Vui lòng chọn quốc tịch";
        thanhcong = false;
    }else{
        thongbao6 = "";
        thanhcong = true;
    }
    document.getElementById("kq6").innerHTML = thongbao6;
}