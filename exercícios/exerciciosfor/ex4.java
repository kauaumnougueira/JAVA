package exercícios.exerciciosfor;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("quantidade");
        int qtd = sc.nextInt();

        for(int i = 0; i < qtd; i++){
            System.out.println("digite os números que serão divididos");
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            if(n2 !=0){
            double divisa1 = (double) n1 / n2;
            System.out.printf("%.1f%n", divisa1);
            }else{
                System.out.println("Divisão impossível");
            }
        }

        sc.close();
    }
}
