package exercícios.exercícioscondicionais;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n1;

        System.out.println("Digite o número");
        n1 = sc.nextInt();
        if(n1>=0 || n1<=25){
            System.out.println("intervalo (0, 25)");
            
        }else if (n1>=25 || n1<=50){
            System.out.println("intervalo (25, 50)");
        }else if (n1>=50 || n1<=75){
            System.out.println("intervalo (50, 75)");
        }else if (n1>=75 || n1<=100){
            System.out.println("intervalo (75, 100)");
        }else {
            System.out.println("número não sae adequa aos intervalos");
        }

    sc.close();
    } 
}
