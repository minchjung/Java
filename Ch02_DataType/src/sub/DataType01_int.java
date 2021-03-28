package sub;
//	DATE: 12.23.2020 
//	NAME: 정민찬 
//	Contents: 기본 자료형, 변수 Type-정수형, byte, < short, < int, < long  

public class DataType01_int {
		public static void main(String[] args) {
			// byte  : 	1byte (-2^(7)~2^(7)-1) 
			// short : 	2byte (-2^15 ~ 2^15-1)
			// int   : 	4byte (-2^31 ~ 2^31-1)
			// long  : 	8byte (-2^63 ~ 2^63-1)
			
			//int 선언 
	    	int a = 10 ; 
	    	int b = a ; //대입연산자 왼쪽 변수에 오른쪽 변수의 값을 할당 
	    	a = a + 20 ; 
	    	System.out.printf("a:%d \n",a); //a:30 
	    	System.out.printf("b:%d \n",b);//b:10
	    	// a의 값의 연산식에 의해 변경 (Stack Memory 지정된 값10 ->30 대체됨) 

	    	//int 나눗셈 연산 
	    	int c = b/a; 
	    	System.out.printf("c:%f",c);//<-error 
	    	System.out.printf("c:%d",c);//c:0 
	    	// int 연산은 int 반환 (* 소수점 버림효과)
	    	
		}
}
