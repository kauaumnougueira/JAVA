package exercícios.exerciciosclasseseobjetos.ex3;

public class functionsex3 {
    public String name;
    public double note1;
    public double note2;
    public double note3;
    
    public double finalGrade(){
        double finalgrade = note1 + note2 + note3;
        return finalgrade;
    }
    public double missingPoints(){
        if(finalGrade() < 60.0){
            double aux = 60.0 - finalGrade();
            return aux;
        }else{
            double aux = 0.0;
            return aux;
        }
        
    }
    public String toString(){
        if(finalGrade() < 60.0){
            String editedLog = "FINAL GRADE = " + String.format("%.2f", finalGrade()) + "\nFAILED" + "\nMissing points: " + String.format("%.2f", missingPoints());
            return editedLog;
        }else{
            String editedLog = "FINAL GRADE = " + String.format("%.2f", finalGrade()) + "\nPASS";
            return editedLog;
        }

    }
}
