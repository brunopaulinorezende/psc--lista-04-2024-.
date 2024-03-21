public class Atividade9 {
    public static void main(String[] args) {
        System.out.println("Números ímpares entre 1 e 50:");
        
        // Iterando de 1 a 50 e verificando se cada número é ímpar
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}