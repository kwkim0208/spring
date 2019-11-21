package b_operator;
//비교연산자
public class ComparisonOperator {

	public static void main(String[] args) {
	   //비교연산자 ==,!=,>=,<=,>,< 연산결과는 true,false
		boolean b=10<20;
		System.out.println(b);
		b=10<20-15;
		System.out.println(b);
		b=10<=10.0;
		System.out.println(b);
		b=65>='B';
		System.out.println(b);
		b=10.0f==10.0;
		System.out.println(b);
		b=10.1f==10.1;
		System.out.println(b);
		System.out.printf("%21.20f\t %21.20f\n",10.1f,10.1);
		b=10.1f==(float)10.1;
		System.out.println(b);
		System.out.println();
		System.out.println("abc".hashCode()=="abc".hashCode());
		b="abc".equals(new String("abc"));
		System.out.println(b);
		int a=10;
		int c=11;
		System.out.println(a==c);
		System.out.println(a!=c);
		System.out.println(a>c);
		System.out.println(a>=c);
		System.out.println(a<c);
		System.out.println(a<=c);
		double d=(float)1.4e3f;
		System.out.println(d);
        int a1=-16&1;
        System.out.println(a1);
        System.out.println();
        b="abc"=="abc";
        System.out.println(b);
        b="abc"==new String("abc");
        System.out.println(b);
        //결국은 hashCode()를 사용하는경우에 결론적으로 오바라이딩해서 안겹치게 구현을 해줘야한다.
        b="abc".hashCode()==new String("abc").hashCode();
        System.out.println(b);

	}

}
