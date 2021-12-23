package vjezba;

import java.util.Arrays;

public class V07 {
	public static void main(String[] args) {
		int i, j = 2, a = 1;

		int niz[]=new int [10001];
		niz[0]=2;
		
		
		for(i=2;a<10001;i++) {
			j=2;
			while(i%j!=0 && j<=i) {
				if(i%j!=0) {
					j++;
				}
				if(i%j==0 && j==i) {
					niz[a]=i;
					a++;
				}
				
			}
		}
		System.out.println(niz[10000]);
		
		System.out.println(Arrays.toString(niz));
		
	}

}
