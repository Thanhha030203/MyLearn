var dhchay = null;
function dh(){ 
    var dongho = new Date();
    var gio = dongho.getHours();
    var phut = dongho.getMinutes();
    var giay = dongho.getSeconds();
    document.getElementById('thoigian').innerHTML = gio +":"+phut+":"+giay;  
}
dhchay = setInterval('dh()',1000);
function dhc(){ 
    if(dhchay == null){ 
        dhchay = setInterval('dh()',1000);
        document.getElementById('gtr').value = "Bấm để dừng"
    }
    else{ 
        clearInterval(dhchay);
        dhchay = null;
        document.getElementById('gtr').value = "Bấm lại để chạy tiếp ";
    }
}
setTimeout('alert("Kính chào!")',10000)
function reset(){ 
    location.reload();
}