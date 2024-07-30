package myproject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Expression {

    private static final List<Character> LEFT_BRACKETS = Arrays.asList('(','[','<','{');
    private static final List<Character> RIGHT_BRACKETS = Arrays.asList(')',']','>','}');

    public boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            if (isLeftBracket(ch)) {
                stack.push(ch);
            }
            if (isRightBracket(ch)){
                if (stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if (!isMatch(top, ch)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static boolean isLeftBracket(char ch){
        return LEFT_BRACKETS.contains(ch);
    }

    private static boolean isRightBracket(char ch){
        return RIGHT_BRACKETS.contains(ch);
    }

    private static boolean isMatch(char left, char right) {
    return LEFT_BRACKETS.indexOf(left) == RIGHT_BRACKETS.indexOf(right);
    }
}

class MainExpression{
    public static void main(String[] args){
        Expression exp = new Expression();
        System.out.println(exp.isBalanced("(<[]>)<abc>"));
    }
}
