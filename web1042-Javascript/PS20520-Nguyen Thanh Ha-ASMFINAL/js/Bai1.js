
var solan = 0;
function Nhap(){  
    button.disabled = false;
}
const button = document.getElementById('delta');
function phuongTrinh() {
   
    var a = document.getElementById('a').value;
    var b = document.getElementById('b').value;
    var c = document.getElementById('c').value;
    if(isNaN(a)==true||isNaN(b)==true || isNaN(c)==true ||
    Number(a) > 10 || Number(a) < 0 || Number(b) > 10 || Number(b) < 0
    || Number(c) > 10 || Number(c) < 0
    ){ 
        if (isNaN(a) == true) {
            alert('Nhập số cho a đừng nhập chữ');
            document.getElementById('a').style.background = '#828282';
            document.getElementById('ketqua').value  = "Không thể giải vì a không phải là số";
        }
        else if (Number(a) > 10 || Number(a) < 0) {
            alert("Bui lòng nhập số a>=0 và a<=10");
            document.getElementById('ketqua').value  = "Ghi đúng khoảng mới giải";
        }   
        if (isNaN(b) == true) {
            alert('Nhập số cho b đừng nhập chữ');
            document.getElementById('b').style.background = '#828282';
            document.getElementById('ketqua').value  = "Không thể giải vì b không phải là số";
        }
        else if (Number(b) > 10 || Number(b) < 0) {
            alert("Bui lòng nhập số b>=0 và b<=10");
            document.getElementById('ketqua').value  = "Ghi đúng khoảng mới giải";
        }
        
        if (isNaN(c) == true) {
            alert('Nhập số cho c đừng nhập chữ');
            document.getElementById('c').style.background = '#828282';
            document.getElementById('ketqua').value  = "Không thể giải vì c không phải là số";
        }
        else if (Number(c) > 10 || Number(c) < 0) {
            alert("Bui lòng nhập số c>=0 và c<=10");
            document.getElementById('ketqua').value  = "Ghi đúng khoảng mới giải";
        }
    }
    else {
        document.getElementById('a').style.background = '#FFFFFF'
        document.getElementById('b').style.background = '#FFFFFF'
        document.getElementById('c').style.background = '#FFFFFF'
        var delta = Math.pow(b, 2) - 4 * a * c;
        if (Number(a) == 0) {
            if (Number(b) == 0) {
                if (c == 0) {
                    document.getElementById('ketqua').value  = "Phương trình vô số nghiệm";
                }
                else {
                    document.getElementById('ketqua').value  = "Phương trình vô nghiệm";
                }
            }
            else {
                document.getElementById('ketqua').value  = "Phương trình có một nghiệm x1 = " + Number(- c / b).toFixed(2);
            }
        }
        else {
            if (delta < 0) {
                document.getElementById('ketqua').value  = "Phương trình vô nghiệm";
            }
            else if (delta == 0) {

                // var x0 = -b/(2*a);
                document.getElementById('ketqua').value  = "Phương trình có nghiệm kép x1 = x2 = " + Number(-b / (2 * a));
            }
            else if (delta > 0) {
                var x1 = (-b + Math.sqrt(delta)) / (2 * a);
                var x2 = (-b - Math.sqrt(delta)) / (2 * a);
                // document.write("<p> Phương trình có 2 nghiệm : <br> <p>x1 = "+x1.toFixed(2) +"</p> <br>x2 = "+x2.toFixed(2)+"</p>");
                document.getElementById('ketqua').value  = "Phương trình có 2 nghiệm : x1= " + x1.toFixed(2) + " và x2 = " + x2.toFixed(2);
            }
        }
        var button = document.getElementById('delta');

            button.disabled = true;
            // document.getElementById('delta').disabled= true;
            solan++;
            document.getElementById('solan').innerHTML = solan + ' lần';
        
        // if(typeof(localStorage)!==undefined){ 
        //     if(localStorage.clickphuongTrinh){
        //         localStorage.clickphuongTrinh = Number(localStorage.clickphuongTrinh)+1;
        //     }
        //     else{ 
        //         localStorage.clickphuongTrinh = 1;
        //     }
        //     document.getElementById('solan').innerHTML = localStorage.clickphuongTrinh+'lan';
        // } 

    }
}
function ngaunhien() {
    var chayngaunhien = document.getElementById('chayngaunhien');
    var a = document.getElementById('a').value = chayngaunhien = Math.floor(Math.random() * (10 - 0) + 0);
    var b = document.getElementById('b').value = chayngaunhien = Math.floor(Math.random() * (10 - 0) + 0);
    var c = document.getElementById('c').value = chayngaunhien = Math.floor(Math.random() * (10 - 0) + 0);
    button.disabled = false;
    // document.getElementById('delta').disabled= false;
}
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
    document.getElementById('thoigian').innerHTML = date + '/' + mon + '/' + year + '  ' + hour + ':' + min + ':' + sec;
    setInterval("hour1()", 1000);

}
hour1();