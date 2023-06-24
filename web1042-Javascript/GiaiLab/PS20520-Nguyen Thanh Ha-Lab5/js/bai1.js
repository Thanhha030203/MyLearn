function hienthi(){ 
    var tensp = document.getElementById('ten').innerText;
    var soluongsp = document.getElementById('qty').value ;
    var giasp = document.getElementById('pro').getAttribute('data-price');
    var tinhtien = giasp*soluongsp;
    document.getElementById('name').innerText = tensp;
    document.getElementById('name').style.color= 'green';
    document.getElementById('amount').innerText = "$"+tinhtien;
    document.getElementById('amount').style.color = "green"
}