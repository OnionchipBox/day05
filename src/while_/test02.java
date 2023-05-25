package while_;

//수영을 시작한다, 전체 거리는 25m.
//3m씩 이동하면서 "발차기를 계속합니다"와 
//"현재 이동 거리:"+move(헤엄친 거리)를 출력하고,
//마지막엔 "도착하였습니다"를 출력하기.


public class test02 {
	public static void main(String[] args) {
		
		int num = 0;
		
		while(num < 26) {
			num++;
			System.out.println("현재 이동 거리 : "+num+"m");
			if(num % 3 == 0)
				System.out.println("현재 위치 : "+num+"m 발차기를 계속합니다...");
		}
		System.out.println("도착하였습니다");
		
		
	}

}
