class Solution {
    public boolean isValid(String s) {
        boolean checker = false;
        Stack<Character> stack = new Stack();
        HashMap<Character,Character> closeToOpen = new HashMap();
        closeToOpen.put(')','(');
        closeToOpen.put(']','[');
        closeToOpen.put('}','{');

        for(int i = 0; i < s.length(); i++ ){
            if(closeToOpen.containsKey(s.charAt(i))){
                if(!stack.isEmpty() && stack.peek() == closeToOpen.get(s.charAt(i))){
                    stack.pop();
                }else{
                    return false;
                }
            }else{
                stack.push(s.charAt(i));
            }
        }
        if(stack.isEmpty()){
            checker = true;
        }
        return checker;
    }
}
