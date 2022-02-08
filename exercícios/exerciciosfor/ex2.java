package exercícios.exerciciosfor;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, x, in, out;
        in = 0;
        out=0;
        x = 0;
        System.out.println("Quantidade");
        n = sc.nextInt();

        for(int i=0; i<n; i++){
            System.out.println("Número");
            x = sc.nextInt();
            if(20>=x && x>=10){
                in += 1;
            }else{
                out += 1;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
        sc.close();
    }
}