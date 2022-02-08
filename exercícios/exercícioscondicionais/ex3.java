/*
Múltiplos ou não múltiplos
*/

package exercícios.exercícioscondicionais;
import java.util.Scanner;

public class ex3{
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int a, b;

    a = sc.nextInt();
    b = sc.nextInt();

    if(a>b){
        if(a%b==0){
            System.out.println("São múltiplos");
        }else{
            System.out.println("Não são múltiplos");
        }
    }else{
        if(b%a==0){
            System.out.println("São múltiplos");
        }else{
            System.out.println("Não são múltiplos");
        }
    }

    sc.close();
    }

}
