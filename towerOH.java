public class towerOH {

    public static void towerOfHanoi(int n,String source,String helper,String destination){
        if(n==0){
            System.out.println("No operation");
            return;
        }
        if(n==1)
        {
            System.out.println("transefer disk "+n+" from "+source+" to "+destination);
            return;
        }

        towerOfHanoi(n-1, source, destination,helper);
        System.out.println("transefer disk "+n+" from "+source+" to "+destination);
        towerOfHanoi(n-1, helper, source, destination);
    }
    
    public static void main(String[] args) {
        int n=3;
        String sor="S",hel="H",des="D";
        towerOfHanoi(n, sor, hel, des);
    }
}

//complexity==2^n
//T(n)=2^T(n-1)+1------->last== 2^(n-1)*T(1)+2^(n-2)+2^(n-3)+.......======>>