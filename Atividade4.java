public class Atividade4 {
    public static void main(String[] args) {
        // População inicial e taxa de crescimento anual para os países A e B
        int populacaoA = 80000;
        double taxaCrescimentoA = 0.03;
        int populacaoB = 200000;
        double taxaCrescimentoB = 0.015;
        int anos = 0;

        // Enquanto a população de A for menor ou igual à população de B, continue calculando
        while (populacaoA <= populacaoB) {
            // Incrementa a população de ambos os países com base nas taxas de crescimento
            populacaoA += (int) (populacaoA * taxaCrescimentoA);
            populacaoB += (int) (populacaoB * taxaCrescimentoB);
            anos++; // Incrementa o número de anos
        }

        // Imprime o número de anos necessários para que a população de A ultrapasse ou iguale a população de B
        System.out.println("Serão necessários " + anos + " anos para que a população de A ultrapasse ou iguale a população de B.");
    }
}