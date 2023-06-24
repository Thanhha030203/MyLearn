var arr = ["anh0.jpg","anh1.jpg","anh2.jpg","anh3.jpg","anh4.jpg","anh5.jpg"];
console.log(arr);
index = 0;
function next(){
    if(index>=arr.length-1)
        index = 0;
    document.getElementById("so").src = 'img/'+ arr[index];
    index++;
    thongbao();
    thongbao2();
} 
index = arr.length - 1;
function pre(){
    if(index<=0)
        index = arr.length-1;
    document.getElementById("so").src = 'img/'+ arr[index];
    index--;
    thongbao();
    thongbao2();
}
var t = null;
function play(){
    t = setInterval(next,3000);
    thongbao();
    thongbao2();
}
function stop(){
    clearInterval(t);
}
function thongbao(){
    if(index == 0){
        alert("Ảnh ban Đầu");
    }
}
function thongbao2(){
    if(index == 6){
        alert("Đã hết ảnh");
    }
}
function nhan (){ 
    var hinh =  document.getElementById("so").src
    console.log(hinh);
    for (var i=0; i<arr.length;i++){ 
        if(hinh === "http://127.0.0.1:5500/img/"+arr[i]){ 
            document.getElementById('soanh').src ="http://127.0.0.1:5500/img/"+arr[i];
            document.getElementById('loi').innerHTML = "tên hoa : "+gioithieu[i]["ten : "]+"<br> Màu hoa :"+gioithieu[i]["Màu : "]+"<br> Số lượng : "+gioithieu[i]["sl :"];
        }
    }
}
var gioithieu = [
    {'ten : ': "Hoa sen ", "Màu : ":"Hồng sữa","sl :":"Một đám"},
    {'ten : ': "Hoa sen ", "Màu : ":"Hồng sữa","sl :":"Một bông"},
    {'ten : ': "tim tím ", "Màu : ":"tím sữa","sl :":"2 bông"},
    {'ten : ': "bong bóng ", "Màu : ":"tím đậm","sl :":"Một đám"},
    {'ten : ': "ly ", "Màu : ":"Hồng đỏ","sl :":"Một gánh"},
    {'ten : ': "cúc", "Màu : ":"trắng","sl :":"Một đoá"}
]
