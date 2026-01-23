import java.util.Scanner;

public class StringFunc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        String message= greet(name);
        System.out.println(message);
    }
    static String greet(String name){
        return ("Hello "+name);
    }
}
