package basicjavaquestions;
import java.util.Scanner;

public class PermutationsAndCombinations {
    

        static int factorial(int n){
            int fact=1;
            for(int i=1;i<n;i++){
                fact*=i;
            }
            return fact;


        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter n value");
            int n=sc.nextInt();
            System.out.println("Enter r value");
            int r=sc.nextInt();

            int npr=factorial(n)/factorial(n-r);
            int ncr=factorial(n)/(factorial(n)*factorial(n-r));

            System.out.println(npr);
            System.out.println(ncr);
    
}
}
