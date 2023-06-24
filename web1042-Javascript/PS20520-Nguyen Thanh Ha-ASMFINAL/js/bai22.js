var arr = ['1.jpg', '2.jpeg', '3.jpg', '4.jpg', '5.jpg', '6.jpg', '7.jpg', '8.jpg'];
var i = 0;
var stt = document.getElementById('stt').innerHTML = 1 + ' / 8';
function next() {
     var chayanh = document.getElementById('chayanh');
     i++;
     if (i >= arr.length) {
          i = 0;
     }
     chayanh.src = "img/"+arr[i];

     document.getElementById('stt').innerHTML = Number(i + 1) + ' / ' + arr.length;

}
// stt.innerHTML = Number(i+1)+'/'+arr.length;
// function prev() {
//      var chayanh = document.getElementById("chayanh");
//      i--;
//      if (i < 0) {
//           i = arr.length - 1;
//      }
//      chayanh.src = arr[i];
//      document.getElementById('stt').innerHTML = Number(i + 1) + ' / ' + arr.length;
// }
var t = null;
function play() {
     t = setInterval(next, 2000);
}
// function stop() {
//      clearInterval(t);
// }