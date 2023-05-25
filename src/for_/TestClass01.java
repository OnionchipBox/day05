package for_;



public class TestClass01 {
	public static void main(String[] args) {		
		// f11 : 디버깅 실행 모드
		// f6 : 한줄 실행
		// f8 : run(다음 브레이크 포인터에서 멈춤)
		// ctrl+f2 : 디버깅 종료
		// f5 : 한줄 실행(메소드를 만나면 해당 코드로 이동)
		System.out.println("test");
		int sum = 0;
		
		for(int i=0; i < 10; i++) {
			sum += i;
		}
		
		System.out.println("시작");
		
		for(int i = 1; i <= 5 ; i++) {
			if(i%2==0) {
				System.out.println("짝"+i);
			}
			else {
				System.out.println("홀"+i);
			}
		};
		
		System.out.println(sum+" : 끝");
		
		
	}

}
