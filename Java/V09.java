package vjezba;

import java.lang.Math;

public class V09 {
	public static void main(String[] args) {
		int i,j,ukupno;
		double a,b,c,suma;
		
		for(i=1;i<1000;i++) {
			for(j=i;j<1000;j++) {
				a=Math.pow(i, 2);
				b=Math.pow(j, 2);
				suma=a+b;
				c=Math.sqrt(suma);
				a=i;
				b=j;
				if(c%1==0) {
					if(a+b+c==1000) {
						ukupno=(int) (a*b*c);
						System.out.println(ukupno);
						break;
					}
				}
				
			}
		}
		
		
	}
	
	
}
