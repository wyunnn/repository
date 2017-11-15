import java.io.*;
import java.util.*;


public class MyClass {
    public static void main(String args[]) {
        
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        int i1 = m-1, j1 = n-1;
        int i2 = 0, j2 = 0;
        
        String [] squares = new String[m]; 
        int si = 0;
        while(scanner.hasNext()){
            squares[si] = scanner.next();
            si++;
        }
        
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                char sq = squares[i].charAt(j);
                if(sq == '*'){
                    if (i <  i1){
                        i1 = i;
                    }
                    if(j < j1){
                        j1 = j;
                    }
                    if(i > i2){
                        i2 = i;
                    }
                    if(j > j2){
                        j2 = j;
                    }
                }
            }
        }
        
        //System.out.println(i1+","+j1);
        //System.out.println(i2+","+j2);
        
        for(int i = i1; i <= i2; i++){
            System.out.println(squares[i].substring(j1, j2+1));
        }
        
    }
}
