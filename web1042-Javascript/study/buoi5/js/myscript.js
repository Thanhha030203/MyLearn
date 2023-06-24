var arr = new Array();
arr[0]=1;
arr[1]=5;
arr[2]=10;
arr[3]=4;
arr[4]=20;
console.log(arr);
console.log(arr.length);
var arr1 = ["1.png","2.png","3.png","4.png"];
console.log(arr);
index =0;
function next(){
    document.getElementById('so').innerHTML="<img src ='images/'+' arr1[index]";
    index++;
}
index = arr.length-1;
function pre(){ 
    document.getElementById('so').innerHTML = arr1[index];
    index--;
}