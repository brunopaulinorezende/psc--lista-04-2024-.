import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedindo ao usuário para inserir 5 números
        System.out.println("Digite 5 números:");
        
        // Inicializando a variável que armazenará o maior número com o menor valor possível
        int maiorNumero = Integer.MIN_VALUE;
        
        // Lendo os números e encontrando o maior
        for (int i = 0; i < 5; i++) {
            int numero = scanner.nextInt();
            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }
        
        // Exibindo o maior número
        System.out.println("O maior número digitado é: " + maiorNumero);
        
        scanner.close();
    }
}