package basicjavaquestions;
import java.util.Scanner;
import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String Word=sc.nextLine();
        String Word1=sc.nextLine();
        String a=Word.toLowerCase();
        String b=Word1.toLowerCase();
        char[] arr1=a.toCharArray();
        char[] arr2=b.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
        
    }
    
}
