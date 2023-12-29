import java.util.*;
public class practice {
   public static void main(String args[]) {

    
      int a[] = new int [100];  
      int size;
       
         Scanner in = new Scanner(System.in);

            System.out.println("Enter size < 100");
            size = in.nextInt();


            for(int i = 0;i<size;i++) {
                System.out.println("Enter "+(i+1) + "th number");
                a[i] = in.nextInt();

            
        
                 System.out.println("length = " + a.length);
                System.out.println(a[i]); 
            } 
   }
}
