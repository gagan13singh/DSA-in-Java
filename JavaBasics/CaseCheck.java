import java.util.Scanner;
public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().trim().charAt(0);
        if(a >='a' && a <='z'){
            System.out.println("lower case");
        }
        else if(a>='A' && a<='Z'){
            System.out.println("upper case");
        }
        else{
            System.out.println("maybe a number or special character");
        }
    }
}
