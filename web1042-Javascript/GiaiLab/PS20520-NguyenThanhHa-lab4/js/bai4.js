var w;
function moWin() {
    w = window.open("thongtin.html", "tt", "width= 500, height=500, top=50, left = 60");
    w.focus();
}
function dongWin() {
    w.close();
    if (w.closed) {
        alert("Đã đóng thành công");
    }
    else {
        alert("Cửa sổ chưa được đóng")
    }
}
function inWin() {
    w.print();
    w.focus();
}
function dichuyen() {
    w.moveBy(5, 10);
    w.focus();
}
function toidiem() {
    var x = prompt("Nhập toạ độ X : ");
    var y = prompt("Nhập toạ độ Y : ");
    w.moveTo(x, y);
    w.focus();

}