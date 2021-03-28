
public class Hello {
//			DATE: 12.22.2020 
//			NAME: 정민찬 
//			Contents: 시스템출력- 숫자형 공간할당 , 개행, tab키, 문자열 강조, 역슬러쉬 출력 방법 
	public static void main(String[] args) {
		/*        int a=100,b=200;

        System.out.printf("%d+%d = %d  \n ", a,b,a+b);
        System.out.printf("%d/%d=%f",a,b,a/b);*/

		/*	%d : 10진수 정수
			%o : 8진수 정수
		    %x: 16진수 정수
		    %f: 실수
			%s: 문자열 (%c: 싱글문자)
		*/

        System.out.printf("%d\n",123);//123
        System.out.printf("%5d\n",123);//  123 (전체공간=5)
        System.out.printf("%05d\n",123);//00123

        System.out.printf("%f\n",123.45); //123.450000 (default값 소수점 6자리)
        System.out.printf("%7.1f\n",123.45);//  123.5(전체공간=7, 소수점=1 소수점아래 전체=1, 소수점아래 1자리까지 표시)
        System.out.printf("%5.3f\n",123.45);//123.450(전체=5,소수점=1,소수점아래=1,소수점아래 3자리까지 표시)

        System.out.printf("%s\n","Hi~Java");//Hi~Java
        System.out.printf("%10s\n", "Hi~Java");

        System.out.printf("\n줄바꿈\n연습\n");//줄바꿈
        									  //연습
        System.out.printf("\t탭키\t연습\n");//	탭키	연습
        System.out.printf("글자가\'강조\'되는 효과\n");//글자가'강조'되는 효과
        System.out.printf("\\\\\\역슬래시 세개 출력");//\\\역슬래시 세개 출력
		
	}
}
