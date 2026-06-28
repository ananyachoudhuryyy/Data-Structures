import java.util.*;

public class binary {
  
    static int binarySearch(int[] arr, int key){
        int low=0;
        int high= arr.length -1 ;
        

        while(low <=high){
            int mid= (low+high)/2;
       
          if(key==arr[mid]){
            return mid;
          } 
          else if(key < arr[mid]){
            high= mid-1;

          }
          else {
            low = mid+1;
          }

    }
    return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int[] arr= new int[1000];
        System.out.println("Enter number of elements: ");
        int n= sc.nextInt();

        System.out.println("Enter elements of array in sorted order.\n");
        for(int i=0;i<n;i++){
    System.out.println("Enter array element: ");
    arr[i]= sc.nextInt();
}

System.out.println("Enter key element: ");
int key= sc.nextInt();
int bin = binarySearch(arr, key);

if (bin==-1){
    System.out.println("Element not found.");
}
else {
    System.out.println(key +" found at "+ bin);
}


sc.close();
    }
    
}
