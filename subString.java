public class subString {
    public static void substr(String str,int idx,String newStr){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }

        char crrchar=str.charAt(idx);
        //to be select
        substr(str, idx+1, newStr+crrchar);

        //not to be selected
        substr(str, idx+1, newStr);
    }
    public static void main(String[] args) {
        String str="abc";
        substr(str, 0, "");
    }
}
