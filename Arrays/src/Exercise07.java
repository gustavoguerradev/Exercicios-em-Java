import java.util.Scanner;

public class Exercise07 {
    /*
    Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
    mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
    os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers the vector will have: ");
        int n = input.nextInt();
        double[] vect = new double[n];

        double sum = 0;
        for (int i = 0; i < n; i++) {
            vect[i] = input.nextDouble();
            sum += vect[i];
        }
        double average = sum / n;

        System.out.println("Average of elements: " + average);
        System.out.println("Elements below the average: ");
        for (int i = 0; i < n; i++) {
            if(vect[i] < average) {
                System.out.println(vect[i]);
            }
        }

    }
}
