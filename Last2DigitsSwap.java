package basicjavaquestions;
import java.util.Scanner;

public class Last2DigitsSwap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int num1=num%100;
        int Remval=num/100;
        String num2=Integer.toString(num1);
        int len=num2.length();
        
        char a=num2.charAt(0);
        char b=num2.charAt(1);
        int c=a-'0';
        int d=b-'0';
        d=d+c;//2+3
        c=d-c;//2-3
        d=d-c;
        String num3=Integer.toString(c)+Integer.toString((d));
        String num4=Integer.toString(Remval);

        System.out.println(num4+num3);
        
    }
    
}
