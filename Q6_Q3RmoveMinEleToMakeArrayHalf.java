import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q6_Q3RmoveMinEleToMakeArrayHalf {
    private static int RemoveElemet(int arr[],int n){
        int max=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List <Integer> freq = new ArrayList<>(map.values());
        Collections.sort(freq,Collections.reverseOrder());
        int rmvCount=0;
        int remaining = n;
        for(int i:freq){
            remaining = remaining-i;
            rmvCount++;
            if(remaining<=n/2){
                break;
            }
        }
        return rmvCount;
    }
    public static void main(String[] args) {
        int arr[]={3,3,3,3,5,5,5,2,2,7};
        System.out.println(RemoveElemet(arr,arr.length));
    }
}
