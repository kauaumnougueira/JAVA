package exercícios.exerciciosencapsulamento.ex1;

public class functionsex1 {
    private int number;
    private String name;
    private double value;
 

    public functionsex1(int number, String name, double value){
        this.number = number;
        this.name = name;
        this.value = value;
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
    public void setValue(double value){
        this.value = value;
    }
    public String toString(){
        String editedLog = "Account " + number + ", Holder: " + name + ", Balance: " + value;
        return editedLog;
    }
}
