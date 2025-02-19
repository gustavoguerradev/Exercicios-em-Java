import java.util.Scanner;

public class Exercise08 {
    /*
    Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
    aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
    digitado, mostrar a mensagem "NENHUM NUMERO PAR"
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers the vector will have: ");
        int n = input.nextInt();
        int[] vect = new int[n];

        int sum = 0;
        int even_elements = 0;
        for (int i = 0; i < n; i++) {
            vect[i] = input.nextInt();
            if(vect[i] % 2 == 0) {
                sum += vect[i];
                even_elements++;

            }
        }
        if(sum > 0) {
            double average = sum / even_elements;
            System.out.println("Average of the even elemnets: " + average);
        }
        else {
            System.out.println("No even elements!");
        }
    }
}
