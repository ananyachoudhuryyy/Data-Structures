import java.util.*;

public class linear {

   static int LinearSearch(int[] arr, int key){

        for(int i : arr){
            if(key ==i){
                return key;
            }
        }
        return 0;
    }
public static void main(String[] args) {

    int[] arr = new int[1000];

Scanner sc = new Scanner(System.in);
System.out.println("Enter number of elements: ");
int n = sc.nextInt();

for(int i=0;i<n;i++){
    System.out.println("Enter array element: ");
    arr[i]= sc.nextInt();
}
    
System.out.println("Enter key element: ");
int key = sc.nextInt();

int ans= LinearSearch(arr, key);

if(ans==key){
    System.out.println("Element found.");
}
else{
    System.out.println("Element not found.");
}

sc.close();
}

}