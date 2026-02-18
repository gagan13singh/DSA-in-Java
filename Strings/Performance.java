package Strings;

public class Performance {
    public static void main(String[] args) {
        String series="";
        for(int i=0;i<=25;i++){           //not very good solutions as every time a new object is being created
            char ch= (char)('a'+i);       // lot of memory is being wasted.
//            System.out.println(ch);     //use stringBuilder
            series=series+ch;
            System.out.println(series);
        }
    }
}
