package sub;
//DATE: 12.23.2020 
//NAME: 정민찬 
//Contents: 기본 자료형, 변수 Type-boolean

public class DataType05_boolean {
	public static void main(String[] args) {
		// boolean: true,false  : 1byte (=8bit) 
		// 1bit = 0,1로 표현가능하지만  최소 접근 단위인 1byte 사용

		boolean bool1 =true; 
		boolean bool2 =false; 
		boolean bool3 = (10 ==2); 
		boolean bool4 = ('a'=='a');
		boolean bool5 = ("abc"!="abc");

		System.out.printf("bool1:%s\n",bool1); //bool1:true
		System.out.printf("bool2:%s\n",bool2); //bool2:false
		System.out.printf("bool3:%s\n",bool3); //bool3:false
		System.out.printf("bool4:%s\n",bool4); //bool4:true
		System.out.printf("bool5:%s\n",bool5); //bool5:false
    	
	}
}

