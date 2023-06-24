var arr = ['hoa1.jpg', 'hoa2.jpg', 'hoa3.jpg', 'hoa4.jpg', 'hoa5.jpg', 'hoa6.jpg', 'hoa7.jpg', 'hoa8.jpg'];
var i = 0;
var stt = document.getElementById('stt').innerHTML = 1 + ' / 8';
function next() {
     var chayanh = document.getElementById('chayanh');
     i++;
     if (i >= arr.length) {
          i = 0;
     }
     chayanh.src = arr[i];

     document.getElementById('stt').innerHTML = Number(i + 1) + ' / ' + arr.length;

}
// stt.innerHTML = Number(i+1)+'/'+arr.length;
function prev() {
     var chayanh = document.getElementById("chayanh");
     i--;
     if (i < 0) {
          i = arr.length - 1;
     }
     chayanh.src = arr[i];
     document.getElementById('stt').innerHTML = Number(i + 1) + ' / ' + arr.length;
}
var t = null;
function play() {
     t = setInterval(next, 1000);
}
function stop() {
     clearInterval(t);
}