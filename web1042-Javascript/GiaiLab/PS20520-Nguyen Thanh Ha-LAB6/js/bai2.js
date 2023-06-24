document.getElementById('an').style.display = "none";
function hienthi(nhan){ 
    if(nhan){ 
        document.getElementById('an').style.display = "";  
    }
    else{
        document.getElementById('an').style.display = "none";  
    }
}
var ten = document.getElementById('ten');
if(ten.value = ""){
    alert("vui lòng nhập tên cho sản phẩm");
    thongbao= false;
}
function ktra (){ 
    thanhcong = true;
    thongbao = "";
    var sp = document.getElementById('tensp');
    if(sp.value.length ==0){ 
        thongbao += "Nhập tên sản phẩm";
        thanhcong=false;
    }
    var gia = document.getElementById('gia');
 
        if(gia.value==""){ 
            thanhcong += "Bạn chưa nhập giá";
            thanhcong = false;
        }
        if(isNaN(gia.value)==true){ 
            thanhcong += "Bạn nhập giá trị số nhé";
            thanhcong = false;
        }
        if(parent(gia.value)<=0){ 
            thanhcong += "Bạn nhập giá trị dương nha";
            thanhcong = false;
        }
        var loai = document.getElementById('loai');
        if(loai.value==""){ 
            thongbao +="Chọn 1 loại sản phẩm đi";
            thanhcong = false;
        }
    var radios = document.getElementsByName('dc');
    if(radios[0].checked == false && radios[1].checked==false){ 
        thongbao = "Vui lòng chọn nơi giao hang";
        thanhcong = false;
    }
    if(thongbao==""){ 
        thongbao="Nhập đúng dữ liệu ";
        document.getElementById('kq').innerHTML = thongbao;
        return thongbao;
    }
}