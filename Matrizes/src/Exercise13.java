import java.util.Scanner;
public class Exercise13 {
    /*
    Fazer um programa para ler dois números inteiros M e N, e depois ler uma matriz de M linhas por N colunas contendo números inteiros, podendo haver repetições. Em seguida, ler um número inteiro X que pertence à matriz. Para cada ocorrência de X, mostrar os valores à esquerda, acima, à direita e abaixo de X, quando houver, conforme exemplo.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura dos valores M e N
        System.out.print("Digite o número de linhas (M): ");
        int m = sc.nextInt();
        System.out.print("Digite o número de colunas (N): ");
        int n = sc.nextInt();

        int[][] matriz = new int[m][n];

        // Leitura da matriz
        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        // Leitura do número X
        System.out.print("Digite o número a ser buscado (X): ");
        int X = sc.nextInt();

        // Busca pelo número X na matriz
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] == X) {
                    System.out.println("Posição " + i + "," + j + ":");
                    if (j > 0) {
                        System.out.println("Esquerda: " + matriz[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("Acima: " + matriz[i - 1][j]);
                    }
                    if (j < n - 1) {
                        System.out.println("Direita: " + matriz[i][j + 1]);
                    }
                    if (i < m - 1) {
                        System.out.println("Abaixo: " + matriz[i + 1][j]);
                    }
                }
            }
        }

        sc.close();



    }
}