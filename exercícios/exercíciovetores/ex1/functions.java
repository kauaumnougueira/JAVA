package exercícios.exercíciovetores.ex1;

public class functions {
    private String name;
    private String email;

    public functions(String name, String email) {
        this.name = name;
        this.email = email;
    }  
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return name + ", " + email;
    }
}
