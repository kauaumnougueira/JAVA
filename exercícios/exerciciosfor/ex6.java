package exercícios.exerciciosfor;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.println("digite um número:");
        int n = sc.nextInt();
        int div = 0;

        System.out.println("Seus divisores são:");
        for (int i = 1; i<=n; i++){
            if(n % i == 0){
                div = n / i;
                System.out.println(div);
            }
        }
        sc.close();
    }
}
