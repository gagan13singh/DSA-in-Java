import java.util.Scanner;

public class ChangeName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        String updname=changeName(name);
        System.out.println("Hello "+ updname);

    }
    static String changeName(String name){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name to be updated");
        String newName = sc.nextLine();
        return newName;


    }
}
