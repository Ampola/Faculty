public class TesteImpressora {

    public static void main(String[] args) {
        Impressora impressora = new Impressora();

        
        impressora.exibir(3.14f); 
        impressora.exibir(10.5f, 20.0f); 
        impressora.exibir(5.0f, "exemplo"); 
        impressora.exibir("texto", 7.5f); 
        impressora.exibir("um", "dois", "três"); 
        impressora.exibir(1, 2, "três"); 
    }
}