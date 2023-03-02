import java.util.Scanner;

public class ReverseRecursion{
  
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.print("Enter the para to be reversed:");
    String para = obj.nextLine();
    String reversed_para = reverse(para);
    System.out.println(reversed_para);
  }
  
  public static String reverse(String para) {
    if (para.isEmpty()) {
      return para;
    }
    else{
      return reverse(para.substring(1)) + str.charAt(0);
    }
  }
  
}
