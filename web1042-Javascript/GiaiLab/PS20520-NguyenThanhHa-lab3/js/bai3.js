var exp = "";
var out = "" ;

function ganso(x){     
   exp = exp + x;
   document.getElementById('exp').value = exp;
}
function ganpheptinh(x){ 
    exp =  exp + x;
    document.getElementById('exp').value = exp;
}
function thuchien(){ 
    out = eval(exp);
    document.getElementById('output').value = out;
}
function lamlai(){ 
     exp = "";
     out = "";
     document.getElementById('exp').value = exp;
     document.getElementById('output').value = out;
}