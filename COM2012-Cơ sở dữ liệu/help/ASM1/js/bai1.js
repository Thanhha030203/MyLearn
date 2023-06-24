function ptbac2(){
    var a = Number(document.getElementById("soA").value);
    var b = Number(document.getElementById("soB").value);
    var c = Number(document.getElementById("soC").value);
//    if(isNaN(a)==true || a<0 || a>10 || isNaN(b)==true || b<0 || b>10 || isNaN(c)==true || c<0 || c>10){
 //       var s = "Bạn nhập sai a,b,c <br>(a,b,c là số và 0<= a,b,c <=10)";
//    }else{
        var delta = Math.pow(b,2) - 4*a*c;
        if(delta<0){
            var s = "<p>PT Vô nghiệm</p>";
        }else if(delta==0){
            var s = "<p>Phươn trình có nghiệm kép:<br> x = "+ (-b/(2*a)).toFixed(2) +"</p>";
        }else{
            var s = "Có 2 nghiệm phân biệt: <br> x1 = "+ ((-b + Math.sqrt(delta))/(2*a)).toFixed(2) +" <br> x2 = "+ ((-b + Math.sqrt(delta))/(2*a)).toFixed(2);
        }
//    }
    
    document.getElementById("kq").innerHTML = s;
    document.getElementById("thuchien1").disabled = true;
}
function choso(){
    document.getElementById('soA').value = Math.round(Math.random()*10);
    document.getElementById('soB').value = Math.round(Math.random()*10);
    document.getElementById('soC').value = Math.round(Math.random()*10);
    document.getElementById("thuchien1").disabled = false;
}
var slg = sessionStorage.getItem('solangiai');
if(slg==null) slg = 0;
slg++;
sessionStorage.setItem('solangiai',slg);
document.getElementById("slg").innerHTML = slg;

var today = new Date();
var date = today.getDate()+'/'+(today.getMonth()+1)+'/'+today.getFullYear();
var time = today.getHours() + ":" + today.getMinutes() + ":" + today.getSeconds();
var dateTime = date+' '+time;
document.getElementById("homnay").innerHTML = dateTime;
