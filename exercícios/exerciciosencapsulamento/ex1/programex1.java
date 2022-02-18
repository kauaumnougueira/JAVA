package exercícios.exerciciosencapsulamento.ex1;
import java.util.Scanner;

public class programex1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("----------------------------------");
        System.out.println("Enter account number: ");
        int number = sc.nextInt();
        System.out.println("Enter account name: ");
        String name = sc.next();
        System.out.println("Is there na initial deposit (y/n)?");
        String yorn = sc.next();
        double value = 0;
        if(yorn.equals("y")){
            System.out.println("Enter initial deposite: ");
            value = sc.nextDouble();
        }else{
           
        }
        System.out.println("----------------------------------");
        System.out.println("Account data:");
        functionsex1 account = new functionsex1(number, name, value);

        String editedLog = account.toString();
        System.out.println(editedLog);
        sc.close();
    }
}
