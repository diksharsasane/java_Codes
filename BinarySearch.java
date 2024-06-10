public class BinarySearch {

    public static int BSearch(int num[],int key){
        int start=0,last=num.length-1;
        while(start<=last){
            int mid=(start+last)/2;
            if(num[mid]==key){
                return mid;
            }
            else if(num[mid]>key){
                last=mid-1; 
                
            }
            else{
                start=mid+1;   
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int numb[]={2,4,6,8,10,12,14,16};
        int key=10;
         int ans=BSearch(numb, key)+1;
        if(ans!=-1){
            System.out.println("element found at location: " +ans);
        }
        else{
            System.out.println("element not present..");
        }

    }
    
}
