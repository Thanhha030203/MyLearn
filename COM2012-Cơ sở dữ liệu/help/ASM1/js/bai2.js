var arr = new Array();
arr[0] = "h2.jpg";
arr[1] = "hl.jpg";
arr[2] = "mèo.png";
arr[3] = "sông.jpg";
console.log(arr);
console.log(arr.length);
//cách khai báo 2
var arr1 = ["h2.jpg","hl.jpg","mèo.png","sông.jpg"];
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