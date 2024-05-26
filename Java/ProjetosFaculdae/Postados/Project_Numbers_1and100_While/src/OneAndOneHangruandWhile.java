import javax.swing.JOptionPane;

public class OneAndOneHangruandWhile {
    public static void main(String[] args) {
     
        int contador = 1;
        
       
        while (contador <= 100) {
            JOptionPane.showMessageDialog(null, contador); 
            contador++; 
        }
    }
}