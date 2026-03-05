package MathsForDSA;

public class Factors {
    public static void main(String[] args) {
        int n =36;
        factors2(n);
    }
    static void factors(int n){         //Time complexity: O(n)
        for(int i=1;i<=n;i++){
          if(n%i==0){
              System.out.print(i+" ");
          }
        }
    }
    static void factors2(int n){         //Time complexity: O(n^0.5  )
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.println(i+ " " + n/i);
            }
        }
    }
}

