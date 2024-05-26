public class Personagem {
    private String nome;
    private int energia;
    private int fome;
    private int sono;

    public Personagem(String nome, int energia, int fome, int sono) {
        this.nome = nome;
        this.energia = energia;
        this.fome = fome;
        this.sono = sono;
    }

    public void cacar() {
        if (energia >= 2) {
            System.out.println(nome + " cacando");
            energia -= 2;
        } else {
            System.out.println(nome + " sem energia para cacar");
        }
        fome = Math.min(fome + 1, 10);
        sono = Math.min(sono + 1, 10);
        exibirEstado();
    }

    public void comer() {
        if (fome >= 1) {
            System.out.println(nome + " comendo.");
            energia = Math.min(energia + 1, 10);
            fome -= 1;
        } else {
            System.out.println(nome + " sem fome.");
        }
        exibirEstado();
    }

    public void dormir() {
        if (sono >= 1) {
            System.out.println(nome + " dormindo.");
            sono -= 1;
            energia = energia + 1 <= 10 ? energia + 1 : 10;
        } else {
            System.out.println(nome + " sem sono.");
        }
        exibirEstado();
    }

    public void exibirEstado() {
        System.out.println(nome + ": Energia=" + energia + ", Fome=" + fome + ", Sono=" + sono);
    }
}
