
import javax.swing.JOptionPane;

public class SomaExercicio {

	public static void main(String[] args) {
		double numero01, numero02, numero03, resultado;
		numero01 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro Numero:"));
		numero02 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Segundo Numero:"));
		numero03 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro Numero"));
		
		resultado = numero01 + numero02 + numero03;
		
		JOptionPane.showMessageDialog(null, "O Valor total é: " +  resultado);
		
		
	}

}
