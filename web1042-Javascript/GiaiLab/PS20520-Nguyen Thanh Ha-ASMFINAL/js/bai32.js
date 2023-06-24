// var tt = new Intl.NumberFormat();
// function tinhtien(input) {
//     var hang = input.parentElement.parentElement;
//     var rown = input.parentElement.parentElement.cloneNode(true);
//     document.getElementById('giohang').appendChild(rown);
//     // var check = hang.children[0].children[0].checked;
//     var tinh = hang.children[2].innerText;
//     var sl = hang.children[3].children[0].value;
//     hang.children[4].innerText = parseInt(tinh) * parseInt(sl);
//     var tinhs = document.getElementsByClassName('lay');
//     var tong = 0;
//     for (var i = 0; i < tinhs.length; i++) {
//         var gtr = tinhs[i].innerText;
//         if (gtr == "") {
//             gtr = 0;
//         }
//         else {
//             gtr = parseInt(gtr);

//         }
//         tong += gtr;
//     }
//     document.getElementById('tongtien').innerText = tt.format(tong);
// }
// function muahang(input) {
// document.getElementById('tongphaichi').style.display = "none";
//     var row = input.parentElement.parentElement;
//     var hang = row.getElementsByClassName('chay');

//     for (var i = 0; i < hang.length ; i++) {

// if(hang[i].children[0].checked){ 
//     var tao6 = document.createElement('div');
//     var cart = document.getElementById('cart');
//     cart.appendChild(tao6);

//     var ok = document.getElementById('cart').children[0];

//     var hangs = input.parentElement.parentElement;
//     var tensp = document.createTextNode("   Tên sản phẩm :                      " + hangs.children[1].innerText);
//     var dongia = document.createTextNode("   Đơn giá      :                       " + hangs.children[2].innerText);
//     var slm = document.createTextNode("   Số lượng mua :                       " + hangs.children[3].children[0].value);
//     var chi = document.createTextNode("   Tổng tiền cho loại sản phẩm:         " + hangs.children[4].innerText);

//     var tao = document.createElement('pre');
//     var tao1 = document.createElement('pre');
//     var tao2 = document.createElement('pre');
//     var tao3 = document.createElement('pre');
//     var tao4 = document.createElement('hr');

//     tao.appendChild(tensp);
//     tao1.appendChild(dongia);
//     tao2.appendChild(slm);
//     tao3.appendChild(chi);
//     ok.appendChild(tao);
//     ok.appendChild(tao1);
//     ok.appendChild(tao2);
//     ok.appendChild(tao3);
//     ok.appendChild(tao4);

// }
//     }
// }
// function muahangn() {
//     document.getElementById('cart').style.display = '';
//     document.getElementById('tongphaichi').style.display = "";
//     document.getElementById('tongphaichi').innerHTML = "tổng tiền phải chi trả là : " + document.getElementById('tongtien').innerHTML;
// }
// function quaylai() {

//     var chon = document.getElementById('cart').children[0];
//     document.getElementById('cart').removeChild(chon);
//     var bang = document.getElementsByClassName('chay');
//     for (var i = 0; i < bang.length; i++) {
//         if (bang[i].children[0].checked == true) {
//             bang[i].children[0].checked = !bang[i].children[0].checked;
//             var row = bang[i].parentElement;
//             var hang = row.children[3].getElementsByTagName('input')[0];


//             hang.disabled = !hang.disabled;
//             if (hang.disabled == true) {
//                 row.children[3].children[0].value = "";
//                 row.children[4].innerText = 0;
//                 tientinh();
//             }
//             else {
//                 var tinh = row.children[2].innerText;
//                 var sl = row.children[3].children[0].value;
//                 if (sl == "") {
//                     sl = 0;
//                 }
//                 row.children[4].innerText = parseInt(tinh) * parseInt(sl);
//                 tientinh();
//             }
//         }
//     }
//     document.getElementById('cart').style.display = 'none';
//     document.getElementById('tongphaichi').style.display = "none";
// }
var lm = new Intl.NumberFormat();
function thaydoi(input) {
    var row = input.parentElement.parentElement;
    var hang = row.children[3].getElementsByTagName('input')[0];
    var hang1 = row.children[4].getElementsByTagName('button')[0];
    // var so = row.children[4].innerText;
    hang.disabled = !hang.disabled;
    hang1.disabled = !hang1.disabled;
    if (hang.disabled == true) {
        tientinh();
    }
    else {
        var tinh = row.children[2].innerText;
        var sl = row.children[3].children[0].value;
        if (sl == "") {
            sl = 0;
        }
    }
}

// function tientinh() {
//     var tinhs = document.getElementsByClassName('lay');
//     var tong = 0;
//     for (var i = 0; i < tinhs.length; i++) {
//         var gtr = tinhs[i].innerText;
//         if (gtr == "") {
//             gtr = 0;
//         }
//         else {
//             gtr = parseInt(gtr);
//         }

//         tong += gtr;
//     }
//     document.getElementById('tongtien').innerText = tong;
//     var rown = input.parentElement.parentElement;
//     document.getElementById('giohang').removeChild(rown);
// }
function mucgia() {
    var gia = document.getElementsByClassName('gia');
    var chongia = document.getElementById('chongia');
    var mucdangchon = chongia.value;
    for (var i = 0; i < gia.length; i++) {
        var gtri = gia[i].innerText;
        gtri = parseInt(gtri);
        if (gtri < mucdangchon) {
            gia[i].parentNode.style.display = "";
        }
        else {
            gia[i].parentNode.style.display = "none";
        }
    }
}
// document.getElementById('cart').style.display = 'none';
// document.getElementById('tongphaichi').style.display = "none";

// function gio(){ 
//     var row = document.getElementsByClassName('chay');
//     var tab = row[i].parentElement;;
//     for(var i=0; i<row.length;i++){ 
//         if(row[i].children[0].checked){ 

//             document.getElementById('giohang').appendChild(tab);
//         }
//     }
// }
function them(button) {
    var thema = button.parentElement.parentElement.cloneNode(true);
    var thema1 = button.parentElement.parentElement;
    var chinh = thema.getElementsByTagName('button')[0];
    var chinh1 = thema.getElementsByTagName('input')[1].disabled = false;
    var chinh1 = thema.getElementsByTagName('input')[1];
    var bo = thema.children[0];
    thema.removeChild(bo);
    chinh.innerText = 'XOÁ';
    chinh.setAttribute('onclick', 'xoa(this)');
    chinh1.setAttribute('type', 'number');
    document.getElementById('giohang').appendChild(thema);
    var chinh2 = thema1.getElementsByTagName('button')[0];
    chinh2.innerText = "Đã thêm";
    chinh2.setAttribute('onclick', 'ĐÃ THÊM()');
    chinh2 = thema1.getElementsByTagName('button')[0].disabled = true;
    // thema1.appendChild(chinh2);

}
function xoa(button) {
    var thema = button.parentElement.parentElement;
    document.getElementById('giohang').removeChild(thema);
    var ktra = document.getElementById('giohang');
    if (ktra.children[0] == null) {
        document.getElementById('giohang').style.display = "none";
        document.getElementById('menu').style.display = '';
        document.getElementById('an').style.display = "";
        document.getElementById('an1').style.display = "";
        document.getElementById('an2').style.display = "none";
    }
}
function gio() {
    document.getElementById('an3').style.display = "none";
    document.getElementById('menu').style.display = 'none';
    document.getElementById('giohang').style.display = "";
    document.getElementById('cart').style.display = 'none';
    document.getElementById('tongphaichi').style.display = "none";
    document.getElementById('an').style.display = "";
    document.getElementById('an1').style.display = "none";
    document.getElementById('an2').style.display = "";
    // if (document.getElementById('giohang').children[0] !=null) {
    //     document.getElementById('giohang').style.display = "";
    // }
    // else{
        
}
document.getElementById('giohang').style.display = "none";
document.getElementById('an2').style.display = "none";
document.getElementById('menu').style.display = '';
function quaylai() {
    document.getElementById('return').style.display = "none";
    document.getElementById('an4').style.display = "";
    document.getElementById('ket').style.display = "none";
    document.getElementById('an3').style.display = "none";
    document.getElementById('giohang').style.display = "none";
    document.getElementById('menu').style.display = "";
    document.getElementById('cart').style.display = 'none';
    document.getElementById('tongphaichi').style.display = "none";
    document.getElementById('an').style.display = "";
    document.getElementById('an1').style.display = "";
    document.getElementById('an2').style.display = "none";
    var chon = document.getElementById('cart').children[0];
    document.getElementById('cart').removeChild(chon);
    // if(chon ==null){ 

    // }
    // var bochon = document.getElementById('cart');
    // var hang2 = bochon.getElementsByTagName('div');
    // for(var i=0;i<hang2.length;i++){ 
    //     var tuychon = hang2[i].parentElement;
    //     document.getElementById('cart').removeChild(tuychon);
    // }
}
function muahang() {
    document.getElementById('an').style.display = "none";
    document.getElementById('an1').style.display = "none";
    document.getElementById('an2').style.display = "";
    document.getElementById('menu').style.display = 'none';
    document.getElementById('giohang').style.display = "none";
    document.getElementById('cart').style.display = '';
    document.getElementById('tongphaichi').style.display = "";
    var giohangmua = document.getElementById('giohang');
    var hang = giohangmua.getElementsByTagName('tr');
    for (var j = 0; j < hang.length; j++) {
        var tao6 = document.createElement('div');
        var cart = document.getElementById('cart');
        cart.appendChild(tao6);
        var ok = document.getElementById('cart').children[0];
        var tensp = document.createTextNode("   Tên sản phẩm :                      " + hang[j].children[0].innerText);
        var dongia = document.createTextNode("   Đơn giá      :                       " + hang[j].children[1].innerText);
        var slm = document.createTextNode("   Số lượng mua :                       " + hang[j].children[2].children[0].value);
        var chi = document.createTextNode("   Tổng tiền cho loại sản phẩm:         " + parseInt(hang[j].children[1].innerText) * hang[j].children[2].children[0].value);
        var tao = document.createElement('pre');
        var tao1 = document.createElement('pre');
        var tao2 = document.createElement('pre');
        var tao3 = document.createElement('pre');
        var tao4 = document.createElement('hr');
        tao.appendChild(tensp);
        tao1.appendChild(dongia);
        tao2.appendChild(slm);
        tao3.appendChild(chi);
        ok.appendChild(tao);
        ok.appendChild(tao1);
        ok.appendChild(tao2);
        ok.appendChild(tao3);
        ok.appendChild(tao4);
        document.getElementById('an3').style.display = "";
    }
    if (giohangmua.children[0] == null) {
        document.getElementById('an').style.display = "none";
        document.getElementById('tongphaichi').innerHTML = "chưa có hàng để tính ";
    }
    else{  
        var tongtien = 0;
        for (var i = 0; i < hang.length; i++) {
            var gtr = hang[i].chldren[1].innerText;
            var sl = hang[i].children[2].children[0].value;
            gtr = parseInt(gtr);
            console.log(gtr);
            console.log(isNaN(sl));
            tong = gtr * sl;
            tongtien += tong;
           console.log(tongtien);
        }
        document.getElementById('tongphaichi').innerHTML ="Tônge tiền cho đơn hang BN241942 : "+ tongtien ;
    }
}
// function dongia(){ 
    
//     document.getElementById('tongphaichi').style.display = "";
//     var giohangmua = document.getElementById('giohang');
//     var hang = giohangmua.getElementsByTagName('tr');

// }
// dongia();
document.getElementById('cart').style.display = 'none';
document.getElementById('tongphaichi').style.display = "none";
function chotdon() {
    document.getElementById('an5').style.display ="";
    document.getElementById('an').style.display = "none";
    document.getElementById('an4').style.display = "none";
    document.getElementById('an1').style.display = "none";
    document.getElementById('an2').style.display = "none";
    document.getElementById('an3').style.display = "none";
    document.getElementById('return').style.display = "";
    document.getElementById('ket').style.display = "";
    document.getElementById('tongphaichi').style.display = "none";
    document.getElementById('cart').style.display = 'none';
    // alert("Bạn đã dặt hàng thành công \n đơn hàng của bạn sẽ được chuyển đi nhanh nhất\n Cảm ơn đã sử dụng dịch vụ");
    document.getElementById('ket').innerHTML = "Đặt hàng thành công <br> Đơn hàng của bạn sẽ được chuyển đi trong thời gian sớm nhất <br> Cảm ơn bạn đã sử dụng dịch vụ !!!!";
}
document.getElementById('an3').style.display = "none";
document.getElementById('ket').style.display = "none";
function xoaall() {
    var cha = document.getElementById('giohang');
    var hang = cha.getElementsByTagName('tr');
    for (var i = hang.length - 1; i > -1; i--) {
        cha.removeChild(hang[i]);
    }
    location.reload();
}
function bill() {
    document.getElementById('an2').style.display = "";
    document.getElementById('ket').style.display = "none";
    document.getElementById('cart').style.display = '';
    document.getElementById('tongphaichi').style.display = "";
}
document.getElementById('return').style.display = "none";
function hour1() {
    var h = new Date();
    var hour = h.getHours();
    var min = h.getMinutes();
    var sec = h.getSeconds();
    var date = h.getDate();
    var mon = h.getMonth();
    var year = h.getFullYear();
    if (mon < 10) {
        mon = '0' + mon;
    }
    if (hour < 10) {
        hour = '0' + hour;
    }
    if (min < 10) {
        min = '0' + min;
    }
    if (sec < 10) {
        sec = '0' + sec;
    }
    document.getElementById('dongho').innerHTML = date + '/' + mon + '/' + year + '  ' + hour + ':' + min + ':' + sec;
    setInterval("hour1()", 1000);

}
// hour1();
function danhgiasp(){ 
    prompt("Bạn cảm thấy dịch vụ như thế nào?","");
    alert("Cảm ơn đã đánh giá");
}
document.getElementById('an5').style.display ="none";