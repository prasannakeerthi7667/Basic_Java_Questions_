package basicjavaquestions;

import java.util.Scanner;

public class InterChangeOfANumber {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=sc.nextInt();
        String num1=Integer.toString(number);
        int len=num1.length();
        int a=num1.charAt(0)-'0';
        int b=num1.charAt(len-1)-'0';
        b=a+b;
        a=b-a;
        b=b-a;
        String c=Integer.toString(a);
        String d=Integer.toString(b);
        String middle=num1.substring(1, len-1);
        System.out.println(a+middle+b);
    }
}
