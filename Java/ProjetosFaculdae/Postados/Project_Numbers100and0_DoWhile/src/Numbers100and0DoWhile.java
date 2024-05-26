import javax.swing.JOptionPane;


public class Numbers100and0DoWhile {

	public static void main(String[] args) {
		int i = 100;
		
		do {
			JOptionPane.showMessageDialog(null, i);
			i--;
		} while ( i >= 0 );

	}

}
