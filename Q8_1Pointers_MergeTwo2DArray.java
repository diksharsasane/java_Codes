import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Q8_1Pointers_MergeTwo2DArray {
    private static int[][] mergeTwoArray(int[][] nums1,int[][]nums2){
        int[][] result ;
        Map<Integer,Integer> map = new TreeMap<>();
        for(int[] arr:nums1){
            map.put(arr[0],map.getOrDefault(arr[0], 0)+arr[1]);
        }
        for(int[] arr:nums2){
            map.put(arr[0],map.getOrDefault(arr[0], 0)+arr[1]);
        }
        result = new int[map.size()][2];
        int val=0;
        for(Entry<Integer,Integer> entity: map.entrySet()){
            result[val][0]=entity.getKey();
            result[val][1]=entity.getValue();
            val++;
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] nums1= {{1,2},{2,3},{4,5}};
        int[][] nums2= {{1,4},{3,2},{4,1}};
        int arr[][] =mergeTwoArray(nums1, nums2);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<2;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}