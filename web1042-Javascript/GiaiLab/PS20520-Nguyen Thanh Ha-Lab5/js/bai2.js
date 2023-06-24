function them(button){ 
    var row = button.parentElement.parentElement.cloneNode(true);
    var them = row.getElementsByTagName('button')[0];
    them.innerText = "Xoá";
    them.setAttribute("onclick","xoa(this)");
    document.getElementById('cart').appendChild(row);
    document.getElementById('cart').style.display = "";
    document.getElementById('tong').style.display = "";
    tinhtong();
}
function xoa(button){ 
    var row = button.parentElement.parentElement;
    document.getElementById('cart').removeChild(row);
    document.getElementById('cart').style.display = "";
    document.getElementById('tong').style.display = "";
    tinhtong()
}
function thaydoi(checkbox){ 
    var checkboxs = checkbox.parentElement.parentElement;
    var button = checkboxs.getElementsByTagName('button')[0];
    button.disabled = !button.disabled;
}
function tinhtong(){ 
    var bang = document.getElementById('cart');
    var hang = bang.getElementsByTagName('tr');
    var tong = 0;
    for(var i=0; i<hang.length;i++){ 
        var gtr = hang[i].children[2].innerText;
        gtr = parseInt(gtr);
        tong += gtr;
    }
    document.getElementById('tong').innerText ="Tổng giá la :"+ tong;
}
document.getElementById('cart').style.display = "none";
document.getElementById('tong').style.display = "none";
const chonhet = e=>
{ 
    let ele = document.querySelectorAll('input[type = "checkbox"]');
    ele.forEach(item,i=> {
        item.checked = e.checked;
});
}