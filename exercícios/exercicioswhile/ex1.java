package exercícios.exercicioswhile;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("digite sua senha");
        int senha = 0;
        while(senha != 2002){
            senha = sc.nextInt();
            if(senha != 2002){
                System.out.println("Senha inválida");
            }else{
                System.out.println("Acesso permitido");
            }
        }
/* também funciona
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha Invalida");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
*/
        sc.close();
    }
}