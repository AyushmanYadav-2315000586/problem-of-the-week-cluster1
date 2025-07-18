public class better {
    static int subarraySum(int[]nums, int tar){
        int n=nums.length;
        int count=0;
        for(int i=0; i<n; i++){
            int sum=0;
            for(int j=i; j<n; j++){
                sum+=nums[j];
                if(sum==tar){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int []arr={1,2,3,-3,1,1};
        System.out.println(subarraySum(arr, 3));
    }
}
