package exercícios.exerciciosrepetitivas;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite as coordenadas na ordem x e y");
        int x = sc.nextInt();
        int y = sc.nextInt();

        while(x != 0 && y != 0){
            if(x >= 0 && y >= 0){
                System.out.println("Quadrante 1");
            }else if(x <= 0 && y >= 0){
                System.out.println("Quadrante 2");
            }else if(x <= 0 && y <= 0){
                System.out.println("Quadrante 3");
            }else{
                System.out.println("Quadrante 4");
            }
             x = sc.nextInt();
             y = sc.nextInt();
        }
        sc.close();
    }
}
