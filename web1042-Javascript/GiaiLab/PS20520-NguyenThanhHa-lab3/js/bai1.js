
function add(){ 
    so1 = document.getElementById('so1').value;
    so2 = document.getElementById('so2').value;
 var cong = parseInt(so1) +parseInt(so2);
       
 hienthi.value =cong;

}
function struc(){ 
    so1 = document.getElementById('so1').value;
    so2 = document.getElementById('so2').value;
     var tru = parseInt(so1) -  parseInt(so2);
   hienthi.value= tru;

}
function mul(){ 
    so1 = document.getElementById('so1').value;
    so2 = document.getElementById('so2').value;
     var nhan = parseInt(so1) *  parseInt(so2);
    hienthi.value = nhan;

}
function div(){ 
    so1 = document.getElementById('so1').value;
    so2 = document.getElementById('so2').value;
     var chia = parseInt(so1) /  parseInt(so2);
    hienthi.value = chia.toFixed(2);

}
function kq(){ 
    // var ketqua = document.getElementById('ketqua').value;
    // ketqua.style.display = "none"
    //  document.getElementById('hienthi').value = ketqua.value;
    // if(button.onclick){ 
    document.getElementById('hienthi').value= hienthi;
    

}