public class SpiralMatx {
    public static void Spirl(int Matrix[][]){
        int leftcol=0;
        int rightcol=Matrix.length-1;
        int uprow=0;
        int downrow=Matrix[0].length-1;

        while(rightcol>=leftcol && uprow<=downrow){
            for(int i=leftcol;i<=rightcol;i++){
                System.out.print(Matrix[uprow][i]+" ");
            }
            for(int j=uprow+1;j<=downrow;j++){
                System.out.print(Matrix[j][rightcol]+" ");
            }
            for(int i=rightcol-1;i>=leftcol;i--){
                System.out.print(Matrix[downrow][i]+" ");
            }
            for(int j=downrow-1;j>=uprow+1;j--){
                System.out.print(Matrix[j][leftcol]+" ");
            }
            leftcol++;
            rightcol--;
            uprow++;
            downrow--;
        }
       
        }
        public static void main(String[] args) {
            int Matx[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
            Spirl(Matx);
    }
    
}
