package package1;

public class Sol292 {
    public boolean canWinNim(int n) {
        if(n<0){
            return false;
        }
        if(n%4==0){
            return false;
        }
        else{
            return true;
        }
        
    }
}