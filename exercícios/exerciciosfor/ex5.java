package exercícios.exerciciosfor;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("numero a ser fatorado:");
        int n = sc.nextInt();
        int fat = 1;
    
        for(int i=1; i<=n; i++){
            fat *= i;
        }
        System.out.println(fat);
        sc.close();
    }
}
