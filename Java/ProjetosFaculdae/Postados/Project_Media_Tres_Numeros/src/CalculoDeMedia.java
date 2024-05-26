import javax.swing.JOptionPane;

public class CalculoDeMedia {

	public static void main(String[] args) {
		double numero1, numero2, numero3, resultado;
		numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero 1: "));
		numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero 2: "));
		numero3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero 3: "));
		
		resultado = (numero1 + numero2 + numero3) / 3;
		
		JOptionPane.showMessageDialog(null, "A media é:" + resultado);
	}

}
