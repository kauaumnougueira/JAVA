package exercícios.exerciciosclasseseobjetos.ex2;

public class functionsex2 {
    public String name;
    public double grossSalary;
    public double tax;

    public void increaseSlary(double percentage){
        grossSalary += grossSalary * percentage / 100;
    }
    public double netSalary(){
        double editedSalary = grossSalary - tax;
        return editedSalary;
    }
    public String toString(){
        String editedLog = name + ", R$ " + String.format("%.2f", netSalary());
        return editedLog;
    }
}
