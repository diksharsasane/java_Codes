public class moveAllXatEnd {
    public static void moveAllX(String str,int idx,int count,String newstr){
        if(idx==str.length()){
            for(int i=0;i<count;i++){
                newstr=newstr+'x';
            }
            System.out.println(newstr);
            return;
        }

        char curchar=str.charAt(idx);
        if(curchar=='x'){
            count++;
            moveAllX(str, idx+1, count, newstr);
        }
        else{
            newstr+=curchar;
            moveAllX(str, idx+1, count, newstr);
        }
    }
    public static void main(String[] args) {
         String str="xyxzytm";
         moveAllX(str, 0, 0, "");

    }
}
