
import javax.swing.JOptionPane;

public class CalculoAreaCirculo {

	public static void main(String[] args) {
		double raio, area;
		final double PI = 3.14159; 
		
		
		raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio do círculo: "));
		
		
		area = PI * Math.pow(raio, 2);
		
		
		JOptionPane.showMessageDialog(null, "A área do círculo é: " + area);
	}

}
