public class MyClass {
    public static void main(String args[]) {

      reversal ("Sneha");
    }
    
    public static void reversal(String str){
        if (str.length() > 0){
        System.out.print(str.charAt(str.length()-1));
        reversal(str.substring(0,str.length()-1));
    }
        else{
            System.out.println();
            System.out.println("Done");
        }
        
    }
}
