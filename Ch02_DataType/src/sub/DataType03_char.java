package sub;

public class DataType03_char {
//	DATE: 12.23.2020 
//	NAME: 정민찬 
//	Contents: 기본 자료형, 변수 Type-char 
	public static void main(String[] args) {
		// char: 문자1개 : 2byte  : (-2^15 ~ 2^15-1)

		char a ='a';
		char z = 'z'; 
		char digit1 = '1';
//		char digit11 ='11'; //<--error : 문자단1개만!!
		System.out.printf("%c \n", a);//a 
		System.out.printf("%c \n", z);//z 
		System.out.printf("%c \n", digit1);//1

// downcasting : int >> char : 강제형변환 가능 (only available when smaller one to bigger one) 
		System.out.printf("%d \n", (int)a);//97
		System.out.printf("%d \n", (int)z);//122 
		System.out.printf("%d \n", (int)digit1);//49
		
// char + 연산 = > char type + 연산시 int로 연산 후 int 반환 
		char char1='1';
		char char2='5';
		System.out.println(char1+char2);// 102 
		System.out.printf("char1 + char2= %c \n",char1+char2);// char1 + char2 = f 
		System.out.printf("char1 + char2= %d \n",(int)'f');// char1 + char2 = 102 
		System.out.printf("char1 + char2= %s \n",char1+char2);// char1 + char2 = 102 
															  // int->s 강제형변환 출력 case 
	}
}
