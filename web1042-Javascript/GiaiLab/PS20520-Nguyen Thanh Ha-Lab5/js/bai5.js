var nf = new Intl.NumberFormat();
function tinhtien(){ 
    var nguoilon_arr = document.getElementsByClassName('nl');
    var treem_arr = document.getElementsByClassName('te');
    var sotien_arr = document.getElementsByClassName('tien');
    var tongnguoilon = 0, tongtreem =0, tongtien =0;
    for(var i=0; i<nguoilon_arr.length;i++){ 
        var songuoilon = nguoilon_arr[i].innerText;
        var sotreem = treem_arr[i].innerText;
        songuoilon = parseInt(songuoilon);
        sotreem = parseInt(sotreem);
        tongnguoilon += songuoilon;
        tongtreem += sotreem;
        t = songuoilon*1000000 + sotreem*600000;
        tongtien +=t;
        sotien_arr[i].innerText = nf.format(t);
    }
    document.getElementById('tongnl').innerText = tongnguoilon;
    document.getElementById('tongte').innerText = tongtreem;
    document.getElementById('tongtien').innerText = nf.format(tongtien);
}
function tien(obj){ 
    var row = obj.parentNode;
    son1 = row.children[1].innerText;
    sote = row.children[2].innerText;
    t = son1*1000000 + sote*600000;
    row.children[3].innerText = nf.format(t);
}
function dh (){ 
    var h = new Date();
    var gio = h.getHours();
    var phut = h.getMinutes();
    var giay = h.getSeconds();
    document.getElementById('ngay').innerHTML = gio+":"+phut+":"+giay;
    setInterval(dh,1000);
}
dh();