//2323
//2+3=5
//3*2=6
package basicjavaquestions;

import java.util.Scanner;

public class SumOfFirstAndLastDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=sc.nextInt();
        String number1=Integer.toString(number);
        int len=number1.length();
        int product=1;
        for(int i=1;i<len-1;i++){
            product*=number1.charAt(i)-'0';
            
        }
        int a=(int)number1.charAt(len-1)-'0';
        int b=(int)number1.charAt(0)-'0';
        int sum=a+b;
        
        System.out.println(sum);
        System.out.println(product);

        
    }
}
