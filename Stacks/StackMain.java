package Stacks;

public class StackMain {
    public static void main(String[] args) throws StackException{
        //CustomStack stack = new CustomStack(5);
        DynamicStack stack = new DynamicStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push(6);
        //System.out.println(stack);


    }
}
