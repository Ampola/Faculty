
import javax.swing.JOptionPane;

public class calcularPesoIdeal {

	public static void main(String[] args) {
		double alturaMasculina, alturaFeminina, resultado01, resultado02;
		alturaMasculina = Double.parseDouble(JOptionPane.showInputDialog("Digite a Altura Masculina"));
		alturaFeminina = Double.parseDouble(JOptionPane.showInputDialog("Digite a Altura Feminia"));
		
		resultado01 = (72.7 * alturaMasculina) - 58;
		resultado02 = (62.1 * alturaFeminina) - 44.7;
		
		JOptionPane.showMessageDialog(null, "O Peso ideial para o Menino com a altura: " + alturaMasculina + " É: " + resultado01);
		JOptionPane.showMessageDialog(null, "O Peso ideial para a Menina com a altura: " + alturaFeminina + " É: " + resultado02);

	}

}
