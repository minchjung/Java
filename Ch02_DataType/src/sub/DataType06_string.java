package sub;
//	DATE: 12.23.2020 
//	NAME: 정민찬 
//	Contents: 기본 자료형, 변수 Type-String 문자열 

public class DataType06_string {
		public static void main(String[] args) {
			// 문자열 : (입력한 글자수 X 2) byte  ~ no limit 
			String a = "12"; 
			String b = "13"; 
			String str = "입니다";
			
			//문자열 + 연산
			System.out.printf("a+b = %s \n",a+b+str); //a+b = 1213입니다 

			//int + 연산 비교 
			int c = 12;
			int d =13; 
			System.out.printf("c+d = %s \n",c+d);  //c+d = 25 (c+d int형 $s로 출력시 강제형 변환)
			
			// int + String 연산
			System.out.printf("c+d = %s \n",c+d+str); //c+d =25 입니다 (int+string=>string 모두 변환)
			
			
			// ( 참조 ) char + 연산 = > char type + 연산시 int로 연산 후 int 반환 
			char char1='1';
			char char2='5';
			System.out.println(char1+char2);// 102 
			System.out.printf("char1 + char2= %c \n",char1+char2);// char1 + char2 = f 
			System.out.printf("char1 + char2= %d \n",(int)'f');// char1 + char2 = 102 
			System.out.printf("char1 + char2= %s \n",char1+char2);// char1 + char2 = 102 
																  // int->s 강제형변환 출력 case 

		}
}