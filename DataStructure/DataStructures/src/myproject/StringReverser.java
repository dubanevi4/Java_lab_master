package myproject;

public class StringReverser {
    public Stack reverse(String input){
        Stack stack = new Stack();
        for (char ch : input.toCharArray()){
            stack.push(ch);
        }
        return stack;
    }
}

class Main3{
    public static void main(String[] args){
        String str = "abcd";
        StringReverser test = new StringReverser();
        test.reverse(str);
        System.out.println(test.toString());
    }
}
