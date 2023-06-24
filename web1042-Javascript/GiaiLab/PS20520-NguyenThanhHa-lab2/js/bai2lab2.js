var n = new Date();
var gio = n.getHours();
 if(gio < 12){ 
    document.getElementById('chao').innerHTML = "Chào buổi sáng";
}
else{ 
    document.getElementById('chao').innerHTML = "Chào buổi tối";
}
let trl =  prompt("JAVASCRIPT CÓ THỂ LÀM GÌ", "Thật tuyệt");
if( trl !=null){ 
    document.getElementById('da').innerHTML =
    " Tôi cảm thấy javascript  "+ trl +" .";
}
var ht = document.getElementById('ht').innerHTML = prompt("Mời nhập tên","");
var email = document.getElementById('email').innerHTML = prompt("Mời nhập địa chỉ email","");
