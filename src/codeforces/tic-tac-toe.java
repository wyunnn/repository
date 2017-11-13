import java.lang.Math; // headers MUST be above the first class
import java.util.*;

// one class needs to have a main() method
public class HelloWorld
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
    Scanner cin = new Scanner(System.in);
    String ret = "";
    
    int[][] m = new int [3][3];
    
    for(int i = 0; i < 3; i++){
        String line= cin.next();
        for(int j = 0; j < 3; j++){
           char a = line.charAt(j);
           if(a == '.'){
               m[i][j] = -1;
           }
           else if (a =='X'){
               m[i][j] = 1;
           }
           else {
               m[i][j] = 0;
           }
        }
    }
    
    int num_x = 0, num_o = 0;
    for(int i = 0; i < 3; i++){
        for(int j = 0; j < 3; j++){
            if(m[i][j] == 1){
                num_x++;
            }
            else if(m[i][j] == 0){
                num_o++;
            }
        }
    }
    
    if(num_x > 5 || num_o > 4 || num_x - num_o < 0 || num_x - num_o > 1){
        ret = "illegal";
        System.out.println(ret);
        return;
    }
    
    if(num_x - num_o == 1 && !ret.equals("illegal")){
        ret = "second";
    }
    else if(num_x - num_o == 0 && !ret.equals("illegal")){
        ret = "first";
    }
    
    boolean first_won = false, second_won = false;
    if(pure_row(m, 0, 1) || pure_row(m, 1, 1) || pure_row(m, 2, 1)
    || pure_col(m, 0, 1) || pure_col(m, 1, 1) || pure_col(m, 2, 1)
    || pure_cross1(m,1) || pure_cross2(m,1)){
        first_won = true;
    }
    
    if(pure_row(m, 0, 0) || pure_row(m, 1, 0) || pure_row(m, 2, 0)
    || pure_col(m, 0, 0) || pure_col(m, 1, 0) || pure_col(m, 2, 0)
    || pure_cross1(m, 0) || pure_cross2(m, 0)){
        second_won = true;
    }
    
    //draw

    if (first_won && second_won){
        ret = "illegal";
        System.out.println(ret);
        return;
    }
    else if(first_won){ 
        if(num_x - num_o == 0){
            System.out.println("illegal");
            return;
        }
        ret = "the first player won";
    }
    else if(second_won){
        if(num_x - num_o == 1){
            System.out.println("illegal");
            return;
        }
        ret = "the second player won";
    }
    else if(num_x + num_o == 9 && !(playable_row(m, 0) || playable_row(m, 1) || playable_row(m, 2)
      || playable_col(m, 0) || playable_col(m, 1) || playable_col(m, 2)
      || playable_cross1(m) || playable_cross2(m))){
        ret = "draw";
     }
     
     
     System.out.println(ret);
  }
  
 
  static boolean playable_row(int[][]m, int row){
      boolean p1= true, p2 = true;
      for(int i = 0; i < 3; i++){
          if (m[row][i] == 0){
              p1 = false;
          }
          if (m[row][i] == 1){
              p2 = false;
          }
      }
      return (p1 || p2);
  }
  
  static boolean playable_col(int[][]m, int col){
      boolean p1= true, p2 = true;
      for(int i = 0; i < 3; i++){
          if (m[i][col] == 0){
              p1 = false;
          }
          if (m[i][col] == 1){
              p2 = false;
          }
      }
      return (p1 || p2);
  }
  
    static boolean playable_cross1(int[][]m){
      boolean p1= true, p2 = true;
      for(int i = 0; i < 3; i++){
          if (m[i][i] == 0){
              p1 = false;
          }
          if (m[i][i] == 1){
              p2 = false;
          }
      }
      return (p1 || p2);
  }
  static boolean playable_cross2(int[][]m){
      boolean p1= true, p2 = true;
      for(int i = 0; i < 3; i++){
          if (m[i][2-i] == 0){
              p1 = false;
          }
          if (m[i][2-i] == 1){
              p2 = false;
          }
      }
      return (p1 || p2);
  }
  
  
  
  static boolean pure_row(int [][] m, int row, int player){
      boolean n = true;
      for(int i = 0; i < 3; i++){
          if (m[row][i] != player){
              n = false;
          }
      }
      return n;
  }
  static  boolean pure_col(int [][] m, int col, int player){
        boolean n = true;
        for(int i = 0; i < 3; i++){
            if(m[i][col] != player){
                n = false;
            }
        }
        return n;
      }
  
  static boolean pure_cross1(int[][] m, int player){
        boolean n = true;
        for(int i = 0; i < 3; i++){
            if(m[i][i] != player){
                n = false;
            }
        }
        return n;
  }
  static boolean pure_cross2(int[][] m, int player){
        boolean n = true;
        for(int i = 0; i < 3; i++){
            if(m[i][2-i] != player){
                n = false;
            }
        }
        return n;
  }
  
}
