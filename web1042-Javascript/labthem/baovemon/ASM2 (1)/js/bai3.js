function chonmucgia(){
    var arr = document.getElementsByClassName('gia');
    var obj = document.getElementById('mucgia');
    mucdangchon = obj.value;
    for(i=0;i<arr.length;i++){
        gia = parseFloat(arr[i].innerText);
        if(gia<mucdangchon || mucdangchon == ""){
            arr[i].parentNode.style.display = "";
        }else{
            arr[i].parentNode.style.display = "none";
            
        }
    }
    tongtien();
}
function thaydoi(checkbox){
    var checkboxs = checkbox.parentElement.parentElement;
    var inputs = checkboxs.getElementsByClassName('soluong')[0];
    var tangg = checkboxs.getElementsByClassName('tang')[0];
    var giamm = checkboxs.getElementsByClassName('giam')[0];
    tangg.disabled = !tangg.disabled;
    giamm.disabled = !giamm.disabled;
    inputs.disabled = !inputs.disabled;
    if(inputs.disabled==true){
        inputs.value = 0;
        inputs.parentNode.nextElementSibling.innerText = "";
    }
    tongtien();
}
function thanhtien(obj){
    var soluong = obj.value;
    var gia = obj.parentNode.previousElementSibling.innerText;
    obj.parentNode.nextElementSibling.innerText = soluong*gia;
    tongtien();
}
function tongtien(){
    tt = 0;
    var thanhTien = document.getElementsByName('thanhtien');
    for(i=0;i<thanhTien.length;i++){
        if(thanhTien[i].parentNode.style.display==""){
            tien = thanhTien[i].innerText;
            tt += Number(tien);
        }
    }
    
    document.getElementById('tong').innerText = tt;
}
function cong(obj){
    obj.parentElement.getElementsByTagName('input')[0].value++;
    thanhtien(obj.parentElement.getElementsByTagName('input')[0]);
}
function tru(obj){
    obj.parentElement.getElementsByTagName('input')[0].value--;
    thanhtien(obj.parentElement.getElementsByTagName('input')[0]);
}
function hoadon(){
    alert("Tada ;-; vì khả năng còn hạn chế nên chưa thể cho bạn xem hóa đơn. Thông cảm cho mình nhé <3");
}