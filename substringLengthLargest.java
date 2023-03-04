public class substringLengthLargest {
    public static void largestString(String str,int idx,String newStr){
        if(idx==str.length()){
            if(newStr.length()>=str.length()){
                return;
            }
            System.out.println(newStr);
            return;
        }

        char curchar=str.charAt(idx);

        //to be
        largestString(str, idx+1, newStr+curchar);
        //not to be
        largestString(str, idx+1, newStr);
    }
    public static void main(String[] args) {
        String str="abc";
        largestString(str, 0, "");
    }
}
