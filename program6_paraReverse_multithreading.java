import java.util.Scanner;

public class ReverseMultithreading {
  Scanner = obj new Scanner(System.in);
  System.out.print("Enter the paragraph to be reversed:");
  String para = obj.nextLine();
  
  Thread thread = new Thread() -> {
    String reversed_para = reverse(para);
    System.out.println(reversed_para);
  });
  thread.start();
}

public static String reverse(String para) {
  if (para.isEmpty()) {
    return para;
  }
  else { 
    return reverse(para.substring(1)) + para.charAt(0);
  }
}

}
