import java.lang.Math; // headers MUST be above the first class
import java.util.*;

public class HelloWorld
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
    Scanner cin = new Scanner(System.in);
    int n = cin.nextInt(), m = cin.nextInt(), a = cin.nextInt();
    
    long x = (n - 1)/a + 1;
    long y = (m - 1)/a + 1;
    
    System.out.println(x*y);
     
  }
}
