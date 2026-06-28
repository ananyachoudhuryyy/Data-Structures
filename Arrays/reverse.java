public class reverse {


    static void reverseArray(int[] arr){
        int low=0;
        int n = arr.length;
        int high= n-1;

        while(low < high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;

            low++;
            high--;
        }
    }

    static void leftrotateArray(int[] arr){
        int first= arr[0];

        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=first;
    }

    static void rightRotateArray(int[] arr){
        int last= arr[arr.length-1];
        for(int i=0;i<arr.length-1;i++){
            arr[i+1]=arr[i];
        }
        arr[0]=last;
    }

    public static void main(String[] args) {
     int[] arr= {1,2,3,4,5};
     reverseArray(arr);

     for(int i : arr){
        System.out.println(i);
     }

     leftrotateArray(arr);
     for(int i : arr){
        System.out.println(i);
     }

 }   
}
