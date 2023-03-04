public class mobileKeybad {
    public static String keypad[]={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void key(String str,int idx,String combination){

        if(idx==str.length()){
                System.out.println(combination);
                return;
        }

        char curchar=str.charAt(idx);
        String Mapping=keypad[curchar-'0'];
        for(int i=0;i<Mapping.length();i++){
            key(str, idx+1, combination+Mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        String str="235";
        key(str, 0, "");
        
    }
}
