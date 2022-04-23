import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    
    System.out.print("Input integer: ");
    int integer = in.nextInt();
    
    int value = integer * integer;
    System.out.print("The result is " + value + ".\n");  
  }
}
