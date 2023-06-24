var ht = document.getElementById('ht').innerHTML = prompt("Bạn tên gì");
var ns = document.getElementById('ns').innerHTML = prompt("Bạn sinh năm nào");
if (isNaN(ns)) {
    alert("Vui long nhap số nha  :");
    do {
        var ns = document.getElementById('ns').innerHTML = prompt("Bạn sinh năm nào");
    } while (isNaN(ns) == true);
}
var t = document.getElementById('t').innerHTML = tinhtuoi(ns);

