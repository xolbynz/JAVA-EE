/**
 * 
 */

var num1='10';
		var num2='2000원';
		var num3=10;
		
		document.write("parseInt()사용"+"<br>");
		document.write(parseInt(num1)+"<br>");
		document.write(parseInt(num2)+"<br>"+"<br>");
		
		document.write("Number()사용"+"<br>");
		document.write(Number(num1)+"<br>");
		document.write(Number(num2)+"<br>");
		
		
		document.write("num3값 비교 <br>");
		document.write(((num3/3)===3)?true:false+"<br>"); // 자바에서는 트루지만
															// (int형이기때문에 ) 자스에선
															// 펄스이다(var형으로 int와
															// double 등 ㄷ ㅏ
															// 합친거ㅅ)
		document.write((parseInt(num3/3)===3)?true:false); // parseInt는 int로
															// 바꾼다 그래서 자바처럼
															// 트루나옴니다.
