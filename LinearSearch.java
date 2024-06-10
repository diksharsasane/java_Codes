public class LinearSearch {

    public static int searchint(int numb[],int key){
        for(int i=0;i<numb.length;i++){
            if(numb[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numb[]={2,4,6,8,10,12,14,16};
        int key=10;
        int ans=searchint(numb, key)+1;
        if(ans!=-1){
            System.out.println("element found at location: " +ans);
        }
        else{
            System.out.println("element not present..");
        }

    }
}
