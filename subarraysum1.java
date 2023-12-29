
//import java.util.*;
//print subarrays
public class subarraysum1{
    public static void subarraysum(int numbers[]) {
         int maxsum=Integer.MIN_VALUE;
 
        for(int i=0;i<numbers.length;i++) {
            int start = i;
            for(int j=i;j<numbers.lengtha;j++)
            {
                int end = j;
                int currsum=0;
                for( int k= start;k<=end;k++)
                {
                   currsum += numbers[k];

                }
                
                System.out.println(currsum);
                if(maxsum < currsum) {
                    maxsum = currsum;
                }


            }
            
           
        }
        System.out.println("maxsum=" + maxsum);

    }
    public static void main(String args[]){
        int numbers[]={1,-2,6,-1,3};
        subarraysum(numbers);
    }
}
    