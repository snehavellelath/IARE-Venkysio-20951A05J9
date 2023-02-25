import java.util.*;
import java.time.*;


public class MyClass {
    public static void main(String args[]) {
        long start = System.currentTimeMillis();
        Scanner obj = new Scanner(System.in);  
        String str = obj.nextLine(); 

        reversal (str);
        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;
        System.out.println();
        System.out.println(timeElapsed);
    }
    
    public static void reversal(String str){
        if (str.length() > 0){
        System.out.print(str.charAt(str.length()-1));
        reversal(str.substring(0,str.length()-1));
    }
      
    }
}
