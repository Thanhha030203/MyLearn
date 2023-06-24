

function tinh(){ 
    var bk = document.getElementById('bk'); 
    var c = document.getElementById('c');
    var s=  document.getElementById('s');
    const PI = 3.14;
    var cv = 2*(Number(bk.value))*PI;
    var dt = (Number(bk.value))*(Number(bk.value))*PI;
    
    c.value = cv.toFixed(2);
 
   s.value = dt.toFixed(2);
}
