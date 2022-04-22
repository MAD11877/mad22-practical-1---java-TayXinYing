import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    
    System.out.print("Input weight in kg: ");
    double height = in.nextDouble();
    
    System.out.print("Input height in m squared: ");
    double weight = in.nextDouble();
    
    double BMI = weight / height;
    System.out.print("Body Mass Index is " + BMI + "\n");
  }
}
