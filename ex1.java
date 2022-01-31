
import java.util.Scanner;
 
public class Main{
    public static void ex1(String[] args){

        Scanner sc = new Scanner(System.in);

        int a;
        int b;
        int soma;
        
        a = sc.nextInt();
        b = sc.nextInt();

        soma = a+b;
        
        System.out.println("SOMA= " + soma);


        sc.close();
        }
}
