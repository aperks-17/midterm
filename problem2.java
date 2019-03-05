
public class problem2
{
    public static int countVowels(String vowel){
        int count=0;
        for(int i=0; i<vowel.length(); i++){
            char v=vowel.charAt(i);   
            if(v=='a'||v=='e'||v=='i'||v=='o'||v=='u'){
                count++;
            }
        }
        return count;
    }
}