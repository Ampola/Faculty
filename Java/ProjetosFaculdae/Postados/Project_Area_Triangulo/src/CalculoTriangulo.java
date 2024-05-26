

import javax.swing.JOptionPane;

public class CalculoTriangulo {

	public static void main(String[] args) {
		double base, altura, resultado;
		base = Double.parseDouble(JOptionPane.showInputDialog("Digite a Base:"));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a Altura:"));
		
		resultado = (base * altura) / 2;
		
		JOptionPane.showMessageDialog(null, "A Area do triangulo é:" + resultado);

	}

}
