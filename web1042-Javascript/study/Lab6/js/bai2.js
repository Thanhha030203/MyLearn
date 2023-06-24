function kiemtra(button){ 
    var buttons = button.parentElement.parentElement;
    var hang = buttons.getElementsByTagName('p');
    
        if(hang[0].children[1].values =""){
           hang[0].children[2].innerText = "Vui lòng nhập tên sp";
        
    }
    
    if(hang[1].children[1].values =""){
        document.getElementById('test2').innerHTML = "Vui lòng nhập loại sp";
}
 
if(hang[2].children[1].values =""){
    document.getElementById('test3').innerHTML = "Vui lòng nhập đơn giá sp";
}
if(hang[3].children[1].checked == false &&hang[3].children[2].checked == false){
    document.getElementById('test4').innerHTML = "Vui lòng chọn nơi nhập ";
}
}