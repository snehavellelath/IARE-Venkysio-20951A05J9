import java.util.*;

public class MyClass {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);  
        String str = obj.nextLine(); 

        reversal (str);
    }
    
    public static void reversal(String str){
        if (str.length() > 0){
        System.out.print(str.charAt(str.length()-1));
        reversal(str.substring(0,str.length()-1));
    }
      
    }
}
