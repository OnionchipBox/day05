package while_;

//1.알파벳 A ~ Z 까지 출력하는 프로그램 구현하기 (while문 활용)
//(출력 형태 예시 :  A-B-C-D-E-F-G-H-I-J-K-L-M-N-O-P-Q-R-S-T-U-V-W-X-Y-Z
//** Z 뒤에는 - 표시 안 나게 할 것 ! 

public class test01 {
	public static void main(String[] args) {
		
		char a = 'A';
		
		while(a <= 'Z') {
			System.out.print(a++ + "-"); //A~Z까지 출력
			if(a=='Z')
				System.out.println(a++); //a 변수가 Z가 됬을땐 -없이 Z만 출력
		}
		
		
	}

}
