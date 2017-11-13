import java.lang.Math; // headers MUST be above the first class
import java.util.*;

// one class needs to have a main() method
public class HelloWorld
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
    Scanner cin = new Scanner(System.in);
    int n = cin.nextInt();
    int k = cin.nextInt();
    int next = cin.nextInt();
    int [] balls = new int [n];
    
    for(int i = 0; i < n; i++){
        balls[i] = cin.nextInt();
    }
    
    //pos 0 ... n 
    int max = 0;
    for(int i = 0; i <= n; i++){
        int des_num = destroy(balls, i-1, i, next);
        if (des_num > max){
            max = des_num;
        }
    }

    System.out.println(max);
    
  }
    
    public static int destroy(int [] balls, int left, int right, int k){
        int cnt = 0;
        int color = 0;
        
        if(k == 0){
            if(left >= 0){
                color = balls[left];
                left--;
                cnt++;
            }
            else if (right < balls.length){
                color = balls[right];
                right++;
                cnt++;
            }
            else{
                return 0;
            }
        }
        else{
            color = k;
        }
        
        while(left >= 0){
            if(balls[left] == color){
                cnt++;
                left--;
            }
            else{
                break;
            }
        }
        while(right < balls.length){
            if(balls[right] == color){
                cnt++;
                right++;
            }
            else{
                break;
            }
            
        }
        if(cnt > 2 || (cnt == 2 && k > 0)){
            if(left >=0 || right < balls.length){
                cnt += destroy(balls, left, right, 0);
            }
        }
        else{
            cnt = 0;
        }
        return cnt;
    }
}

