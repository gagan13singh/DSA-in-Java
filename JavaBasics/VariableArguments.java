package JavaBasics;

import java.util.Arrays;

public class VariableArguments{
    public static void main(String[] args) {
        fun(1,2,3,4,5,6,7,78);

        //fun();//error-ambiguity due to function overloading
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
