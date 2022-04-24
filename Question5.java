import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  { 
    Scanner in = new Scanner(System.in);

        int cnt[] = new int[10];
		int i;
        
        //System.out.println("How many integers would you like to input(Max.10?)");
		int x = input.nextInt();
        
        //System.out.println("Input the integers:");
        for (i = 0; i <x; i++)
        { 
          int n = input.nextInt();
          cnt[--n]++;	
		    }
		 
        int max = 0;
        for (int n : cnt)
        {
          if (max < n)
          {
            max = n;
          }
        }
        
        //System.out.println("Mode value(s)in ascending order:");
        for (i = 0; i < cnt.length; i++)
        {
          if (cnt[i] == max)
          {
            System.out.println(i + 1);
          }
        }
  }
}
