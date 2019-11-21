package a_variable;

public class Variable {
	public static void main(String[] args) {

		/*
		 * 변수: 하나의 데이터를 저장하는 메모리공간 i 정수:int,byte,short,long 실수
		 * :float,double(정밀도가 서로 다르다) 문자:char 논리:boolean 1byte=8bit 변수선언:데이터를
		 * 사용하기위해서는 어떤종류의 데이터를 사용할것인지,그것의 이름이 무엇인지 알려줘야한다. 초기화:선언된 변수에값을 넣는 행위
		 * 명명규칙 1.예약어는 사용하지않는다 2.대소문자가 구분되면 길이에 제한이없다 3.숫자로 시작해서는 안된다 4.특수문자와_와
		 * $만을 허용한다
		 */
		int i;
		byte b;
		char c;
		long l;
		short s;
		float f;
		double d;
		boolean bool;
		// 선언한이유 변수를 사용할떄 변수의 이름을 사용한다.
		// System.out.println(b);
		// 변수의 값을 저장하지 않으면 변수의값을 참조할수없다
		// 대입연산자(=):변수에 값을 저장할떄 사용(왼쪽에는 변수 오른쪽은 값
		// 값을 저장할때는 타입에 맞게 넣어야한다.
		b = 10;
		s = 30000;
		i = 21000000;
		l = 900l;
		f = 3.14f;
		d = 3.14;
		c = '가';
		bool = false;
		System.out.println(b);
		System.out.println(i);
		System.out.println(bool);
		System.out.println(d);
		System.out.println(c);
		System.out.println(f);
		System.out.println(d);
		System.out.println(l);
		System.out.println(s);
		i = 40;
		System.out.println(i);
		i = 30 + 40;
		System.out.println(i);
		d = 30;
		bool = true;
		b = 40;
		c = 'A';
		f = 3.34f;
		i = 5000;
		l = 400000000000L;
		s = 304;
		System.out.println(b);
		System.out.println(bool);
		System.out.println(c);
		System.out.println(i);
		System.out.println(d);
		System.out.println(l);
		System.out.println(f);
		System.out.println(s);
		// 문자열:""로 감싸진글자
		String string = new String("abcd");
		System.out.println(string);
		string = "1234";
		System.out.println(string);
		/*
		 * 리터럴의 종류 숫자:0,10,-5,3.141592 문자:'1','＃' 문자열:"가나다라 마바상"
		 * 그외:null,true,false 참조형타입:기본형 타입을 제외한 모든 타입(배열,클래스|사용자 정의 클래스 ,컬렉션)
		 * 참조형 타칩은 값이 변수에 저장되지않고 그주소가 변수에 저장한다 (포인터개념) 크기:4byte 기본값:전역변수에 아무것도
		 * 저장하지 않았을떄 저장되어있는값
		 */
		i = (int) d;
		System.out.println(i);
		d=i;
		System.out.println(d);
		final int MAX_NUMBER=10;
		
				
	}

}
