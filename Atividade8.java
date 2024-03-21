import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedindo ao usuário para inserir 5 números
        System.out.println("Digite 5 números:");
        
        // Inicializando variáveis para armazenar a soma e a média
        int soma = 0;
        double media;
        
        // Lendo os números e calculando a soma
        for (int i = 0; i < 5; i++) {
            int numero = scanner.nextInt();
            soma += numero;
        }
        
        // Calculando a média
        media = (double) soma / 5;
        
        // Exibindo a soma e a média
        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);
        
        scanner.close();
    }
}