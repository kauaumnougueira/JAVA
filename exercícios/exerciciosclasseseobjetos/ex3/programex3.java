package exercícios.exerciciosclasseseobjetos.ex3;
import java.util.Scanner;

public class programex3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        functionsex3 student;
        student = new functionsex3();

        System.out.println("----------------------------");
        System.out.println("Digite os dados do aluno");
        System.out.println("Nome: ");
        student.name = sc.next();
        System.out.println("Nota do primeiro trimestre: ");
        student.note1 = sc.nextDouble();
        System.out.println("Nota do segundo trimestre: ");
        student.note2 = sc.nextDouble();
        System.out.println("Nota do terceiro trimestre: ");
        student.note3 = sc.nextDouble();
        System.out.println("----------------------------");

        System.out.println("-------------------");
        System.out.println("Situação do aluno: ");
        String logEdited = student.toString();
        System.out.println(logEdited);
        System.out.println("-------------------");

        sc.close();
    }
}
