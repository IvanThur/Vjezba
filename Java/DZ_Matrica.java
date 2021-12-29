package vjezba;

import javax.swing.JOptionPane;

public class DZ_Matrica {
	public static void main(String[] args) {

		int n = 6, i, j , k = 0, stupac = 0, red = n-1,b,c,d;

		n=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redova i stupaca"));
		int niz[]=new int[n*n];
		
		
		for(i=0;i<n*n;i++) {
			niz[i]=Integer.parseInt(JOptionPane.showInputDialog("Unesi "+(i+1)+" broj niza"));
		}
		
		int mat[][] = new int[n][n];

			c=n-1;
			stupac = n-1;
			red=n-1;
			d=0;
		for(b=(n-(n/2));b>0;b--) {
			for (j = stupac; j >= d; j--) {
				mat[c][j] = niz[k++];
				stupac = j;				
			}
			
			red=red-1;
			for (i = red; i >=d; i--) {
				mat[i][stupac] = niz[k++];
				red = i;
			}
			stupac=stupac+1;
			for (j =stupac; j <= c; j++) {
				mat[d][j] = niz[k++];
				stupac = j;
			}
			red+=1;
			
			for (i = red; i < c; i++) {
				mat[i][stupac] = niz[k++];
				red=i;
			}
			stupac--;
			c--;
			d++;
	}
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				System.out.print("\t"+ mat[i][j]);
			}
			System.out.println();
		}

	}
}
