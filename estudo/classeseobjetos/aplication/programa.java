package estudo.classeseobjetos.aplication;
import java.util.Scanner;

import estudo.classeseobjetos.entities.triangle;

public class programa{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        triangle x,y;
        x = new triangle();
        y = new triangle();

        System.out.println("adcione as medias do triangulo X");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("adcione as medias do triangulo Y");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double p = (x.a + x.b + x.c)/2.0;
        double areaX = Math.sqrt(p* (p-x.a) * (p-x.b) * (p-x.c));

        p =  (y.a + y.b + y.c)/2.0;
        double areaY = Math.sqrt(p* (p-y.a) * (p-y.b) * (p-y.c));
        sc.close();
        
        System.out.println("A áre3a do triângulo X é: " + areaX);
        System.out.println("A áre3a do triângulo Y é: " + areaY);

        if(areaY > areaX){
            System.out.println("A área do triângulo Y é maior que a área do triângulo X");
        }else{
            System.out.println("A área do triângulo X é maior que a área do triângulo Y");
        }
    }
}