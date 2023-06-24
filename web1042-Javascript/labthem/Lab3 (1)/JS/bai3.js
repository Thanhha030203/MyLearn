var so1 = null;
var so2 = null;
var pheptinh = null;
var kq = null;
function ganso(x){
    if(so1==null)
        so1 = x;
    else
        so2 = x;
    // console.log("Số 1 = "+ so1);
    // console.log("Số 2 = "+ so2);
    document.getElementById("So1").innerHTML = so1;
    document.getElementById("So2").innerHTML = so2;
}
function ganpheptinh(x){
    pheptinh = x;
    //console.log(x);
    document.getElementById("pheptinh").innerHTML = x;
}
function thuchien(){
    if(pheptinh=='+') kq = so1+so2;
    if(pheptinh=='-') kq = so1-so2;
    if(pheptinh=='*') kq = so1*so2;
    if(pheptinh=='/') kq = so1/so2;
    document.getElementById("result").innerHTML = kq;
}
function lamlai(){
    so1 = null;
    so2 = null;
    pheptinh = null;
    kq = null;
    document.getElementById("So1").innerHTML = null;
    document.getElementById("So2").innerHTML = null;
    document.getElementById("pheptinh").innerHTML = null;
    document.getElementById("result").innerHTML = null;
}
