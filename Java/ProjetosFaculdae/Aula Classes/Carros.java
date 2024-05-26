public class Carros{
    private String nomeDoCarro;
    private String modeloDoCarro;

    public Carros(String modeloDoCarro){
        this.modeloDoCarro = modeloDoCarro;
    }

    public Carros(String nomeDoCarro){
        this.nomeDoCarro = nomeDoCarro;
    }

    public void exibirMensagem(){
        System.out.printf("Bem Vindo a Carros Teste brasil %s:", getNomeDoCarro());
        System.out.printf("Digite o Modelo Do Carro", getModeloDoCarro());
    }

    public String getModeloDoCarro(){
        return modeloDoCarro;
    }

    public void setModeloDoCarro(String modeloDoCarro) {
        this.modeloDoCarro = modeloDoCarro;
    }

    public String getNomeDoCarro(){
        return nomeDoCarro;
    }

    public void setNomeDoCarro(String nomeDoCarro) {
        this.nomeDoCarro = nomeDoCarro;
    }

}