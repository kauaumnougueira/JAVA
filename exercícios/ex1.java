package exercícios;

import java.util.Scanner;
 
public class ex1{
    public static void main(String[] args){

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
