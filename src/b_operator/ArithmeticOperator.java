package b_operator;

public class ArithmeticOperator {

	public static void main(String[] args) {
		//산술연산자의 종류 +,-,*,/,%
		int iNum=10+20-10*5/10%2;
		System.out.println(iNum);
	   iNum=10+(int)20.3;
	   System.out.println(iNum);
	   byte b=10;
	   short s=20;
	   //s-b 결과는 리턴값이 int jvm 설계가 4바이트 이상 으로 정수간 연산이 되게함
	   //연산결과 애마하면 그냥 묵시적 캐스팅 이후 (연산표식)으로 해주기
	   short d=(short)(s-b);
	   long l=100000*100000L;
	   System.out.println(l);
	   float f=10/(float)4;
	   System.out.println(f);
	   f=0/0f;
	   System.out.println(f);
	   char c1='A';
	   char c2=(char)(c1+1);
	   System.out.println(c2);
	   iNum='D'-'A';
	   System.out.println(iNum);
	   iNum=0;
	   iNum+=1;
	   ++iNum;
	   System.out.println(iNum);
	   iNum++;
	   iNum=0;
	   System.out.println(++iNum);
	   iNum=0;
	   System.out.println(iNum++);
	   //복합대입연산자의 종류:=+,-=,*=,/=,%=
	   double round=3.14;
	  System.out.println((int)(round*10+0.5)/10f);
	  int a=(123456+654321);
	  long l1=(long)(a*123456L);
	  l1/=123456;
	  l1-=654321;
	  l1%=123456;
	  System.out.println(l1);
	  int x=10,y=21,z=33;
	  int sum=x+y+z;
	  // x의 소수점 n재자리 반올림 (x*10^(n-1)+0.5)/10^(n-1);
	  double avg=(int)(sum/3.0*100+0.5)/100.0;
	  System.out.println("합계="+sum);	  
	  System.out.println("평균="+avg);
		  
	  
	}

}
