var mang =document.getElementsByClassName('names');
console.log(mang);
function chitiets(nhan){ 
    var chon = nhan.parentElement;
    var anh = chon.children[0].src;
    document.getElementById('anhchitiet').src = anh;
    console.log(chon.children[1].innerText);
    for(var i=0;i<mang.length;i++){  
        if(mang[i].innerHTML == chon.children[1].innerText){
            document.getElementById('gioithieu').innerHTML = "<br> Tên sản phẩm : "+mota[i]["tên "]+"<br> Xuất xứ : "+ mota[i]["src"]+"<br> Màu : "+mota[i]["mau"]+"<br> Cơ cấu : <br> Sim : "+ mota[i]["cocau "]["sim"]+" <br> Màn hình : "+ mota[i]["cocau "]['kinh']+"<br> Pin : "+mota[i]["cocau "]["pin"]+"<br> Giá : "+mota[i]["gia"];
            console.log( document.getElementById('gioithieu').innerHTML);
        }
    }
}
var mota = [
    {"tên ":'Iphone 9',"src":'Châu Mỹ (Hoa Kỳ)',"mau":"Trắng và đen","cocau ":[{"sim":"1 NANO SIM"},{'kinh':'Kính cường lực'},{"pin":'4500mAh'}],'gia':'$700'},
    {"tên ":'Samsung Galaxy Z Flip3',"src":'Hàn Quốc',"mau":"Vàng , xanh , tím và đen","cocau ":[{"sim":"2 sim 2 sóng"},{'kinh':' FHD+, Dynamix AMOLED 2X, 120Hz'},{"pin":'Li-Po 3300 mAh'}],'gia':'$400'},
    {"tên ":'Nokia 105 (2019)',"src":'Phần Lan',"mau":"Đen , hồng , lam,","cocau ":[{"sim":"2 sim 2 sóng"},{'kinh':'120 x 160 pixels'},{"pin":'Pin chuẩn Li-Ion 800 mAh'}],'gia':'$100'},
    {"tên ":'Sony Xperia 5',"src":'Nhật Bản',"mau":"Bạc và đen","cocau ":[{"sim":"2 Nano SIM "},{'kinh':'OLED6.1"Full HD+'},{"pin":'3140 mAh'}],'gia':'$450'},
    {"tên ":'Motorola Razr',"src":'Châu Mỹ (Hoa Kỳ)',"mau":"Trắng và đen","cocau ":[{"sim":"1 NANO SIM"},{'kinh':'loại gOLED rộng 2.7 inch'},{"pin":' 2.800 mAh'}],'gia':'$180'},
    {"tên ":'Oppo A15',"src":'Trung Quốc',"mau":"Bạch kim","cocau ":[{"sim":"2 Nano SIMHỗ trợ 4G"},{'kinh':'IPS LCD6.52"HD+'},{"pin":'4230 mAh'}],'gia':'$600'},
    {"tên ":'BPhone',"src":'Việt Nam',"mau":"Trắng ,xanh , hồng, đen","cocau ":[{"sim":"1 Nano SIM & 1 eSIM"},{'kinh':'6.1"Full HD+'},{"pin":'3000 mAh'}],'gia':'$90'}
];
function them(buttons){ 
    var cop = buttons.parentElement.cloneNode(true);
    var hang = cop.getElementsByTagName('button')[1];
    hang.innerText = "XOÁ"
     hang.setAttribute('onclick','xoa(this)');
     document.getElementById('giohang').appendChild(cop);
 
}
function xoa(buttons){ 
    var cop = buttons.parentElement;
    document.getElementById('giohang').removeChild(cop);
}
