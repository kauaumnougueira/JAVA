/*
mostrar produtos
multiplicar preço pela quantidade
*/
//o que está de comentário será uma nova implementação ainda em estudo
package exercícios.exercícioscondicionais;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
   // String yesornot;
    int codigo; //codigo2;
    double quantidade, preco;


    System.out.println("1 - CACHORRO-QUENTE -R$=4.00");
    System.out.println("2 - X-SALADA -R$=4.50");
    System.out.println("3 - X-BACON -R$=5.00");
    System.out.println("4 - TORRADA SIMPLES -R$=2.00");
    System.out.println("5 - REFRIGERANTE -R$=1.50");
   // System.out.println("Você deseja um ou mais produtos?(responda com 'um' ou 'mais de  um')");
    //yesornot = sc.next();
   // if(yesornot == "um"){
        System.out.println("Indique o código do produto que você deseja");
        codigo = sc.nextInt();
        System.out.println("Indique a quantidade de produtos que você deseja");
        quantidade = sc.nextInt();
        switch(codigo){
            case 1:
            preco = 4.00 * quantidade;
            System.out.println("o valor da sua compra será " + preco + " reais");
            break;
            case 2:
            preco = 4.5 * quantidade;
            System.out.println("o valor da sua compra será " + preco + " reais");
            break;
            case 3:
            preco = 5.00 * quantidade;
            System.out.println("o valor da sua compra será " + preco + " reais");
            break;
            case 4:
            preco = 2.00 * quantidade;
            System.out.println("o valor da sua compra será " + preco + " reais");
            break;
            case 5:
            preco = 1.50 * quantidade;
            System.out.println("o valor da sua compra será " + preco + " reais");
            break;
        }
   // }
    /*else{
        System.out.println("Indique o código de um produto que você deseja");
        codigo = sc.nextInt();
        System.out.println("Indique o código do outro produto que você deseja");
        codigo2 = sc.nextInt();
        System.out.println("Indique a quantidade de produtos que você deseja");
        quantidade = sc.nextInt();
        switch(codigo){
            case 1:
            preco = 4.00 * quantidade;
            System.out.println("o valor da sua compra será " + preco + " reais");
            break;
            case 2:
            preco = 4.5 * quantidade;
            System.out.println("o valor da sua compra será " + preco + " reais");
            break;
            case 3:
            preco = 5.00 * quantidade;
            System.out.println("o valor da sua compra será " + preco + " reais");
            break;
            case 4:
            preco = 2.00 * quantidade;
            System.out.println("o valor da sua compra será " + preco + " reais");
            break;
            case 5:
            preco = 1.50 * quantidade;
            System.out.println("o valor da sua compra será " + preco + " reais");
            break;
        }
    }
    
*/
    sc.close();
    }
}
