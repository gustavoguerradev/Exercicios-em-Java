import java.util.Scanner;

public class Exercise01 {
    /*
    * Faça um programa que leia um número inteiro positivo N (máximo = 10)
    * e depois N números inteiros e armazene-os em um vetor. Em seguida,
    * mostrar na tela todos os números negativos lidos.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);;
        int n = input.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the %d° number: ", i+1);
            numbers[i] = input.nextInt();
        }

        System.out.println("Negative numbers:");
        for (int i = 0; i < n; i++) {
            if(numbers[i] < 0)
                System.out.println(numbers[i]);
        }
    }
}
