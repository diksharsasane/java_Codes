public class LinnearSearchStr {

    public static int SearchStr(String[] menu,String order){
        for(int i=0;i<menu.length;i++){
            if(menu[i]==order){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String Menu[]={"vada pav","samosa","dabeli","panipuri","idali","utappa"};
        String order="dabeli";
        int i= SearchStr(Menu,order)+1;

        if(i!=-1){
            System.out.println("Menu found at location: " +i);
        }
        else{
            System.out.println("Menu not present..");
        }

    }
}
