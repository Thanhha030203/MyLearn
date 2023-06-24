var so_bi_mat = Math.round(Math.random()*100);
while(true){
    var so_doan =prompt("Số cần đoán: ");
    if(so_doan == so_bi_mat){
        document.write("Đã đoán trúng");
        break;
    }else if(so_doan>so_bi_mat){
        document.write("Số bí mật nhỏ hơn số của bạn");
    }else{
        document.write("Số bí mất lớn hơn số của bạn");
    }
}