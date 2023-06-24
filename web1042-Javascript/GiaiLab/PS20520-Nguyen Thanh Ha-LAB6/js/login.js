function validateForm(){ 
	var name = document.flogin.u.value;
	var pass = document.flogin.p.value;
	if(name==""){ 
		alert("bạn cần điền username");
		return false;
	}
	if(pass==""){ 
		alert("Bạn cần nhập password");
		return false;
	}
	alert("bạn đã hoàn thành form")
	return true;
}