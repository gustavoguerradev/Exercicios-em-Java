import java.util.Scanner;

public class Exercise02 {
    /*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
     - Imprimir todos os elementos do vetor
     - Mostrar na tela a soma e a média dos elementos do vetor
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);;
        int n = input.nextInt();
        int sum = 0;
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the %d° number: ", i+1);
            numbers[i] = input.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.println(numbers[i]);
            sum += numbers[i];
        }
        double average = sum / n;
        System.out.printf("Sum: %d %n", sum);
        System.out.printf("Average: %.2f", average);
    }
}
