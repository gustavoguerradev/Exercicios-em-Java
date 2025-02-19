import java.util.Scanner;

public class Exercise04 {
    /*
    Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
    tela todos os números pares, e também a quantidade de números pares.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int even_numbers = 0;
        int n = input.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter a number: ");
            vect[i] = input.nextInt();
        }
        System.out.println("Even numbers: ");
        for (int i = 0; i < n; i++) {
            if(vect[i] % 2 == 0) {
                System.out.println(vect[i]);
                even_numbers++;
            }
        }
        System.out.print("Quantity: ");
        System.out.print(even_numbers);

    }
}
