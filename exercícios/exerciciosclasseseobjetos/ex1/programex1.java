package exercícios.exerciciosclasseseobjetos.ex1;
import java.util.Scanner;


public class programex1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Object imported section
        functionsex1 rectangle;
        rectangle = new functionsex1();
        //-----------------------

        System.out.println("-------------------");
        System.out.println("Digite o lado menor");
        System.out.println("-------------------");
        rectangle.lSmaller = sc.nextDouble();

        System.out.println("-------------------");
        System.out.println("Digite o lado maior");
        System.out.println("-------------------");
        rectangle.lLarger = sc.nextDouble();

        System.out.println("----------------");
        System.out.println("Dados recebidos:");
        System.out.println("Lado menor: " + rectangle.lSmaller);
        System.out.println("Lado maior: " + rectangle.lLarger);
        System.out.println("-----------------");
        System.out.println("Operações: ");

        //function variables section
        double area = rectangle.area();
        double perimeter = rectangle.perimeter();
        double diagonal = rectangle.diagonal();
        //--------------------------

        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimeter);
        System.out.println("Diagonal: " + diagonal);
        System.out.println("-----------------");

        sc.close();
    }
}