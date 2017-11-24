import java.io.*;
import java.util.*;

public class MyClass {
    public static void main(String args[]) {
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] parts = new int[n]; 
        
        for(int i = 0; i < n; i++){
            parts[i] = scanner.nextInt();
        }
        
        int total = 0;
        
        for(int i = 0; i < n; i ++){
            if (parts[i] + k <= 5){
                total ++;
            }
        }
        System.out.println(total/3);
    }
}
