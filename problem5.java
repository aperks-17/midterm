import java.util.Scanner;
public class problem5
{
   public static void convertBinaryToInt(){
    Scanner input=new Scanner(System.in);
    System.out.println("Please enter a binary number");
    String x=input.next();
    
    int y=Integer.parseInt(x,2);
    System.out.print(y);
    }
}
