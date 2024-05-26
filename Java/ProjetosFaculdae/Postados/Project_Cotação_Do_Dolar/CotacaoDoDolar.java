import javax.swing.JOptionPane;

public class CotacaoDoDolar {

	public static void main(String[] args) {
		double valorDoDolar, valorDoReal, cotacao;
		valorDoDolar = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor do Dolar:"));
		cotacao = Double.parseDouble(JOptionPane.showInputDialog("Digite a Cotacao do Dolar:"));
		
		 valorDoReal = valorDoDolar * cotacao;
		 
		 JOptionPane.showMessageDialog(null, "O Valor em Reais é: " + valorDoReal );
	}

}
