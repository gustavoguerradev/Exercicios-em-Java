import java.util.Scanner;

public class Exercise06 {
    /*
    Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
    terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
    o vetor C gerado
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will be insert each array: ");
        int n = input.nextInt();
        int[] vectA = new int[n];
        int[] vectB = new int[n];

        System.out.println("First vector: ");
        for (int i = 0; i < n; i++) {
            vectA[i] = input.nextInt();
        }
        System.out.println("Second Vector:");
        for (int i = 0; i < n; i++) {
            vectB[i] = input.nextInt();
        }

        int[] vectC = new int[n];
        System.out.println("Resulting Vector: ");
        for (int i = 0; i < n; i++) {
            vectC[i] = vectA[i] + vectB[i];
            System.out.println(vectC[i]);
        }

    }
}
