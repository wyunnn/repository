import java.io.*;
import java.util.*;


public class MyClass {
    public static void main(String args[]) {
        
        Scanner scanner = new Scanner(System.in);
        int [] input = new int [6];
        
        for(int i = 0; i < 6; i++){
            input[i] = scanner.nextInt();
        }
        boolean result = false;
        
        for(int i = 0; i < 6; i++){
            for(int j = i+1; j < 6; j++){
                for(int k = j+1; k < 6; k++){
                    int idx = 0;
                    int sum = 0;
                    while(idx < 6){
                        if(idx != i && idx != j && idx != k){
                            sum += input[idx];
                        }
                        idx++;
                    }
                    if(sum == input[i] + input[j] + input[k]){
                        result = true;
                        System.out.println("YES");
                        break;
                    }
                }
                if (result == true){
                    break;
                }
            }
            if (result == true){
                    break;
            }
        }
        
        if(result == false){
                System.out.println("NO");
        }
    }
}
