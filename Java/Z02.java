package edunova;

import javax.swing.JOptionPane;

public class Z02 {

	// Program unosi 3 cijela broja i ispisuje najmanji

	public static void main(String[] args) {
		
		int i,j,k,m;
		
		i=Integer.parseInt(JOptionPane.showInputDialog("Prvi broj"));
		j=Integer.parseInt(JOptionPane.showInputDialog("Drgui broj"));
		k=Integer.parseInt(JOptionPane.showInputDialog("Treci broj"));
		
		m=i;
		if(i>j) {
			m=j;		
		}
		if(m>k) {
			m=k;
		}
		System.out.println(m);
	}
}
