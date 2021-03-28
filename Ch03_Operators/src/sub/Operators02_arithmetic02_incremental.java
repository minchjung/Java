package sub;
//DATE: 12.28.2020 
//NAME: 정민찬 
//Contents: 증감 연산자 와 대입 연산자 (형변환 관계)

public class Operators02_arithmetic02_incremental {
	public static void main(String[] args) {
		// 증감 연산자 : 전치, 후치 연산 이해 
		int a = 0 ; 
		float b =0 ; 
	 	System.out.println(a++); //0
	 	System.out.println(++a);//2
	 	System.out.println(++b);//1.0
	 	
	 	a-=5;
	 	System.out.println(a);//-3
	 	
	 	//a=a -b; //<--error ; int a가 [ int - float ]연산 결과인 float를 담을수 없다. (int << float)
	 	a-=b; //증감 연산자로는 가능하다 !!
	 	System.out.println(a);//-4
	 	
	}
}
