package sub;

public class DataType04_ASCII {
//	DATE: 12.23.2020 
//	NAME: 정민찬 
//	Contents: 기본 자료형, char-int 강제 형변환 : 아스키코드 이해  

	public static void main(String[] args) {
		// ASCII 
		char a ='a';
		char z = 'z'; 
		char A = 'A';
		char Z ='Z';
		char digit0 = '0'; 
		char digit1 = '1';
		char digit9 = '9';
		
		System.out.printf("%c \n", a);//a 
		System.out.printf("%c \n", z);//z 
		System.out.printf("%c \n", A);//A 
		System.out.printf("%c \n", Z);//A 
		System.out.printf("%c \n", digit0);//0
		System.out.printf("%c \n", digit1);//1
		System.out.printf("%c \n", digit9);//9
		
		//ASCII char -> int 
		System.out.printf("%d \n", (int)a);//97
		System.out.printf("%d \n", (int)z);//122 
		System.out.printf("%d \n", (int)A);//65
		System.out.printf("%d \n", (int)Z);//90 
		System.out.printf("%d \n", (int)digit0);//48
		System.out.printf("%d \n", (int)digit1);//49
		System.out.printf("%d \n", (int)digit9);//57
		
		
	
	}
}
