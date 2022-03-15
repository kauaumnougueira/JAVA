package exercícios.exerciciosencapsulamento.ex1;


public class functionsex1 {
    private int number;
    private String name;
    double value;
    
    public functionsex1(int number, String name){
        this.value = number;
        this.name = name;
    }
    public functionsex1(int number, String name, double initialDeposit){
        this.number = number;
        this.name = name;
        deposit(initialDeposit);
    }
    public int getNumber(){
        return number;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getValue(){
        return value;
    }
    public void deposit(double amount){
        this.value += amount;
    }
    public void withdraw(double amount){
        this.value -= amount + 5.00;
    }

    public String toString(){
        String editedLog = "Account: "
        + number 
        + ", Holder: " 
        + name 
        + ", Balance: $" 
        + String.format("%.2f", this.value);
        return editedLog;
    }
}
