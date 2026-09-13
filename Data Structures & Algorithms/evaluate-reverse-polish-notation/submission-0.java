class Solution {
    public int evalRPN(String[] tokens) {

        Deque<Integer> stack = new ArrayDeque<>();
        int a,b = 0;
        int result = 0;
        
        for(String s: tokens){
            if(s.equals("+")){
                b = stack.pop();
                a = stack.pop();

                result = a + b;
                stack.push(result);


            } else if(s.equals("-")){
                b = stack.pop();
                a = stack.pop();

                result = a - b;
                stack.push(result);

            } else if(s.equals("*")){
                b = stack.pop();
                a = stack.pop();

                result = a * b;
                stack.push(result);
            }else if(s.equals("/")){
                b = stack.pop();
                a = stack.pop();

                result = a / b;
                stack.push(result);
            }else{
                int num = Integer.parseInt(s);
                stack.push(num);
            }
        }
        return stack.pop();
    } 
}
