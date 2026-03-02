package MathsForDSA;

public class findUnique {
    public static void main(String[] args) {
        int[] arr={2,2,6,3,4,4,3};
        System.out.println(ans(arr));
    }
    static int ans(int[] arr){
        int unique=0;
        for(int i=0;i<arr.length;i++){
            unique ^= arr[i];
        }
        return unique;
    }
}
