import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    
    //System.out.print("Input weight in kg: ");
    double weight = in.nextDouble();
    
    //System.out.print("Input height in meters: ");
    double height = in.nextDouble();
    
    double BMI = weight / (height * height);
    System.out.print("Body Mass Index is " + String.format("%.2f", BMI) + " kg/m2. \n");
  }
}
