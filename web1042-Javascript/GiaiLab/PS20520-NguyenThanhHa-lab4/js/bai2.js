var sv = new Object();
    sv.hoten = prompt("ho ten sinh vien : ")
    sv.diem = prompt("Nhap diem : ");
    sv.hienthitn = function(){ 
        if(this.diem >= 5){ 
            this.hocluc = "Đậu";
        }
        else this.hocluc = "rớt"
        document.getElementById("hienthi").innerHTML = "<p> Họ và tên : <span>"+this.hoten+"</span></p>";
        document.getElementById("hienthi").innerHTML += "<p> Điểm : <span>"+this.diem+"</span></p>";
        document.getElementById("hienthi").innerHTML += "<p> Học lực : <span>"+this.hocluc+"</span></p>";

    }
