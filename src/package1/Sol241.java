class Solution {
    public List<Integer> diffWaysToCompute(String input) {
        ArrayList<Integer> ret = new ArrayList<>();
        
        for(int i = 0; i < input.length(); i++){
            
            if(input.charAt(i) == '*' || input.charAt(i) == '-' || input.charAt(i) == '+'){
                String as = input.substring(0, i);
                String bs = input.substring(i+1);
                List<Integer> al = diffWaysToCompute(as);
                List<Integer> bl = diffWaysToCompute(bs);
                for(Integer m : al){
                    for(Integer n : bl){
                        if(input.charAt(i) == '*'){
                            ret.add(m*n);
                        }
                        else if(input.charAt(i) == '-'){
                            ret.add(m-n);
                        }
                        else{
                            ret.add(m+n);
                        }    
                    }
                }
            }
        }
       
        if(ret.size() == 0){
            ret.add(Integer.parseInt(input));
        }
        return ret;
    }
}
