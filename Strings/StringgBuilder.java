package Strings;

public class StringgBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i <= 25; i++) {           //not very good solutions as every time a new object is being created
            char ch = (char) ('a' + i);
            builder.append(ch);

            System.out.println(builder);
            System.out.println(builder.toString());
        }
    }
}
