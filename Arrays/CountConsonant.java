//count the number of consonants in a string
import java.util.Scanner;

public class CountConsonant{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for(int i=0;i<str.length();i++){
            char ch = Character.toLowerCase(str.charAt(i));
            if(ch>='a' && ch<='z' && ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u'){
                    count++;
                
            }
        }
        System.out.println("The number of consonants in the string is: "+count);
        sc.close();
    }
}
