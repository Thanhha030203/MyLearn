function kiemtra(){ 
    var ht = document.frm1.ht.value;
    var cmnd = document.frm1.cmnd.value;
    var tinh = document.frm1.tinh.value;
    var bosung = document.frm1.bosung.value;
    var loi ="";
    if(ht.length <3 || ht.length>30){ 
        loi = loi+ "Họ tên phải nhập từ 3 đến 30 ký tự <br>";

    }
    if(cmnd.length !=9){ 
        loi = loi+ "CMND phải đúng 9 ký tự <br>";
        
    }
    var s = parent(cmnd);
    if(tinh==0){ 
        loi = loi + "Bạn chưa chọn được tỉnh <br>";
    }
    if(bosung.length<50 || bosung.length>1000){ 
        loi = loi + "Hẫy nhập thông tin bổ sung từ 50 đến 1000 ký tự";
    }
    if(loi.length <0){ 
        document.getElementById("loi").innerHTML = loi;
    }
    return false;
}