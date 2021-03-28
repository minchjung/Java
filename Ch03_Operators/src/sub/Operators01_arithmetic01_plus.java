package sub;
//DATE: 12.28.2020 
//NAME: 정민찬 
//Contents: 산술 연산자 '+' 와 형변환 이해, int연산 = int 반환, 대입연산자로 형변환, float int 연산= float반환 

public class Operators01_arithmetic01_plus {
	public static void main(String[] args) {
		// you have to see the differences here between of the operators' functions and the results of each 

		// 1. int '+'연산 결과 :  return int 
		int a = 10; 
		int b = 20; 
		System.out.println(a*b);//200 

		// -> float로 강제 형변환 by '='대입 연산자 with float 변수 
		float result; 
		System.out.println(result=a*b);//200.0 
	
		//2. int 와 float '+' 연산 결과 : return float 
		System.out.println(a*(float)b); //200.0
		
	}
}
