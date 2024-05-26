import javax.swing.JOptionPane;

public class ExercicioRepeticao {

	public static void main(String[] args) {
		double nota1, nota2;
		int contador = 1;
		while(contador<=5) {
			nota1 =  Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1"));
			nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2"));
			JOptionPane.showMessageDialog(null, "Media:" + (nota1 + nota2) / 2 );
			contador = contador + 1;
			
		}
		
	}

}
