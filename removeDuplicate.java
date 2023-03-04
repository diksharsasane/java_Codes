public class removeDuplicate {
    public static boolean map[]=new boolean[25];     //initially all false

    public static void remDuplicate(String str,int idx,String newStr){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }


        char crrchar=str.charAt(idx);
        if(map[crrchar-'a']==true){
            remDuplicate(str, idx+1, newStr);
        }
        else{
            map[crrchar-'a']=true;
            remDuplicate(str, idx+1, newStr+crrchar);
        }
    }

    public static void main(String[] args) {
        String str="abcabdeadb";
        remDuplicate(str, 0, "");
    }
}
