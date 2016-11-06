package package1;

public class Sol008 {
    public int myAtoi(String str) {
        char charArray [] = str.toCharArray();
        long output = 0;
        int sign = 0;
        int a;
        
        for (int i = 0; i < charArray.length; i++){
            a = charArray[i];
            if(a == '-' && sign == 0)               	sign = -1;
            else if (a == '+' && sign == 0)         	sign = 1;
            else if('0' <= a && a <= '9'){
                if(sign == 0)   sign = 1;
                output = output * 10 + (a - '0');
                if(sign * output > Integer.MAX_VALUE)   return Integer.MAX_VALUE;
                if(sign * output < Integer.MIN_VALUE)   return Integer.MIN_VALUE;
            }
            else if(a == ' ' && sign != 0)              break;
            else							            break;
        }
        return sign * (int)output;
    }
}