// var f0 = 1;
// var f1 = 2;
// function hienthi(){ 
//     for(var i=0; i<10; i++){ 
//         var fibonacci = f0 + f1;
        
//          document.write ("<span>"+fibonacci+"  "+"</span>");
//         // y.style.color ="#999";
//         f0= f1;
//         f1 = fibonacci;
//         // return fibonacci;
        
//     }
    
// }
// document.getElementById('fibonacci').innerHTML = fibonacci
 
    function hienthi(f0,f1){ 
        var f0 = document.getElementById('f0').value ;
        var f1 = document.getElementById('f1').value ;
        if(isNaN(f0)==true){ 
            f0 = 1;
        }
        if(isNaN(f1)==true){ 
            f1 = 2
        }
    for(var i=0; i<10; i++){ 
        var fibonacci = parseInt(f0) + parseInt(f1);
         document.write ("<span>"+fibonacci+"  "+"</span>");
        // y.style.color ="#999";
        f0= f1;
        f1 = fibonacci;
    }
}
    // for (var i = 0; i < 10; i++) {
    //     var fibonacci = f0 + f1;
    //     document.write("<span>"+fibonacci+"</span>");
    //     // y.style.color ="#999";
    //     f0 = f1;
    //     f1 = fibonacci;
    //     // return fibonacci;
    // }
