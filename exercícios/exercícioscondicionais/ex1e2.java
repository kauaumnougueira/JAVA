/* 
    negativo ou positivo  
    par ou ímpar
*/

package exercícios.exercícioscondicionais;
import java.util.Scanner;

public class ex1e2{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a;
            
        a = sc.nextInt();
            
        if(a >= 0){
            System.out.println("Positivo");
        }else{
            System.out.println("Negativo");
        }
        if(a % 2 == 0){
            System.out.println("Par");
        }else{
            System.out.println("Ímpar");
        }
    
        sc.close();
         
    }
}
   