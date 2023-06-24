import{Component} from'@angular/core';
@Component({ 
	selector:"hello-ng-world",
	template: '<h1>Hello Angular world<h1>'

})
export class HelloWorld{

}
// Bind dữ liệu 
/* angular có cách code binding( kết nối giữa html và data) dữ liệu theo kiểu 2 chiều, nghĩa là html input thay dổi thì biến
javacript sẽ ngay lập tức nhận được giá trị trả về và ngược lại, giá trị
trong js thay đổi thì lâph tức màn hình htmk thay đổi theo
Để bind một chuỗi ra màn hình html thì rấy đơn giản sử dụng 2 dấu ngoặc nhọn {{tenbien}}.
*/
import {Component} from '@angular/core';
@Component({ 
selector:'hello-ng-world',
template:`<h1>Hello{{tên biến}}world</h1>`})
//hiển thị biến javacript ra html. Chú ý đoạn natf sử dụng dấu `` thay vì ''
// vì lúc này chúng ta nhúng cả code angular vào string
//Đố là hiển thị chuỗi string . Nhưng nếu muốn hiển thị giá trị đã có ra 1 ô
// input text, thì phải viết 2 dấu ngoặc vuông [] như sau
<input type="text" [value]='tile'>
// ở đây value là từ khoa title mới là tên biến
export class HelloWorld{
	title ="angular 4";//đặt 1 biến giá trị javascript
}