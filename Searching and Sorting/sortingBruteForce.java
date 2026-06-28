import java.util.Scanner;

public class sortingBruteForce {
    
  static void bubbleSort(int[] arr){
    int n= arr.length;

    for(int i=0;i<n;i++){
        for(int j =0;j<n-1-i;j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }

  }

  static void selectionSort(int[] arr){
    int n=arr.length;

    for(int i=0;i<n-1;i++){
        int minIdx=i;

        for(int j=i+1;j<n;j++){
            if(arr[j]< arr[minIdx]) {
                minIdx=j;
            }
        }
        int temp= arr[i];
        arr[i]=arr[minIdx];
        arr[minIdx]=temp;
    }
  }

  static void insertionSort(int[] arr){
    int n = arr.length;

    for(int i=1;i<n;i++){

        int current = arr[i];
        int j = i-1;

        while(j>=0 && arr[j] > current){

            arr[j+1] = arr[j];
            j--;
        }

        arr[j+1] = current;
    }
  }

public static void main(String[] args) {

    
Scanner sc = new Scanner(System.in);
int arr[]=new int[1000];
System.out.println("Enter number of elememts: ");

int n = sc.nextInt();

for(int i=0;i<n;i++){
    System.out.println("Enter array element: ");
    arr[i]= sc.nextInt();
}
    
sc.close();
}


}
