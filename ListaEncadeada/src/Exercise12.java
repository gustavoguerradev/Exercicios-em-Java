import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise12 {
    /*
    Fazer um programa para ler um número inteiro N e depois os
    dados (id, nome e salario) de N funcionários. Não deve haver
    repetição de id.

    Em seguida, efetuar o aumento de X por cento no salário de
    um determinado funcionário. Para isso, o programa deve ler
    um id e o valor X. Se o id informado não existir, mostrar
    uma mensagem e abortar a operação. Ao final, mostrar a
    listagem atualizada dos funcionários, conforme exemplos.

    Lembre-se de aplicar a técnica de encapsulamento para não
    permitir que o salário possa ser mudado livremente. Um
    salário só pode ser aumentado com base em uma operação
    de aumento por porcentagem dada.
     */

    public static void main(String[] args) {
        System.out.print("How many employees will be registered? ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.printf("Employee #%d %n", i+1);

            System.out.print("ID: ");
            int id = input.nextInt();

            System.out.print("Name: ");
            input.nextLine();
            String name = input.nextLine();

            System.out.print("Salary: ");
            double salary = input.nextDouble();

            employees.add(new Employee(name, id, salary));

        }

        System.out.print("Enter the employee ID that will be increase: ");
        int id = input.nextInt();

        Integer posId = getIdSelected(employees, id);
        if(posId == null) {
            System.out.println("Employee not founded");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percentage = input.nextDouble();
            employees.get(posId).increase_salary(percentage);
        }
        System.out.println("<Employees list>");
        for (Employee p : employees){
            System.out.println(p.toString());
        }

    }
    public static Integer getIdSelected(List<Employee> employees, int id) {
        for (int i = 0; i < employees.size(); i++) {
            if(employees.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
}