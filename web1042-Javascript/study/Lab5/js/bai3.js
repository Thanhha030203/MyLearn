var flag = true;
var count = 0;
const arr = Array.from(index);
const win = [[0,1,2],[3,4,5],[6,7,8],[0,4,8],[1,4,7],[2,4,6]];
function mark(index){
    var button = document.getElementsByTagName("button")[index];
    button.innerText = flag? "X":"O";
    button.style.background = flag? "aqua":"yellow";
    button.setAttribute("disabled","true");
    flag = !flag;
    
    count++;
    if(count==8){
        alert("Gmae over");
        location.reload();
        
    }
}
function checkwin(index){
    
}