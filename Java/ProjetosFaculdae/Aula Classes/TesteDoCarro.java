import javax.swing.JOptionPane;

public class TesteDoCarro {
    public static void main(String[] args) {
        String primeiroCarro = JOptionPane.showInputDialog("Digite o Nome Do Carro:");
        String primeiroModelo = JOptionPane.showInputDialog("Digite o Modelo Do Carro:");

        Carros Modelo1 = new Carros(primeiroModelo);
        Carros Carro1 = new Carros(primeiroCarro);
        
        Modelo1.exibirMensagem();
        Carro1.exibirMensagem();

    }
}