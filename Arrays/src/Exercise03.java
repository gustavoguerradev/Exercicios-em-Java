import entities.Person;
import java.util.Scanner;

public class Exercise03 {
    /*
    Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
    tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
    bem como os nomes dessas pessoas caso houver.
    */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        double height_sum = 0;
        int minors = 0;
        Person[] people = new Person[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("%dº person: %n", i+1);
            System.out.println("Name:");
            input.nextLine();
            String name = input.nextLine();

            System.out.println("Age: ");
            int age = input.nextInt();

            System.out.println("Height: ");
            double height = input.nextDouble();

            people[i] = new Person(name,age,height);
        }

        for (int i = 0; i < n; i++) {
            height_sum += people[i].getHeight();
            if(people[i].getAge() < 16) {
                minors++;
            }
        }
        double height_average = height_sum / n;
        System.out.printf("Average Height: %.2f %n", height_average);
        System.out.printf("Minors: %d %n", minors);

        for (int i = 0; i < n; i++) {
            if(people[i].getAge() < 16) {
                System.out.println(people[i].getName());
            }
        }
        input.close();
    }
}