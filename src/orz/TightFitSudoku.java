import java.io.*;
import java.util.*;

public class MyClass {
    
    static int[][] segs;
    static int[] points;
    static boolean stop;
    
    public static void main(String args[]) throws Exception{
        
        Scanner scanner = new Scanner(System.in);
        //BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        char[][] g1 = new char[6][6];
        char[][] g2 = new char[6][6];
        
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                String s = scanner.next();
                g1[i][j] = s.charAt(0);
                if(s.length() > 2 && s.charAt(1) == '/'){
                    g2[i][j] = s.charAt(2);
                }
            }
        }
        
        boolean result = solve(g1, g2);
        System.out.println(result);
        print(g1, g2);
        
        
    }
    public static void print(char[][]g1, char[][]g2){
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                System.out.print(g1[i][j]);
                if(g2[i][j] != '\u0000'){
                    System.out.print("/"+g2[i][j]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }
        
    public static boolean solve(char[][] g1, char[][] g2){
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                if(g1[i][j] == '-'){
                    
                    if (g2[i][j] == '-'){//g2 is empty
                        for(int k = 1; k<=9; k++){
                            if(isValid(g1, g2, i, j, (char)(k+'0'))){
                                g1[i][j] = (char)(k+'0');
                                for(int l = k+1; l <=9; l++){
                                    if(isValid(g1, g2, i, j, (char)(l+'0'))){
                                        g2[i][j] = (char)(l+'0');
                                        if(solve(g1, g2)){
                                            return true;
                                        }
                                        g2[i][j] = '-';
                                    }
                                }
                                g1[i][j] = '-';
                            }
                        }
                        return false;
                    }
                    else {
                        int end = 10; //default (if no g2)
                        if('1'<= g2[i][j] && g2[i][j]<= '9'){ //g2 is not null
                            end = g2[i][j] - '0';
                        }
                        
                        for(int k = 1; k< end; k++){
                            if(isValid(g1, g2, i, j, (char)(k+'0'))){
                                g1[i][j] = (char)(k+'0');
                                if(solve(g1, g2)){
                                    return true;
                                }
                                g1[i][j] = '-';
                            }
                        }
                        return false;
                    }   
                }
                
                else if(g2[i][j] == '-'){ // g1 has num
                    for(int k = g1[i][j]-'0'+1; k<=9; k++){
                        if(isValid(g1, g2, i, j, (char)(k+'0'))){
                             g2[i][j] = (char)(k+'0');
                             if(solve(g1, g2)){
                                 return true;
                             }
                             g2[i][j] = '-';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    
    public static boolean isValid(char[][] g1, char[][] g2, int m, int n, char num){
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                if(i == m || j == n){
                    if(g1[i][j] == num || g2[i][j] == num){
                        //System.out.println("i+j "+i+":"+j+" num "+num);
                        //print(g1, g2);
                        return false;
                    }
                }
                if(i/2 == m/2 && j/3 == n/3){
                    if(g1[i][j] == num || g2[i][j] == num){
                        //System.out.println("i+j "+i+":"+j+" num "+num);
                        //print(g1, g2);
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
