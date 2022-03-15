package exercícios.exercicioslistas;

public class functions {
    private Integer id;
    private String name;
    private Double salary;

    functions(){
    }

    functions(Integer id, String name, Double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double increaseSalary(double percentage){
        return salary += salary * percentage / 100.0;
    }

    public String toString(){
        return id + ", " + name + ", " + String.format("%.2f", salary);
    }

}
