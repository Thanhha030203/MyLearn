function them(button){
    var row = button.parentElement.parentElement.cloneNode(true);
    var btnXoa = row.getElementsByTagName("button")[0];
    btnXoa.innerText = "Xóa";
    btnXoa.setAttribute('onclick','xoa(this)');
    document.getElementById("cart").appendChild(row);
    tinhtong();
    document.getElementById("bot").style.display = "";
    document.getElementById("tongtien").style.display = "";
}
function xoa(button){
    var row = button.parentElement.parentElement;
    document.getElementById("cart").removeChild(row);
    tinhtong();
}
function thaydoi(checkbox){
    var checkboxs = checkbox.parentElement.parentElement;
    var button = checkboxs.getElementsByTagName('button')[0];
    button.disabled = !button.disabled;
}
function tinhtong(){
    var cart = document.getElementById("cart");
    var rows = cart.getElementsByTagName("tr");
    var tong = 0;
    for(var i=0;i<rows.length;i++){
        var price = rows[i].children[2].innerText;
        price = parseInt(price);
        tong += price;
    }
    document.getElementById("tong").innerText = tong;
}
document.getElementById("bot").style.display = "none";
document.getElementById("tongtien").style.display = "none";
