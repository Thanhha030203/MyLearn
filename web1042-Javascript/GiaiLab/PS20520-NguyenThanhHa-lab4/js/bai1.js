var pt2 = new Object();
pt2.a = null;
pt2.b = null;
pt2.c = null;
pt2.nhap = function(){ 
    do{
        this.a = window.prompt("Nhập số a");
    }while(isNaN(this.a)==true);
    do{
        this.b = window.prompt("Nhập số b");
    }while(isNaN(this.b)==true);
    do{
        this.c = window.prompt("Nhập số c");
    }while(isNaN(this.c)==true);
    str = this.a+"x<sup>2</sup>+ "+ this.b + "x+ "+this.c + " =0"
    document.getElementById('pt').innerHTML = str;
}
pt2.giai = function(){ 
    var delta = this.b * this.b - 4*this.c*this.a;
    if(delta <0){ 
        document.getElementById('kq').innerHTML = "Phương trình vô nghiệm";
    }
    else if(delta ==0){ 
        var x = (-this.b / (2 * this.a));
        document.getElementById('kq').innerHTML = "Phương trình có nghiệm kép <br> x1 = x2 = " + x.toFixed(2)
    }
    else { 
        var x1 = (-this.b + Math.sqrt(delta)) / (2 * this.a);
        var x2 = (-this.b - Math.sqrt(delta)) / (2 * this.a);
        document.getElementById('kq').innerHTML  = "Phương trình có 2 nghiệm :<br> x1= " + x1.toFixed(2) + " và x2 = " + x2.toFixed(2);
    }
}
