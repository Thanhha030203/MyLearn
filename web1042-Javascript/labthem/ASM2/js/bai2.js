var arr1 = ["fpt1.png","fpt2.jpg","fpt3.png","fpt4.png"];
console.log(arr1);
index = 0;
function next(){
    if(index>=arr1.length-1)
        index = 0;
    document.getElementById("so").src = 'img/'+ arr1[index];
    index++;
} 
index = arr1.length - 1;
function pre(){
    if(index<=0)
        index = arr1.length-1;
    document.getElementById("so").src = 'img/'+ arr1[index];
    index--;
}
var t = null;
function play(){
    t = setInterval(next,5000);
}
function stop(){
    clearInterval(t);
}