function check(){ 
    arr = document.getElementsByName('me');
    var kq = document.getElementById('ketqua');
    document.getElementById('ketqua').style.display="";
    var dem =0;
    kq.innerHTML = "";
    for(var i=0; i<arr.length;i++){ 
        if(arr[i].checked){ 
            var v = arr[i].value;
            var chu = document.createTextNode(v);
            var tag = document.createElement('p');
            tag.appendChild(chu);
            kq.appendChild(tag);
            dem++;
        }
    }
    if(dem >0){ 
        kq.className="abc";
    }
    else{ 
        kq.innerHTML = "Bạn chưa chọn mục nào";
        kq.className = "xyz";
    }
}
document.getElementById('ketqua').style.display="none"; 