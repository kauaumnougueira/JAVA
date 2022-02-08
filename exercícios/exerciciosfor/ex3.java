package exercícios.exerciciosfor;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double a,b,c, media;
        media = 0.0;
        System.out.println("Indique a quantidade de vezes que a média será tirada");
        int quantidade = sc.nextInt();

        for(int i= 0; i < quantidade; i++){
            System.out.println("Digite os numeros");
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();
            media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;
            System.out.printf("%.1f%n", media);
        }
        sc.close();
    }
}
