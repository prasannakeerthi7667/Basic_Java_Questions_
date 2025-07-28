package basicjavaquestions;


public class AgeOf100Persons {
    public static void main(String[] args) {
        int count=0;
        for(int i=1;i<=100;i++){
            int a=(int)(Math.random()*100)+1;
            if(a>50 && a<60){
                count++;

            }
        }
        System.out.println(count);
    }
    
}
