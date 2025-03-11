package arrays.exercises;
import arrays.entities.Person;
import java.util.Scanner;

public class Exercise09 {
    /*
    Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
    devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
    da pessoa mais velha.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many people you want: ");
        int n = input.nextInt();
        Person[] people = new Person[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("%d° person: %n", i+1);
            System.out.print("Name: ");
            input.nextLine();
            String name = input.nextLine();

            System.out.print("Age: ");
            int age = input.nextInt();

            people[i] = new Person(name, age);
        }
        Person older = people[0];
        for (Person p : people) {
            if(p.getAge() > older.getAge()) {
                older = p;
            }
        }
        System.out.println("Older person: " + older.getName());

    }
}
