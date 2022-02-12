package estudo;
import java.util.Scanner;

public class function {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);

        System.out.println("adcione 3 números");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        
        int maior = max(n1, n2, n3);
        mostrarMaior(maior);

        sc.close();
    }
    public static int max(int nUm, int nDois, int nTres) {
        int axl;
        if(nUm > nDois && nUm >nTres){
            axl = nUm;
        }else if(nDois > nUm && nDois > nTres){
            axl = nDois;
        }else{
            axl = nTres;
        }
        return axl;
    }
    public static void mostrarMaior(int valor) {
        System.out.println("maior = " + valor);
    }
}
