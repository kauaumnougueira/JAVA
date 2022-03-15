/*
calcular imposto de renda
*/

package exercícios.exercícioscondicionais;
import java.util.Scanner;

public class ex8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double salario, imposto;

        System.out.println("Digite seu salário deste mês");
        salario = sc.nextDouble();

        if(salario <= 2000.00){
            System.out.println("isento");
        }else if(salario >= 2000.01 && salario <= 3000.00){
            imposto = (salario - 2000.00) * 0.08;
            System.out.println(imposto); 
        }else if (salario >= 3000.01 && salario <= 4500.00){
            imposto = 1000.00 * 0.08 + (salario - 3000.00) * 0.18;
            System.out.println(imposto);
        }else{
            imposto = 1000.00 * 0.08 + 1500 * 0.18 + (salario - 4500.00)* 0.28;
            System.out.println(imposto);
        }

        sc.close();
    }
}
