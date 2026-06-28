import java.util.*;

public class second {

    static int secondLargest(int[] arr){
        int max=arr[0];
        int n= arr.length;

        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        int max2=arr[0];

        
            for(int i=0;i<n;i++){
                if(arr[i]>max2 && arr[i]<max){
                    max2=arr[i];
               
            }

        }
        return max2;
    }
     public static void main(String[] args){
           int[] arr= {3,8,1,0,9,7,6};
           int maxval= secondLargest(arr);

           System.out.println("second largest element: "+maxval);
     }
}