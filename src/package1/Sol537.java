package package1;

public class Sol537 {
    public String complexNumberMultiply(String a, String b) {
        int a1 = getA(a);
        int b1 = getB(a);
        int a2 = getA(b);
        int b2 = getB(b);
        
        return (a1*a2-b1*b2)+"+"+(a1*b2+a2*b1)+"i";
    }
    
    private int getA(String a){
        String n = a.substring(0, a.indexOf('+'));
        return Integer.parseInt(n);
    }
    
    private int getB(String b){
        String n = b.substring(b.indexOf('+')+1, b.indexOf('i'));
        return Integer.parseInt(n);
    }
}