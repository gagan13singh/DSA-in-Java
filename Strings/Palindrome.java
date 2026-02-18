package Strings;

public class Palindrome {
    public static void main(String[] args) {
        String s = "racecar";
        System.out.println(isPalindrome(s));
    }
    static boolean isPalindrome(String s){
        s=s.toLowerCase();
        for(int i=0;i<s.length()/2;i++){
            char start=s.charAt(i);
            char end=s.charAt(s.length()-i-1);
            if(start!=end){
                return false;
            }
        }
        return true;
    }
}
