package package1;

public class Sol393 {
    public boolean validUtf8(int[] data) {
        int num = 0;
        
        for(int i = 0; i < data.length; i++){
            if(num != 0){
                if ((data[i] >> 6)!=0b10)   return false;
                num --;
                continue;
            }
            if ((data[i] >> 7) == 0)    continue;
            else if ((data[i] & 0b11100000) == 0b11000000)       num++;
            else if ((data[i] & 0b11110000) == 0b11100000)       num+=2;
            else if ((data[i] & 0b11111000) == 0b11110000)       num+=3;
            else    return false;
        }
        
        return num == 0;        
    }
}