import java.io.*;
import java.util.*;

public class MyClass {
    public static void main(String args[]) {
        
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int[] num = new int[m];
        
        int total = 0;
        
        for(int i = 0; i < m; i++){
            num[i] = scanner.nextInt();
            total += num[i];
        }
        
        int sum = 0;
        int ret = 0;
        
        for(int i = 0; i < m; i++){
            sum+=num[i];
            if(sum * 2 == total){
                ret++;
            }
        }
        
        if(sum == 0){
            System.out.println(ret-1);
        }
        else{
            System.out.println(ret);
        }
    }
}
