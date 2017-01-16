package package1;

public class Sol482 {
    public String licenseKeyFormatting(String S, int K) {
        String ret = new String();
	
        for(int i = S.length() - 1, j = 0; i >= 0 ; i--){
            if(S.charAt(i) != '-'){
                if( j % K == 0 && j != 0){
	                ret+='-';
                }
		        ret+=S.charAt(i);
	        	j++;
            }
        }
	    return new StringBuilder(ret).reverse().toString().toUpperCase();	
    }
}

