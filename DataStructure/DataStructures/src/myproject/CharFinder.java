package myproject;

import java.util.HashMap;

public class CharFinder {
    public char NonRepeatingChar(String str){
        HashMap<Character,Integer> map = new HashMap<>();

        var chars = str.toCharArray();
        for (char ch : chars){
            int count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch,count + 1);
        }

        for (char ch : chars){
            if (map.get(ch) == 1){
                return ch;
            }
        }
        return Character.MIN_VALUE;
    }
}


class MainCharFinder{
    public static void main(String[] args){
        CharFinder finder = new CharFinder();
        char ch = finder.NonRepeatingChar("a green apple");
        System.out.println(ch);
    }
}