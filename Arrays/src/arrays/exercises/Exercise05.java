package arrays.exercises;
import java.util.Scanner;

public class Exercise05 {
    /*
    Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
    o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
    considerando a primeira posição como 0 (zero).
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will be insert: ");
        int n = input.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the %d° number: ", i+1);
            vect[i] = input.nextDouble();
        }

        double bigger = vect[0];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if(vect[i] > bigger) {
                bigger = vect[i];
                index = i;
            }
        }

        System.out.println("Bigger: " + bigger);
        System.out.println("Index: " + index);

    }
}
