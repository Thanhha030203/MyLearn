
    // var a= document.getElementById('a').value = prompt("Nhap so a","");
    // var b= document.getElementById('b').value = prompt("Nhap so b","");
    // var a =Number(document.getElementById('c').values());
    // var b = Number(document.getElementById('b').values());
function tinhtong(a,b){ 
    var number = document.getElementById('a').value ;
    var number1 = document.getElementById('b').value ;
    if(isNaN(number)||isNaN(number1) ){ 
        alert("Vui long nhập số");
    }
    else{ 
        var result = parseInt(number) + parseInt(number1);
         document.getElementById('c').value =result;
    }
}