// var a = prompt ("Nhập số a ");
// var b = prompt ("Nhập số b ");
// var c =prompt ("Nhập số c ");
// document.write(a +"x<sup>2</sup> + "+ b +"x + "+c+ "= 0");
// var delta = Math.pow(b,2) - 4*a*c;
// if(delta < 0 ){ 
//     document.write("<p>Phương trình vô nghiệm </p>");
// }
// else if(delta ==0){
//     document.write("Phương trình có nghiệm kép ");
//     var x0 = -b/(2*a);
//     document.write("<p> x1 = x2 = "+ x0.toFixed(2)+"</p>");
// }
// else{ 
//     var x1 = (-b +Math.sqrt(delta))/(2*a);
//     var x2 = (-b - Math.sqrt(delta))/(2*a);
//     document.write("<p> Phương trình có 2 nghiệm : <br> <p>x1 = "+x1.toFixed(2) +"</p> <br>x2 = "+x2.toFixed(2)+"</p>");
// }
function phuongTrinh() {
    var a = document.getElementById('a').value;
    var b = document.getElementById('b').value;
    var c = document.getElementById('c').value;
    var delta = Math.pow(b, 2) - 4 * a * c;
    
    if (Number(a) == 0) {
        if (Number(b) == 0) {
            if (c == 0) {
                return ketqua = "Phương trình vô số nghiệm";
            }
            else {
                return ketqua = "Phương trình vô nghiệm";
            }
        }
        else {
            return ketqua = "Phương trình có một nghiệm x1 = "+ Number(- c/b).toFixed(2);
        }
    }
    else {
        if (delta < 0) {
            return ketqua = "Phương trình vô nghiệm";
        }
        else if (delta == 0) {

            // var x0 = -b/(2*a);
            return ketqua = "Phương trình có nghiệm kép x1 = x2 = "+Number(-b/(2*a));
        }
        else if (delta > 0) {
            var x1 = (-b +Math.sqrt(delta))/(2*a);
            var x2 = (-b - Math.sqrt(delta))/(2*a);
            // document.write("<p> Phương trình có 2 nghiệm : <br> <p>x1 = "+x1.toFixed(2) +"</p> <br>x2 = "+x2.toFixed(2)+"</p>");
            return ketqua = "Phương trình có 2 nghiệm : x1= "+x1.toFixed(2)+" và x2 = "+x2.toFixed(2);
        }
    }
    return ketqua;
}
function ngaunhien(){ 
    var chayngaunhien = document.getElementById('chayngaunhien');    
    var a = document.getElementById('a').value = chayngaunhien = Math.floor(Math.random()*(10-0)+0);
    var b = document.getElementById('b').value = chayngaunhien = Math.floor(Math.random()*(10-0)+0);
    var c = document.getElementById('c').value = chayngaunhien = Math.floor(Math.random()*(10-0)+0);
}