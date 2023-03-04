public class occurancesOfString {
    public static int first=-1;
    public static int last=-1;
    public static void strOccreanc(String str,int idx,char element){

        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }

        char currentchar=str.charAt(idx);
        if(currentchar==element)
        {
            if(first==-1){
                first=idx;
                last=idx;//if one element is there that time...
            }
            else{
                last=idx;
            }
        }

        strOccreanc( str,idx+1, element);
    }
    public static void main(String[] args) {
        
        String str="asdfgh";
        strOccreanc(str, 0, 'a');
    }
}
