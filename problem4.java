import java.util.Scanner;
public class problem4
{
    public static void closest(){
        Scanner input=new Scanner(System.in);
        int x=0;
        int y=999;
        do {
            System.out.println("Please enter numbers until you hit 0");
            x=input.nextInt();
            if(x!=0){
                if(Math.abs(x)<y){
                    y=x;
                }
            }
        }
        while(x!=0);
        System.out.println("The number closest to zero is "+ y);
    }
}
