public class print5to1 {
    
    public static void showNo(int n,int i)
    {
        if(n==i){
            return;
        }

        System.out.println(n);   //--->5,4,3,2,1
        showNo(n-1, i);
        //System.out.println(n);  --->1,2,3,4,5
    }
    public static void main(String[] args) {
       int n=5;
       int i=0;
        showNo(n, i);
    }
}
