package basicjavaquestions;
import java.util.Scanner;
public class SumVowelsEtc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String Word=sc.nextLine();//worse 123
        int len=Word.length();
        int countVow=0;
        int countCon=0;
        int countnum=0;
        int countspace=0;
        for(int i=0;i<len;i++){
            char ch=Word.charAt(i);
            if(ch =='a' ||ch =='e' || ch =='i' || ch =='o' ||ch =='u'||ch =='A' ||ch =='E' || ch =='O' || ch =='I' ||ch =='U'){
               countVow++;
            }
            else if(ch=='1'||ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9'){
               countnum++;
            }
            else if(ch==' '){
                countspace++;

            }
            else{
                countCon++;
            }
        }
        
        
System.out.println(countVow);
System.out.println(countCon);
System.out.println(countnum);
System.out.println(countspace);
        
    }
    
}
