class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        
        int max = 0;
        int left = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push(i);
            }
            else{
                if(stack.size() == 0){
                    left = i+1;
                }
                else {
                    stack.pop();
                    if(stack.size() == 0){
                        max = Math.max(max, i-left+1);
                    }
                    else{
                        max = Math.max(max, i-stack.peek());
                    }
                }
            }
        }
        
        return max; 
    }
}
