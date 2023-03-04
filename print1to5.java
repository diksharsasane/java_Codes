class print1to5{
    public static void printNo(int n,int i){

        if(n==i)
        {
            return;
        }
        System.out.println(n);
        printNo(n+1,i);
    }

    public static void main(String[] args) {
        int n=1;
        int i=6;
        printNo(n,i);
    }
}