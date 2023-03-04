public class printStringInReverse {
    
    /*public static void strRev(String str,int len){
        if(len==-1){
            return;
        }

        //int l=str.length()-1;
        System.out.println(str.charAt(len));
        strRev(str, len-1);
    }*/

    public static void reverse(String str,int idx,String nStr){
        if(idx==-1){
            System.out.println(nStr);
            return;
        }

        char curchar=str.charAt(idx);
        reverse(str, idx-1, nStr+curchar);
    }
    public static void main(String[] args) {
       /* String str ="abcd";
        strRev(str, str.length()-1);
        */
        String str="abcd";
        reverse(str, str.length()-1, "");
        
    }
}
