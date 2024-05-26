public class Jogo {
    public static void main(String[] args) throws InterruptedException {
        // Inicialização dos personagens
        Personagem cacador = new Personagem("Cacador", 10, 0, 0);
        Personagem soneca = new Personagem("Soneca", 2, 6, 4);
        Personagem novoPersonagem = new Personagem("Novo", 5, 5, 5); // Novo personagem

        while (true) {
            // Ações dos personagens
            cacador.cacar();
            soneca.dormir();
            cacador.comer();
            soneca.dormir();
            cacador.dormir();
            soneca.dormir();
            cacador.cacar();
            soneca.comer();
            cacador.cacar();
            soneca.cacar();
            novoPersonagem.comer(); // Ação do novo personagem
            novoPersonagem.dormir(); // Ação do novo personagem

            // Exibir estado dos personagens
            cacador.exibirEstado();
            soneca.exibirEstado();
            novoPersonagem.exibirEstado();

            System.out.println("====================");
            Thread.sleep(3000);
        }
    }
}
