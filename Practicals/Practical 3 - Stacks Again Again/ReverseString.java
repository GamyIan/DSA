import java.util.Stack;

class ReverseString {
    static String reverse(String inp){
        Stack<Character> stack = new Stack<>();
        for (char ch : inp.toCharArray()){
            stack.push(ch);
        }
        
        StringBuilder rev = new StringBuilder();
        while(!stack.isEmpty()){
            rev.append(stack.pop());
        }
    
        return rev.toString();
    }

    public static void main(String[] args){

        String str = "Hello";
        System.out.println("Original: "+str);
        System.out.println("Reversed: "+reverse(str));
    }
}