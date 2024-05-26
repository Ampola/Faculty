
import javax.swing.JOptionPane;

public class SomaDeDoisNumeros {

	public static void main(String[] args) {
		double primeiroValor, segundoValor, resultado;
		primeiroValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o Primeiro Valor:"));
		segundoValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o Segundo Valor:"));
		
		resultado = primeiroValor + segundoValor;
		
		JOptionPane.showMessageDialog(null, "Soma = " + resultado);

	}

}
