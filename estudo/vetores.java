package estudo;
import java.util.Scanner;

public class vetores {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        double[] height = new double[n];

        for(int i=0; i<n; i++){
            height[i] = input.nextDouble();
        }
        double sum = 0.0;
        for (int i =0; i<n; i++){
            sum += height[i];
        }
        System.out.printf("average Height: %.2f", sum/3);
        input.close();
    }
}
