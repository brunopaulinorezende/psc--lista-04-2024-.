import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedindo ao usuário para inserir os dois números inteiros
        System.out.println("Digite dois números inteiros:");
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        
        // Verificando qual é o menor e qual é o maior número
        int menorNumero = Math.min(numero1, numero2);
        int maiorNumero = Math.max(numero1, numero2);
        
        // Imprimindo os números inteiros no intervalo compreendido por eles
        System.out.println("Números no intervalo entre " + menorNumero + " e " + maiorNumero + ":");
        for (int i = menorNumero; i <= maiorNumero; i++) {
            System.out.println(i);
        }
        
        scanner.close();
    }
}