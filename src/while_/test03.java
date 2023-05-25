package while_;

import java.util.Scanner;

//정수를 입력받고 입력받은 수만큼 5의 배수를 출력하는 프로그램 만들기
//ex) 정수를 입력하세요 : 1
//     5의배수 : 5


public class test03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num;
		int i = 1,k = 1;
		
		
		System.out.print("정수 입력 : ");
		num = input.nextInt();
		
		while(i <= num) {
			System.out.println("5의 배수 "+k+"번째 : "+(5*i));
			i++;
			k++;
		}
		
		for( ; i <= num; i++) {
			System.out.println("5의 배수 "+k+"번째 : "+(5*i));
			k++;
		}
		
		
		
		
	}

}
