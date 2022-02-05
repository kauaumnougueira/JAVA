package exercícios.exerciciosrepetitivas;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pergunta, alcool, gasolina, diesel;

        alcool = 0;
        gasolina = 0;
        diesel = 0;
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("digite a sua preferência de acordo com a lista: : 1.Álcool 2.Gasolina 3.Diesel 4.Fim");
        pergunta = sc.nextInt();

        while(pergunta != 4){
            if(pergunta == 1){
                alcool += 1;
            }else if(pergunta == 2){
                gasolina += 1;
            }else if(pergunta == 3){
                diesel += 1;
            }
            pergunta = sc.nextInt();
        }        
        System.out.println("MUITO OBRIGADO!");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
