var arr = ['1.jpg','2.jpg','3.jpg','4.jpg','5.jpg','6.jpg','7.jpg','8.jpg','5.png'];
var stt = 0;
function pre(){ 
    stt --;
    if(stt<0){ 
        stt = arr.length-1;
    }
    document.getElementById('anh').src = "img/"+arr[stt];
}
function next(){ 
    stt ++;
    if(stt>arr.length-1){ 
        stt = 0;
    }
    document.getElementById('anh').src = "img/"+arr[stt];
}
function fir(){ 
    stt = 0;
    document.getElementById('anh').src = "img/"+arr[stt];
}
function last(){ 
    stt =arr.length-1;
    document.getElementById('anh').src = "img/"+arr[stt];
}