package vjezba;

import javax.swing.JOptionPane;

public class DZ_Matrica {
	public static void main(String[] args) {

		int n, i, j , k = 0, stupac = 0, red,b,redmax,redmin,m;

		n=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redova"));
		m=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj stupaca"));
		int niz[]=new int[n*m];
		
		
		for(i=0;i<n*m;i++) {
			//niz[i]=Integer.parseInt(JOptionPane.showInputDialog("Unesi "+(i+1)+" broj niza"));
			niz[i]=i+1;
		}
		
		int mat[][] = new int[n][m];

			redmax=n-1;
			stupac = m-1;
			red=n-1;
			redmin=0;
		for(b=(n-(n/2));b>0;b--) {
			for (j = stupac; j >= redmin; j--) {
				mat[redmax][j] = niz[k++];
				stupac = j;				
			}
			
			red=red-1;
			for (i = red; i >=redmin; i--) {
				mat[i][stupac] = niz[k++];
				red = i;
			}
			stupac=stupac+1;
			for (j =stupac; j <= redmax; j++) {
				mat[redmin][j] = niz[k++];
				stupac = j;
			}
			red+=1;
			
			for (i = red; i < redmax; i++) {
				mat[i][stupac] = niz[k++];
				red=i;
			}
			stupac--;
			redmax--;
			redmin++;
	}
		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++) {
				System.out.print("\t"+ mat[i][j]);
			}
			System.out.println();
		}

	}
}
