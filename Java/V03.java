package vjezba;

public class V03 {
	public static void main(String[] args) {

		long n = 600851475143L;

		if (n > 1) {
			long div = 2;
			while (div < n) {
				if (n % div != 0) {
					div++;
				} else {
					n = n / div;
					System.out.println(div);
					div = 2;
					System.out.println(n);
				}
			}
		}
	}

}
