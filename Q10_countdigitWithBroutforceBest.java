public class Q10_countdigitWithBroutforceBest {

    private static int broutForce(int n){
        int count =0;
        while(n>0){
            count++;
            n=n/10;
        }
        return count;
    }

    private static int optimise(int n){
        return (int) (Math.log10(n)+1);
    }

    public static void main(String[] args) {
        System.out.println(broutForce(123454321));  //O(n)
        System.out.println(optimise(12345671));  //O(1)
    }
}
