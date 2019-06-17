
//대화상자 : alert(), prompt(), confirm()
	//prompt():사용자로부터 입력받을때 
	// ->입력한 값의 자료형은 모두 문자형 


var name=prompt('이름을 입력해 주세요');
var isAdult= confirm('성인in가요?'); //확인 컴펌받는 함수 
//alert(typeof name); // 타입 확인하는거 

//alert(isAdult);

if(isAdult){
	alert('성인입니다.');
}else{
	alert('미성년자 입니다.');
}

document.write('<b><big>'+name+'</big><b>님, 환영합니다.');

console.log();
alert();