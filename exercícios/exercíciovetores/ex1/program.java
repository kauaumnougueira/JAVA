package exercícios.exercíciovetores.ex1;
import java.util.Scanner;

public class program {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        functions[] rooms = new functions[10];

        System.out.println("how many rooms do you want to occupy?");
        int n = input.nextInt();
        
        for(int i =0; i < n; i++){
            input.nextLine();
            int n1 = i + 1;
            System.out.println("data for the " + n1 + "° person: ");
            System.out.println("enter the name of the person who will occupy the room: ");
            String name = input.nextLine();
            System.out.println("enter the e-mail of the person who will occupy the room: ");
            String email = input.nextLine();
            System.out.println("enter the number room: ");
            int room = input.nextInt();
            rooms[room] = new functions(name, email);
        }
        for(int i = 0; i < 10; i++){
            if(rooms[i] != null){
                System.out.println(i + ": " + rooms[i]);
            }
        }
        input.close();
    }
}
