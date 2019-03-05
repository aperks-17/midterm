
public class problem1
{
    public static boolean countE(String eee){
        int count=0;
        for(int i=0; i<eee.length(); i++){
            char a=eee.charAt(i);
            if(a=='e'){
                count++;
                if(count<1||count>3){
                    return false;
                }
            }
        }
        return true;
    }
}
