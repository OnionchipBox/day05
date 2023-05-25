package for_;

public class TestClass02 {
	public static void main(String[] args) {
		for(int i = 2; i<10; i++) {
			System.out.println(i+"단 시작");
			for(int k=1; k < 10; k++) {
				System.out.println(i+" * "+k+" = "+(i*k));
			}// 하위for
			System.out.println(i+"단 끝");
		}// 상위for
		
	}

}
