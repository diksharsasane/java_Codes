import java.util.HashSet;

public class subStringWithoutduplicate {
    public static void subStringDuplicate(String str,int idx,String newStr,HashSet<String> set){
        if(idx==str.length()){
            if(set.contains(newStr)){
                return;
            }
            else{
            System.out.println(newStr);
            set.add(newStr);
            return;
            }
        }
 
        char curchar=str.charAt(idx);
        //to be 
        subStringDuplicate(str, idx+1, newStr+curchar, set);
        //not to be
        subStringDuplicate(str, idx+1, newStr, set);
    }
    public static void main(String[] args) {
        String str="aaaa";
        HashSet<String> set=new HashSet<>();
        subStringDuplicate(str, 0, "",set);
        
    }
}
//campus connect 2.0
//infetq  
//internship-project-