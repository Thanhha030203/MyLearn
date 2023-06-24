var tt = new Intl.NumberFormat();
function tinhtien(input) {
    var hang = input.parentElement.parentElement;
    var rown = input.parentElement.parentElement.cloneNode(true);
    document.getElementById('giohang').appendChild(rown);
    // var check = hang.children[0].children[0].checked;
    var tinh = hang.children[2].innerText;
    var sl = hang.children[3].children[0].value;
    hang.children[4].innerText = parseInt(tinh) * parseInt(sl);
    var tinhs = document.getElementsByClassName('lay');
    var tong = 0;
    for (var i = 0; i < tinhs.length; i++) {
        var gtr = tinhs[i].innerText;
        if (gtr == "") {
            gtr = 0;
        }
        else {
            gtr = parseInt(gtr);

        }
        tong += gtr;
    }
    document.getElementById('tongtien').innerText = tt.format(tong);
}
function muahang(input) {
    document.getElementById('tongphaichi').style.display = "none";
    var row = input.parentElement.parentElement;
    var hang = row.getElementsByClassName('chay');
   
    for (var i = 0; i < hang.length ; i++) {
        
        if(hang[i].children[0].checked){ 
            var tao6 = document.createElement('div');
            var cart = document.getElementById('cart');
            cart.appendChild(tao6);
            
            var ok = document.getElementById('cart').children[0];
            
            var hangs = input.parentElement.parentElement;
            var tensp = document.createTextNode("   Tên sản phẩm :                      " + hangs.children[1].innerText);
            var dongia = document.createTextNode("   Đơn giá      :                       " + hangs.children[2].innerText);
            var slm = document.createTextNode("   Số lượng mua :                       " + hangs.children[3].children[0].value);
            var chi = document.createTextNode("   Tổng tiền cho loại sản phẩm:         " + hangs.children[4].innerText);
        
            var tao = document.createElement('pre');
            var tao1 = document.createElement('pre');
            var tao2 = document.createElement('pre');
            var tao3 = document.createElement('pre');
            var tao4 = document.createElement('hr');
        
            tao.appendChild(tensp);
            tao1.appendChild(dongia);
            tao2.appendChild(slm);
            tao3.appendChild(chi);
            ok.appendChild(tao);
            ok.appendChild(tao1);
            ok.appendChild(tao2);
            ok.appendChild(tao3);
            ok.appendChild(tao4);
            
        }
    }
}
function muahangn() {
    document.getElementById('cart').style.display = '';
    document.getElementById('tongphaichi').style.display = "";
    document.getElementById('tongphaichi').innerHTML = "tổng tiền phải chi trả là : " + document.getElementById('tongtien').innerHTML;
}
function quaylai() {

    var chon = document.getElementById('cart').children[0];
    document.getElementById('cart').removeChild(chon);
    var bang = document.getElementsByClassName('chay');
    for (var i = 0; i < bang.length; i++) {
        if (bang[i].children[0].checked == true) {
            bang[i].children[0].checked = !bang[i].children[0].checked;
            var row = bang[i].parentElement;
            var hang = row.children[3].getElementsByTagName('input')[0];


            hang.disabled = !hang.disabled;
            if (hang.disabled == true) {
                row.children[3].children[0].value = "";
                row.children[4].innerText = 0;
                tientinh();
            }
            else {
                var tinh = row.children[2].innerText;
                var sl = row.children[3].children[0].value;
                if (sl == "") {
                    sl = 0;
                }
                row.children[4].innerText = parseInt(tinh) * parseInt(sl);
                tientinh();
            }
        }
    }
    document.getElementById('cart').style.display = 'none';
    document.getElementById('tongphaichi').style.display = "none";
}
function thaydoi(input) {
    var row = input.parentElement.parentElement;
    var hang = row.children[3].getElementsByTagName('input')[0];
    // var so = row.children[4].innerText;
    hang.disabled = !hang.disabled;
    if (hang.disabled == true) {
        row.children[4].innerText = 0;
        tientinh();
    }
    else {
        var tinh = row.children[2].innerText;
        var sl = row.children[3].children[0].value;      
        if (sl == "") {
            sl = 0;
        }
        row.children[4].innerText = parseInt(tinh) * parseInt(sl);
        tientinh();
    }
}
function tientinh() {
    var tinhs = document.getElementsByClassName('lay');
    var tong = 0;
    for (var i = 0; i < tinhs.length; i++) {
        var gtr = tinhs[i].innerText;
        if (gtr == "") {
            gtr = 0;
        }
        else {
            gtr = parseInt(gtr);
        }

        tong += gtr;
    }
    document.getElementById('tongtien').innerText = tong;
    var rown = input.parentElement.parentElement;
    document.getElementById('giohang').removeChild(rown);
}
function mucgia() {
    var gia = document.getElementsByClassName('gia');
    var chongia = document.getElementById('chongia');
    var mucdangchon = chongia.value;
    for (var i = 0; i < gia.length; i++) {
        var gtri = gia[i].innerText;
        gtri = parseInt(gtri);
        if (gtri < mucdangchon) {
            gia[i].parentNode.style.display = "";
        }
        else {
            gia[i].parentNode.style.display = "none";
        }
    }
    tientinh();
}
document.getElementById('cart').style.display = 'none';
document.getElementById('tongphaichi').style.display = "none";

function gio(){ 
    var row = document.getElementsByClassName('chay');
    var tab = row[i].parentElement;;
    for(var i=0; i<row.length;i++){ 
        if(row[i].children[0].checked){ 
           
            document.getElementById('giohang').appendChild(tab);
        }
    }
}
console.log(gio());