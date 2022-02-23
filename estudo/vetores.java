package estudo;
import java.util.Scanner;

public class vetores {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("-------------------------------------");
        System.out.println("Quantas alturas você deseja comparar?");
        int n = input.nextInt();
        double[] height = new double[n];

        for(int i=0; i<n; i++){
            System.out.println("-------------------");
            System.out.println("Digite as alturas: ");
            height[i] = input.nextDouble();
        }
        double sum = 0.0;
        for (int i =0; i<n; i++){
            sum += height[i];
        }
        System.out.printf("average Height: %.2f", sum/n);
        input.close();
    }
}
