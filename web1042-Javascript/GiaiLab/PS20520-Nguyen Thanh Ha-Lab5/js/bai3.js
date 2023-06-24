var hieu  = true;
var count = 0;
var thang = 0;
document.getElementById('hienthi').innerText = hieu?"X":"O";
document.getElementById('hienthi').style.backgroundColor=  hieu?"#BFEFFF":"grey";
document.getElementById('hienthi').style.color = hieu?"rgb(20, 20, 20)":"white";
function nhan(index){
    document.getElementById('hienthi').innerText = hieu?"X":"O";
    var button = document.getElementsByTagName('button'); 
    button[index].innerText = hieu?"X":"O";
    button[index].style.backgroundColor = hieu?"#BFEFFF":"grey";
    button[index].style.color = hieu?"rgb(20, 20, 20)":"white";
    button[index].setAttribute("disabled","true");
    hieu=!hieu;
    count++;
    document.getElementById('hienthi').innerText = hieu?"X":"O";
    document.getElementById('hienthi').style.backgroundColor=  hieu?"#BFEFFF":"grey";
document.getElementById('hienthi').style.color = hieu?"rgb(20, 20, 20)":"white";
    if(count ==9){ 
        document.getElementById('ketqua').style.display="";
        document.getElementById('ketqua').innerHTML= "NONE WIN";
    }
    if(button[0].innerText=="X"&&button[1].innerText=="X"&&button[2].innerText=="X"
    ||(button[0].innerText=="X"&&button[4].innerText=="X"&&button[8].innerText=="X")
    || (button[0].innerText=="X"&&button[3].innerText=="X"&&button[6].innerText=="X")
    ||(button[2].innerText=="X"&&button[4].innerText=="X"&&button[6].innerText=="X")
    ||( button[1].innerText=="X"&&button[4].innerText=="X"&&button[7].innerText=="X")
    ||(button[2].innerText=="X"&&button[5].innerText=="X"&&button[8].innerText=="X")
    ||button[3].innerText=="X"&&button[4].innerText=="X"&&button[5].innerText=="X"
    ||button[6].innerText=="X"&&button[7].innerText=="X"&&button[8].innerText=="X"){
        document.getElementById('ketqua').style.display="";
        document.getElementById('ketqua').style.backgroundColor = "#BFEFFF";
        document.getElementById('ketqua').style.color = "rgb(20, 20, 20)";
        document.getElementById('ketqua').innerHTML= "X WIN";
        thang ++;
        sessionStorage.setItem("số lần x thắng : ", thang);
        document.getElementById('thang').innerHTML = thang;
     
      
    }
    if(button[0].innerText=="O"&&button[1].innerText=="O"&&button[2].innerText=="O"
    ||(button[0].innerText=="O"&&button[4].innerText=="O"&&button[8].innerText=="O")
    || (button[0].innerText=="O"&&button[3].innerText=="O"&&button[6].innerText=="O")
    ||(button[2].innerText=="O"&&button[4].innerText=="O"&&button[6].innerText=="O")
    ||( button[1].innerText=="O"&&button[4].innerText=="O"&&button[7].innerText=="O")
    ||(button[2].innerText=="O"&&button[5].innerText=="O"&&button[8].innerText=="O")
    ||(button[3].innerText=="O"&&button[4].innerText=="O"&&button[5].innerText=="O")
    ||(button[6].innerText=="O"&&button[7].innerText=="O"&&button[8].innerText=="O")){
        document.getElementById('ketqua').style.display="";
        document.getElementById('ketqua').style.backgroundColor = "grey";
        document.getElementById('ketqua').style.color = "white";
        document.getElementById('ketqua').innerHTML= "O WIN";     
    }
}
document.getElementById('ketqua').style.display="none";
function reset(){ 
    location.reload();
    document.getElementById('ketqua').style.display="none";
}
var thang = sessionStorage.getItem ("số lần x thắng : ");
if(thang==null)
    thang =0;
    document.getElementById('thang').innerHTML = thang;
// thang ++;
// sessionStorage.setItem("số lần x thắng : ", thang);
// document.getElementById('thang').innerHTML = thang;
// ta có sesionstorage là khi reload lại trang dữ liệu không bị mất nhưng khi bật lại trang từ đầu thì dữ liệu sẽ bị reset

// nhưng localStorage khi reload lại trang hay chạy lại trang từ đầu thì dữ liệu cũng không bị mất