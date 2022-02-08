/*package estudo;
import java.util.Scanner;


public class estudo2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int idade, qtd, peso, altura, qtd_homens, qtd_mulheres, media_idade_gp, media_idade_homens, mulheres_mais_20, media_altura, peso_mais90, menos50e_menos160m, menos190_mais100;
        String sexo;
        
        qtd_homens = 0;
        qtd_mulheres = 0;

        System.out.println("Quantidade de pessoas");
        qtd = sc.nextInt();
        while(qtd >= 1){
            qtd-=1;
            System.out.println("idade");
            idade = sc.nextInt();
            System.out.println("sexo");
            sexo = sc.next();
            System.out.println("peso");
            peso = sc.nextInt();
            System.out.println("altura");
            altura = sc.nextInt();
            if(sexo.equals("m")){
                qtd_homens += 1;
            }if(sexo.equals("f")){
                qtd_mulheres += 1;
            }
        }
        System.out.println("mulheres " + qtd_mulheres);
        System.out.println("homens  " + qtd_homens);
        
        sc.close();
    }
}*/
