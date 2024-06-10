public class TrapRainWater {
    public static int TRwater(int[] height) {
        int n=height.length;
        //leftMax array
        int leftMax[]=new int[n];
         leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(leftMax[i-1],height[i]);
        }

        //rightMax array
        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1], height[i]);
        }

        //loop to find min of both (max water storage)
        int water=0;

        for(int i=0;i<n;i++){
            int maxWater=Math.min(leftMax[i],rightMax[i]);

            water=water+(maxWater-height[i]);
        }
        return water;

    }
    public static void main(String[] args) {
        int height[]={12,32,45,9,8,45,3};
        System.out.println(TRwater(height)); 
    }

   
}
