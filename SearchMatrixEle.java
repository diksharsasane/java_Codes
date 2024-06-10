public class SearchMatrixEle {
    public static boolean Sterarcase(int matrix[][],int key ) {
        /*   int  row=0,col=matrix.length-1;
          while(row<=matrix.length-1 && col>=0){
           if(matrix[row][col]==key) {
               System.out.println("element found at location: ("+row  +","+col+")");
               return true;
           }
           else{
               if(matrix[row][col]>key){
                   col--;
               }
               else{
                   row++;
               }
           }
          } */
   
          int row=matrix.length-1,col=0;
          while(row>=0&& col<=matrix.length-1){
           if(matrix[row][col]==key){
               System.out.println("element found at location: ("+row+ ","+col+")");
               return true;   
           }
           else{
               if(matrix[row][col] >=key){
                   row--;
               }
               else{
                   col++;  
               }
           }
          }
   
          return false;
      }
      public static void main(String[] args) {
       int Matx[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
       //searchMatx(Matx, 13);
       boolean a=Sterarcase(Matx, 8);
       System.out.println(a);
      } 
    
}
