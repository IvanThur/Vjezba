package vjezba;

public class V01 {
	public static void main(String[] args) {
		
		
		
		int i, sum = 0;

		for (i = 0; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
				System.out.println(i);
			}
		}
		System.out.println(sum);
	}

}
