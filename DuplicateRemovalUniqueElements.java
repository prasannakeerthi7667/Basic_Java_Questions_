package basicjavaquestions;
import java.util.Scanner;

public class DuplicateRemovalUniqueElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("please enter "+i+" value");
            arr[i]=sc.nextInt();
        }
        int[] arr2 = new int[size];
        int index =0;
        for(int i =0; i<size; i++) {
            boolean isDuplicate = false;
            for(int j=0;j<size;j++){
                if(arr[i]==arr2[j]){
                    isDuplicate =true;
                    break;
                }
            }

            if(isDuplicate == false) {
                arr2[index]=arr[i];
                index++;
            }
            
        }
        for(int value:arr2){
            System.out.println(value);
        }
        



    }
    

    
}
