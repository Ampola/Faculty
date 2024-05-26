import javax.swing.JOptionPane;


public class RepeticaoFor {

	public static void main(String[] args) {
		double nota1, nota2;
		for (int contador = 1; contador <= 5; contador = contador + 1) {
			nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor 1"));
			nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor 2"));
			JOptionPane.showMessageDialog(null, "Media:" + (nota1 + nota2) / 2);
			contador = contador +1;
		}
		

	}

}
