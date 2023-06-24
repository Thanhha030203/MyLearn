function rad(){
    document.getElementById('a').value = Number(Math.round(Math.random()*10));
    document.getElementById('b').value = Number(Math.round(Math.random()*10));
}
function ktr(){
    var nhapvao = document.getElementById('da');
    var ketqua = Number(document.getElementById('a').value) + Number(document.getElementById('b').value);
    if(ketqua == nhapvao.value) var thongbao = "GIỎI QUÁ BÉ ƠI";
    else var thongbao = "SAI RỒI BÉ";
    document.getElementById('kq').innerHTML = thongbao;
}