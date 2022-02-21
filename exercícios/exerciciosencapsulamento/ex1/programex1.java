package exercícios.exerciciosencapsulamento.ex1;
import java.util.Scanner;

public class programex1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        functionsex1 account;
        System.out.println("-------------");
        System.out.println("Enter account number: ");
        int number = sc.nextInt();
        System.out.println("Enter account name: ");
        String name = sc.next();
        System.out.println("Is there na initial deposit (y/n)?");
        char yorn = sc.next().charAt(0);
        double value = 0;
        if(yorn == 'y'){
            System.out.println("Enter initial deposite: ");
            value = sc.nextDouble();
            account = new functionsex1(number, name, value);
        }else{
            account = new functionsex1(number, name);
        }

        System.out.println("-------------");
        System.out.println("Account data:");
        String editedLog = account.toString();
        System.out.println(editedLog);
        System.out.println("-------------");

        System.out.println("you want to mess with your account? (y/n)");
        char youWant = sc.next().charAt(0);
        while(youWant == 'y'){

            System.out.println("-------------");
            System.out.println("you want to deposit or withdraw?(d/w)");
            char depOrWith = sc.next().charAt(0);
            if(depOrWith == 'd'){
                System.out.println("Enter a depoist value: ");
                double deposit = sc.nextDouble();
                account.deposit(deposit);
                System.out.println("updated account data: ");
                System.out.println(account);
            }else{
                System.out.println("Enter a withdraw value: ");
                double withdraw = sc.nextDouble();
                account.withdraw(withdraw);
                System.out.println("updated account data: ");
                System.out.println(account);
            }
            System.out.println("-------------");
            System.out.println("do you want to keep messing with your account? (y/n)");
            youWant = sc.next().charAt(0);
        }      
        sc.close();
    }
}
