var slx = sessionStorage.getItem("So lan xem");
if(slx==null)
    slx =0;
    slx++;
    sessionStorage.setItem("So lan xem",slx);  
    document.getElementById('slx').innerHTML =slx;
     //<span id="slx"></span>
     function reset(){ 
         location.reload();
     }