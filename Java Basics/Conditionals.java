import java.util.Scanner;
public class Conditionals {
    public static void main(String[] args) {
        int i;
        System.out.println("what's your age ?");
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        if (i>18){
            System.out.println("you can vote");
        }
        else{
            System.out.println("you can't vote");
        }
    }
}
