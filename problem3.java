
public class problem3
{
    public static void drawBox(int x){
        for(int i=1; i<=x; i++){
            for(int j=1; j<=x; j++){
                if(j==x||j==1||i==x||i==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
