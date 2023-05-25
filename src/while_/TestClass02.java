package while_;

public class TestClass02 {
	public static void main(String[] args) {
		boolean bool = true; //false
		
//		for (int i = 0 ; bool == true ;i++) {
//			System.out.println(i+"execute");
//			if( i > 10)
//				bool = false;
//		}
		int i = 0;
		while(bool == true) {
			i++;
			System.out.println(i+" test");
			if( i > 10 )
				bool = false;
		}
		
		
		
	}

}
