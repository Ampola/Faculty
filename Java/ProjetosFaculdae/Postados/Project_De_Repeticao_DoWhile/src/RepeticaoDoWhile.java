import javax.swing.JOptionPane;

public class RepeticaoDoWhile {

	public static void main(String[] args) {
		double nota1, nota2;
		int i = 1;
		do { nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor 1"));
			 nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor 2"));
			 i = i + 1; 
			 }while (i <= 5);
		 	
			
		}
		

	}


