var a = prompt("Toán hạng a: ");
var b = prompt("Toán hạng b: ");
var o = prompt("Toán tử: ");

function phanTich(){
    document.getElementById('demo').style.color='orange';
    switch (o) {
        case '+':
            var kq = Number(a) + Number(b);
            document.getElementById("demo1").innerHTML = ("Tổng: " + kq);
            break;
        case '-':
            var kq = Number(a) - Number(b);
            document.getElementById("demo1").innerHTML = ("Hiệu: " + kq);
            break;
        case 'x':
            var kq = Number(a) * Number(b);
            document.getElementById("demo1").innerHTML = ("Tích: " + kq);
            break;
        case ':':
            var kq = Number(a) / Number(b);
            document.getElementById("demo1").innerHTML = ("Thương: " + kq);
            break;
        default:
            document.getElementById("demo1").innerHTML = (o+ " Không phải là toán tử");
            break;
    }
}

