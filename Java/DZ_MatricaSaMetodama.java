package vjezba;

import javax.swing.JOptionPane;

public class DZ_MatricaSaMetodama {

	static int[][][] lijevo(int maxi, int minj, int maxj, int k, int niz[][][]) {
		for (int i = maxj; i >= minj; i--) {
			if (k - 1 == niz[0][0][6]) {
				return niz;
			}
			niz[maxi][i][0] = k++;

		}
		niz[0][0][2] = maxi;
		niz[0][0][3] = minj;
		niz[0][0][4] = maxj;
		niz[0][0][5] = k;

		return niz;
	}

	static int[][][] gore(int maxi, int mini, int minj, int k, int niz[][][]) {
		for (int i = maxi; i >= mini; i--) {
			if (k - 1 == niz[0][0][6]) {
				return niz;
			}
			niz[i][minj][0] = k++;

		}
		niz[0][0][1] = mini;
		niz[0][0][2] = maxi;
		niz[0][0][3] = minj;
		niz[0][0][5] = k;
		return niz;
	}

	static int[][][] desno(int mini, int minj, int maxj, int k, int niz[][][]) {
		for (int i = minj; i <= maxj; i++) {
			if (k - 1 == niz[0][0][6]) {
				return niz;
			}
			niz[mini][i][0] = k++;
		}
		niz[0][0][1] = mini;
		niz[0][0][3] = minj;
		niz[0][0][4] = maxj;
		niz[0][0][5] = k;
		return niz;
	}

	static int[][][] dole(int mini, int maxi, int maxj, int k, int niz[][][]) {
		for (int i = mini; i <= maxi; i++) {
			if (k - 1 == niz[0][0][6]) {
				return niz;
			}
			niz[i][maxj][0] = k++;

		}

		niz[0][0][1] = mini;
		niz[0][0][2] = maxi;
		niz[0][0][4] = maxj;
		niz[0][0][5] = k;
		return niz;
	}

	public static void main(String[] args) {
		int k = 1, mini = 0, maxi, minj = 0, maxj, m, n;
		n = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redaka"));
		m = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj stupaca"));
		int[][][] niz = new int[n][m][7];
		niz[0][0][1] = mini;
		niz[0][0][2] = n - 1;
		niz[0][0][3] = minj;
		niz[0][0][4] = m - 1;
		niz[0][0][5] = k;
		niz[0][0][6] = n * m;
		int i = 0, j = 0;
		while (k <= n * m) {
			mini = niz[0][0][1];
			maxi = niz[0][0][2];
			minj = niz[0][0][3];
			maxj = niz[0][0][4];
			k = niz[0][0][5];

			niz = lijevo(maxi, minj, maxj, k, niz);
			niz[0][0][2]--;

			mini = niz[0][0][1];
			maxi = niz[0][0][2];
			minj = niz[0][0][3];
			maxj = niz[0][0][4];
			k = niz[0][0][5];
			System.out.println("Lijevo" + k);

			niz = gore(maxi, mini, minj, k, niz);
			niz[0][0][3]++;

			mini = niz[0][0][1];
			maxi = niz[0][0][2];
			minj = niz[0][0][3];
			maxj = niz[0][0][4];
			k = niz[0][0][5];
			System.out.println("gore" + k);

			niz = desno(mini, minj, maxj, k, niz);
			niz[0][0][1]++;

			mini = niz[0][0][1];
			maxi = niz[0][0][2];
			minj = niz[0][0][3];
			maxj = niz[0][0][4];
			k = niz[0][0][5];
			System.out.println("desno" + k);

			niz = dole(mini, maxi, maxj, k, niz);
			niz[0][0][4]--;

		}

		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++) {
				System.out.print("\t" + niz[i][j][0]);
			}
			System.out.println();
		}

	}

}
