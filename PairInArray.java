public class PairInArray {

    public static void pair(int num[]){
        for(int i=0;i<num.length-1;i++){
            for(int j=i+1;j<num.length;j++){
                System.out.println("("+num[i]+","+num[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int numb[]={2,4,6,8,10};
        pair(numb);
    }
}
