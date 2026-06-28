public class setoperations {

    static void vectorops(int[] a, int[] b){
          int na= a.length;
          int nb= b.length;

         if(na==nb){
            int[] c = new int[na];
            for(int i=0;i<na;i++){
               c[i]+=(a[i]+b[i]);
            }
            System.out.println("Vector Addition:\n ");
            for(int i=0;i<na;i++){
                System.out.println(c[i]+" ");
            }
            System.out.println("Vector Subtraction \n");
            int[] d= new int[na];
             for(int i=0;i<na;i++){
               d[i]+=(a[i]-b[i]);
            }
            
            for(int i=0;i<na;i++){
                System.out.println(d[i]+" ");
            }
       System.out.println("Vector Product: \n");
       int e[]= new int[na];
  int sum=0;
       for(int i=0;i<na;i++){
        sum+= a[i]*b[i];
       }

       System.out.println(sum);
         }
    }
    public static void main(String[] args) {
     int[] arr= {1,2,3,4};
     int[] arr2= {9,8,7,6};
     
     vectorops(arr2, arr);
    }
}
