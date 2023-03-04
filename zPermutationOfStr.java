public class zPermutationOfStr {
     public static void permut(String str,String Permutaion){
        if(str.length()==0){
            System.out.println(Permutaion);
            return;
        }

        for(int i=0;i<str.length();i++){
            char curchar=str.charAt(i);
            String newstr=str.substring(0, i)+str.substring(i+1);
            permut(newstr, Permutaion+curchar);
        }
     }
    public static void main(String[] args) {
       String str="cba";
       permut(str, ""); 
    }
}
