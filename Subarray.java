public class Subarray {
    public static void printSubarry(int num[]) {
        int iter=0;                         //no of entity
        for(int i=0;i<num.length;i++){       //it start from
            int start=i;
            for(int j=i;j<num.length;j++){   //upto end locaton ti goes
                int end=j;
                for(int k=start;k<end;k++){
                    System.out.print("["+num[k]+"]");   //print subarrays
                    iter++;
                }
                System.out.println();
            }
        }
        System.out.println("no of sub arrays: "+iter);
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60};
        printSubarry(arr);
    }
}
