package package1;

public class Sol258 {
    public int addDigits(int num) {
        int ans = num;
        if(ans<10)    return ans;
        while(ans>=10){
            ans = addOnce(ans);
        }
        return ans;
    }
    
    public int addOnce(int num){
        //if (num < 10)  return num;
        
        int a = 0;
        String s = Integer.toString(num);
        int l = s.length();
        
        for(int i = 0 ;i<l;i++){
            a+=Character.getNumericValue(s.charAt(i)); 
        }
        return a;
        
    }
}