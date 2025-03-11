package arrays.exercises;
import arrays.entities.Person;
import java.util.Scanner;

public class Exercise11 {
    /*
    Tem-se um conjunto de dados contendo nome, a altura e o gênero (M, F) de N pessoas. Fazer um programa
    que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
    de homens.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o número de pessoas: ");
        int n = input.nextInt();
        Person[] people = new Person[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("%d° pessoa: %n", i+1);
            System.out.print("Nome: ");
            input.nextLine();
            String name = input.nextLine();

            System.out.print("Gênero (M ou F): ");
            String gender = input.nextLine();

            System.out.print("Altura: ");
            double height = input.nextDouble();

            people[i] = new Person(name, gender, height);
        }

       Person lower = people[0];
        Person taller = people[0];
        double sum_female_height = 0;
        int male_quantity = 0;
        int female_quantity = 0;

        for (Person p : people) {
            if(p.getGender().equals("F")) {
                sum_female_height += p.getHeight();
                female_quantity++;
            } else if (p.getGender().equals("M")) {
                male_quantity++;
            }

            if(p.getHeight() < lower.getHeight()){
                lower = p;
            }
            if(p.getHeight() > taller.getHeight()){
                taller = p;
            }
        }
        double average_female_height = sum_female_height / female_quantity;

        System.out.println("RESULTADO: ");
        System.out.println("MENOR ALTURA: " + lower.getHeight());
        System.out.println("MAIOR ALTURA: " + taller.getHeight());
        System.out.println("MEDIA DAS ALTURAS DAS MULHERES: " + average_female_height);
        System.out.println("NÚMERO DE HOMENS: " + male_quantity);
    }


}
