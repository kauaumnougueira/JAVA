package exercícios.exerciciosclasseseobjetos.ex2;
import java.util.Scanner;

public class programex2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        functionsex2 employee;
        employee = new functionsex2();

        System.out.println("---------------------");
        System.out.println("Nome do funcionário: ");
        employee.name = sc.next();
        System.out.println("Salário bruto do funcionário (em reais): ");
        employee.grossSalary = sc.nextDouble();
        System.out.println("Imposto do seu salário(em reais): ");
        employee.tax = sc.nextDouble();
        System.out.println("------------------------------------------");
        System.out.println("Dados recebidos: ");
        System.out.println(employee);

        System.out.println("------------------------------------------------");
        System.out.println("Insira o incremento de salário(Em porcentagem): ");
        double percentage = sc.nextDouble();
        employee.increaseSlary(percentage);
        
        System.out.println("---------------");
        System.out.println("Salário atual: ");
        System.out.println(employee);

        sc.close();
    }
}
