package sub;

public class DataType02_float {
//	DATE: 12.23.2020 
//	NAME: 정민찬 
//	Contents: 기본 자료형, 변수 Type-실수형 float << double   
	public static void main(String[] args) {
    // float:	실수 4byte (숫자f)  	     		:  (-2^31 ~ 2^31-1) 
	// double:	실수 8byte (java의 default 실수형)  :  (-2^63 ~ 2^63-1) 
		
		int a = 20 ;
		int b = 10 ; 
		float c = b/a; 
		System.out.printf("%3.1f\n", c); //0.0
		
		float d =20; 
		float e= 10;
		float f = e/d; 
		System.out.printf("%3.1f", f); //0.5

	}
}
