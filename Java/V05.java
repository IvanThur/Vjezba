package vjezba;

public class VO5 {
	public static void main(String[] args) {
		
		for(int i=1;;i++) {
			for(int j=1;j<=20;j++) {
			if(i%j!=0) {
				break;
			}
			if(j==20) {
				System.out.println(i);
				break;
			}
		}}
	}

}
