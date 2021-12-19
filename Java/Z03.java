package edunova;

import javax.swing.JOptionPane;

public class Z03 {
	
	// Program unosi dvije logičke vrijednosti
	// u slučaju da su obje istinite ispisuje DA
	
	public static void main(String[] args) {
		boolean i,j;
		
		i=Boolean.parseBoolean(JOptionPane.showInputDialog("Unesi vrijednost 1"));
		j=Boolean.parseBoolean(JOptionPane.showInputDialog("Unesi vrijednost 2"));
		
		
		if(i=j) {
			System.out.println("DA");
		}
	}

}
