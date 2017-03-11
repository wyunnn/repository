

import java.util.Scanner;

public class Main {
  
  public static void main(String[] args){
    //Scanner in = new Scanner(System.in);
    //String line = in.nextLine();
    System.out.println(helper("axbcba", 2, 0, 5));
	  //System.out.println(solve("axbcba"));
  }
  
  public static long solve(String s){
      long sum = 0;
      
      for(int i = 0; i < s.length(); i++){
    	  long m = helper(s, i, 0, s.length()-1);
    	  //System.out.println(i+"m"+m);
          sum += m;
      }     
      return sum % (1000000007);
  }
    
  private static long helper(String s, int i, int left, int right){
	  if(left > i || right < i){
		  return (long)0;
	  }
      if(left == i || right == i){
          return (long)1;
      }
      else if(s.charAt(left) == s.charAt(right)){
    	  long a = helper(s, i, left+1, right);
    	  long b = helper(s, i, left, right-1);
    	  System.out.println("a"+a);
    	  System.out.println("b"+b);
          return helper(s, i, left+1, right-1)*2;
      }
      else{
    	  long k = helper(s, i, left+1, right);
    	  long p = helper(s, i, left, right-1);
    	  k = Math.max(k,p);
          return  k;
      }
  }
  
  private static boolean isP(String s){
	  int i = 0, j = s.length();
	  while(i < j){
		  if(s.charAt(i) != s.charAt(j))
			  return false;
	  }
	  return true;
  }

}