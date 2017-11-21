
import java.io.*;
import java.util.*;

public class MyClass {
    public static void main(String args[]) {
        
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        
        int total = 0;
        int num100 = 0;
        
        for(int i = 0; i < m; i++){
            int num = scanner.nextInt();
            total += num;
            if(num == 100){
                num100++;
            }
        }
        
        if(total%400 == 0){
            System.out.println("YES");
        }
        else if(total%200 == 0){
            if(num100 >= 2){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        else {
            System.out.println("NO");
        }
    }
}
