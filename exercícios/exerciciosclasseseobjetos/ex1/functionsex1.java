package exercícios.exerciciosclasseseobjetos.ex1;

public class functionsex1 {
    public double lSmaller;
    public double lLarger;
     
    public  double area(){
        double areaResult =  lSmaller * lLarger;
        return areaResult;
    }
    public double perimeter(){
        double perimeterResult = (lSmaller * 2.00) + (lLarger * 2.00);
        return perimeterResult;
    }
    public double diagonal(){
        double diagonalResult = Math.sqrt((lSmaller * lSmaller) + (lLarger * lLarger));
        return diagonalResult;
    }
}
