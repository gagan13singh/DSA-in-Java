package oops;

public class StaticBlock {
    static int a =19;
    static int b;

    static{
        System.out.println("Inside static block");
        b=a*5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
        StaticBlock obj2 = new StaticBlock();

        StaticBlock.a+=2;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

    }
}
//StaticBlock only run once, when the first object is created i.e. class is loaded.
