import entities.Student;

import java.util.Scanner;

public class Exercise10 {
    /*
    Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
    no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
    os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
    igual a 6.0 (seis).
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o número de alunos: ");
        int n = input.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("%d° aluno: %n", i+1);
            System.out.print("Nome: ");
            input.nextLine();
            String name = input.nextLine();

            System.out.print("Nota 1: ");
            double grade1 = input.nextDouble();
            System.out.print("Nota 2: ");
            double grade2 = input.nextDouble();

            students[i] = new Student(name);
            students[i].calculateAverage(grade1, grade2);
        }
        System.out.println("Resultado: ");
        for (int i = 0; i < n; i++) {
            if(students[i].getFinalGrade() > 6) {
                System.out.printf("%s: APROVADO %n", students[i].getName());
            }
            else {
                System.out.printf("%s: REPROVADO %n", students[i].getName());
            }

        }
    }
}
