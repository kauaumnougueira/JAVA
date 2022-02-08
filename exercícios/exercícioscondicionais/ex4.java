/*
Hora inicial e final de um jogo
mínimo de 1 hora e máximo de 24 horas
*/

package exercícios.exercícioscondicionais;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    int inicio, fim, duracao;
    
    System.out.println("insira o horário de início do jogo"); 
    inicio = sc.nextInt();

    System.out.println("Insira o horário de finalização do jogo");
    fim = sc.nextInt();
    
    if(fim-inicio>= 1 && fim-inicio <= 24){
        if(inicio<fim){
            duracao = fim-inicio;
        }else{
            duracao = 24 - fim + inicio;
        }           
        System.out.println("a duração do jogo foi de " + duracao + " horas");  
    }else{
        System.out.println("O jogo tem que ter duração mínima de 1 hora e máxima de 24 horas");
    }


    sc.close();
    }
}
