public class CalculadoraCientifica {

    public double raiz(int numero) {
        return Math.sqrt(numero);
    }

    
    public double raiz(double numero) {
        return Math.sqrt(numero);
    }

    
    public double raiz(String numero) {
        double valor = Double.parseDouble(numero);
        return Math.sqrt(valor);
    }

    public double potencia(byte a, byte b) {
        return Math.pow(a, b);
    }

    
    public double potencia(String s1, String s2) {
        double base = Double.parseDouble(s1);
        double expoente = Double.parseDouble(s2);
        return Math.pow(base, expoente);
    }

    
    public double potencia(int a, double b) {
        return Math.pow(a, b);
    }

    
    public static void main(String[] args) {
        CalculadoraCientifica calc = new CalculadoraCientifica();

        
        System.out.println("Raiz de 16 (int): " + calc.raiz(16));
        System.out.println("Raiz de 25.0 (double): " + calc.raiz(25.0));
        System.out.println("Raiz de \"36.0\" (String): " + calc.raiz("36.0"));

        
        System.out.println("Potência de 2 elevado a 3: " + calc.potencia((byte) 2, (byte) 3));
        System.out.println("Potência de 2.5 elevado a 2.0: " + calc.potencia("2.5", "2.0"));
        System.out.println("Potência de 3 elevado a 1.5: " + calc.potencia(3, 1.5));
    }
}
