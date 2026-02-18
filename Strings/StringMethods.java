package Strings;
import java.util.Arrays;
public class StringMethods {
    public static void main(String[] args) {
        String s="abcdefg";
        System.out.println(s.charAt(0));
        System.out.println(s.toUpperCase()); //creates new obj.
        System.out.println(s.toLowerCase());
        System.out.println(Arrays.toString(s.toCharArray()));
        System.out.println(s.length());

    }
}
