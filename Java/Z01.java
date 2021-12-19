package edunova;

import javax.swing.JOptionPane;

public class Z01 {
	
	// Program unosi dva cijela broja
	// Ako je njihov zbroj paran broj ispisuje Osijek
	// inače ispisuje Zagreb
	
	public static void main(String[] args) {
		int i,j,r;
		i=Integer.parseInt(JOptionPane.showInputDialog("Prvi broj"));
		j=Integer.parseInt(JOptionPane.showInputDialog("Drugi broj"));
		
		r=i+j;
		if(r%2==0) {
			System.out.println("Osijek");
		}else {
			System.out.println("Zagreb");
		}
	}

}
