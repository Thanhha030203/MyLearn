var d = new Date();
//document.body.innerHTML = d;

document.body.innerHTML = new Date (d.getDate(), d.getMonth()); // cách này không cho giá trị)
//var month = d.getMonth(); // xuất ra tháng hiện tại
//document.body.innerHTML = month;
document.body.innerHTML = d.getSeconds();