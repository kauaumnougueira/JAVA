package exercícios.exerciciosfor;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("numero de linhas");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            int n2 = i*i;
            int n3 = n2 * i;
            System.out.printf("%d %d %d%n", i, n2, n3);
        }

        sc.close();
    }
}
