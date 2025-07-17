public class bruteForce {
        static int findMin(int[]nums){
        int smallest=Integer.MAX_VALUE;
        int n=nums.length;
        for(int i=0; i<n; i++){
            if(nums[i]<smallest){
                smallest=nums[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int []arr={4,5,6,7,1,2};
        System.out.println(findMin(arr));
    }
}
