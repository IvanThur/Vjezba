package edunova;

import javax.swing.JOptionPane;

public class Zadatak2 {
	
	// Program od korisnika traži unos dva cijela broja
	// S vrijednostima unesenih brojeva deklarirajte matricu
	
	// primjer: Čovjek unese 5 i 6, vi napravite matricu 5x6 
	
	public static void main(String[] args) {
		int i,j;
		
		i=Integer.parseInt(JOptionPane.showInputDialog("Unesite broj redova"));
		j=Integer.parseInt(JOptionPane.showInputDialog("Unesite broj stupaca"));
		
		int matrica[][]= new int[i][j];
		
	}

}
