function nhap(gtr){
       if(gtr ==='1'){ 
            var a = document.getElementById('a');
        // var a =document.getElementsByClassName('a');
        // var b = document.getElementById('b');
        var tong = document.getElementById('tong');
        var tinh =Number(a.value);
        // var tinh= Number(a.value) + Number(b.value);
        tong.value = Number(tinh);
       }
       if(gtr ==='2'){ 
        var a1 = document.getElementById('a1');
    // var a =document.getElementsByClassName('a');
    // var b = document.getElementById('b');
    var tong = document.getElementById('tong');
    var tinh =Number(a1.value);
    // var tinh= Number(a.value) + Number(b.value);
    tong.value = Number(tinh);
   }
}