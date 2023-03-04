public class zCountTotalPath {
    public static int tile(int n,int m){

        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
//horizontal
       int ver= tile(n-m, m);
//verticle
      int hor=  tile(n-1, m);

        return ver+hor; 
    }
    public static void main(String[] args) {
        System.out.println(tile(4, 2));
    }
}
