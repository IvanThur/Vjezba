package vjezba;

public class V06 {
	public static void main(String[] args) {
		int i,a,b=0;
		
		a=101*(50);
		a=a*a;
		
		for(i=1;i<=100;i++) {
			b=b+(i*i);
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(a-b);
	}

}
