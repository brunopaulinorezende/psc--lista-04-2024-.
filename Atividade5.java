import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variáveis para armazenar as populações iniciais e as taxas de crescimento para os países A e B
        int populacaoA, populacaoB;
        double taxaCrescimentoA, taxaCrescimentoB;
        
        do {
            // Solicita ao usuário que insira as populações iniciais e as taxas de crescimento para os países A e B
            System.out.println("Informe a população inicial do país A:");
            populacaoA = validarInteiroPositivo(scanner);

            System.out.println("Informe a taxa de crescimento anual do país A (em porcentagem):");
            taxaCrescimentoA = validarDoublePositivo(scanner) / 100.0;

            System.out.println("Informe a população inicial do país B:");
            populacaoB = validarInteiroPositivo(scanner);

            System.out.println("Informe a taxa de crescimento anual do país B (em porcentagem):");
            taxaCrescimentoB = validarDoublePositivo(scanner) / 100.0;

            // Valida se as populações iniciais e as taxas de crescimento são válidas
            if (populacaoA <= 0 || populacaoB <= 0 || taxaCrescimentoA <= 0 || taxaCrescimentoB <= 0) {
                System.out.println("Por favor, insira valores válidos (populações e taxas de crescimento maiores que zero).");
            }
        } while (populacaoA <= 0 || populacaoB <= 0 || taxaCrescimentoA <= 0 || taxaCrescimentoB <= 0);

        // Calcula e imprime o número de anos necessários para que a população de A ultrapasse ou iguale a população de B
        int anos = calcularAnos(populacaoA, taxaCrescimentoA, populacaoB, taxaCrescimentoB);
        System.out.println("Serão necessários " + anos + " anos para que a população de A ultrapasse ou iguale a população de B.");
    }

    // Método para validar e retornar um inteiro positivo
    public static int validarInteiroPositivo(Scanner scanner) {
        int valor;
        do {
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, insira um valor inteiro positivo:");
                scanner.next();
            }
            valor = scanner.nextInt();
            if (valor <= 0) {
                System.out.println("Por favor, insira um valor inteiro positivo:");
            }
        } while (valor <= 0);
        return valor;
    }

    // Método para validar e retornar um número decimal positivo
    public static double validarDoublePositivo(Scanner scanner) {
        double valor;
        do {
            while (!scanner.hasNextDouble()) {
                System.out.println("Por favor, insira um valor numérico positivo:");
                scanner.next();
            }
            valor = scanner.nextDouble();
            if (valor <= 0) {
                System.out.println("Por favor, insira um valor numérico positivo:");
            }
        } while (valor <= 0);
        return valor;
    }

    // Método para calcular o número de anos necessários para que A ultrapasse ou iguale B
    public static int calcularAnos(int populacaoA, double taxaCrescimentoA, int populacaoB, double taxaCrescimentoB) {
        int anos = 0;
        while (populacaoA <= populacaoB) {
            populacaoA += (int) (populacaoA * taxaCrescimentoA);
            populacaoB += (int) (populacaoB * taxaCrescimentoB);
            anos++;
        }
        return anos;
    }
}