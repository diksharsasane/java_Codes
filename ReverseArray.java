public class ReverseArray {
    public static void rev(int arr[]){
        int first=0,last=arr.length-1,temp;
//short method
        while(first<last){
            temp=arr[first];
            arr[first]=arr[last];
            arr[last]=temp;
        
            first++;
            last--;
         }

         //big method

        /*if(no%2==0){
             while(first<last){
                temp=arr[first];
                arr[first]=arr[last];
                arr[last]=temp;
            
                first++;
                last--;
             }
        }
        else{
            while(first<=last){
                temp=arr[first];
                arr[first]=arr[last];
                arr[last]=temp;
            
                first++;
                last--;
             }
        }*/
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int numb[]={2,4,6,8,10,12,14,16,18};
        rev(numb);
    }
}
