stt1 =0;
var mau = ['#00FF99', '#00FFFF', '#FFFF66', '#FF99CC', '#FF6600', '#FF3333', 'rgb(200,0,0)'];
setInterval(function () {
	if (stt1 >= mau.length-1) {
		stt1 = 0;
	}
	document.getElementById('bo').style.border ="5px solid "+ mau[stt1];
	stt1++;
},500);

