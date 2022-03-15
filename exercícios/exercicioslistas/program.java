package exercícios.exercicioslistas;
import java.util.List;
import java.util.Locale;
import java.util.ArrayList;
import java.util.Scanner;

public class program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        //USING "WHILE" TO MAKE THE PROGRAM WORK IN LOOP

        System.out.println("------------------");
        System.out.println("hi i am your management program");
        System.out.print("Do you want to use me? (y/n) or (yes/not) ");
        String firstChoice = sc.next();

        List<functions> employeeList = new ArrayList<>();
        while(firstChoice.equals("y") || firstChoice.equals("yes")){


        System.out.println("------------------");
        System.out.print("How many employees will be registered? ");
        int employeeNum = sc.nextInt();
        sc.nextLine();

        // PART I: READING DATA

        for(int i = 1; i <= employeeNum; i++){
            System.out.println("------------------");
            System.out.println("Emplyoee #"+ i +": ");
            System.out.print("Enter the employee Id: ");
            int id = sc.nextInt();

            //ID CHECKER

            while(hasId(employeeList, id)){
                System.out.println("the employee id has already taken. try again: ");
                id = sc.nextInt();
            }
            sc.nextLine();
            System.out.print("Enter the employee name: ");
            String name = sc.next();
            System.out.print("Enter the employee salary: ");
            double salary = sc.nextDouble();

            employeeList.add(new functions(id, name, salary));

        }

        //PART II: ADDING SALARY

        System.out.println("------------------");
        System.out.println("Do you want to increase any salary? (y/n) or (yes/not)");
        String choice = sc.next();

        if(choice.equals("n") || choice.equals("not")){
            System.out.println("------------------");
            System.out.println("ok...");
            System.out.println("we're done here!");
        }else{
            System.out.println("------------------");
            System.out.println("So...");
            System.out.print("Enter the ID of the employee who will receive the salary increase: ");
            int id = sc.nextInt();

            //ID CHECKER

            functions employee = employeeList.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
            if(employee == null){
                System.out.println("------------------");
                System.out.println("This ID does not exist!");
            }else{

            //ADDING THE "ADDING FUNCTION"

            System.out.println("------------------");
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextInt();
            employee.increaseSalary(percentage);
            }
        }
        //PART III: SHOWING EMPLOYEE LIST

        System.out.println("------------------");
        System.out.println("employees list: ");
        for(functions employeePrint: employeeList){
             System.out.println(employeePrint.toString());
        }

        System.out.println("Want to keep using me? (y/n) or (yes/not)");
        firstChoice = sc.next();

        employeeList.add(new functions());
    }
    System.out.println("Thanks for using me");
        sc.close();
    }
    public static boolean hasId(List<functions> employeeList, int id){
        functions employee = employeeList.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return employee != null;
    }
}
// PROGRAM PRINTS "NULL, NULL, NU" IF NO EMPLOYEE IS ADDED (UNSOLVED PROBLEM) 
