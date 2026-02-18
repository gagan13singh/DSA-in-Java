package Strings;

import java.util.ArrayList;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a=453.45345f;
//      System.out.printf("Formatted number is %.2f" , a);
//      System.out.printf("%.3f", Math.PI);
//        System.out.printf("hello, my name is %s","gagan");
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println((char)('a'+3));
        System.out.println("a"+1); //integer will be converted to Integer that will call toString.
        System.out.println("GAGAN"+ new ArrayList<>());

    }
}
// for more placeholders open placeholder_list.txt
//+ operator shows operator overloading.
//+ operator only works for primitives and if any of the one arguments is a string.