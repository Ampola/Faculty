
import javax.swing.JOptionPane;

public class OneAndOneHangruandDoWhile {

	public static void main(String[] args) {
		int contador = 1;
		
		do {
			JOptionPane.showMessageDialog(null, contador);
			contador++;
		} while (contador <= 100);

	}

}
