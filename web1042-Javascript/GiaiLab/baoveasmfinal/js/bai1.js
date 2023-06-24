var mang = ['1.png','2.png','3.png','4.png'];
stt =0;
function next(){ 
    if(stt > mang.length-1){ 
        stt = mang.length-1;
        alert ("Đã hết ảnh");
    }
    
    document.getElementById('anh').src = "img/"+mang[stt];
    stt++;
}
stt = mang.length-1;
function pre(){ 
    if(stt < 0){  
        stt=0;
        alert ("Ảnh ban đầu");
    }
    document.getElementById('anh').src = "img/"+mang[stt];
    stt--;
}

