public class optimized {
    static int findMin(int[]arr){
        int low=0;
        int high=arr.length-1;
        int ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[low]<=arr[mid]){
                ans=Math.min(ans, arr[low]);
                low=mid+1;
            }
            else{
                ans=Math.min(ans,arr[mid]);
                high=mid-1;
            }
        }
        return ans;
    }
        public static void main(String[] args) {
        int []arr={4,5,6,7,1,2};
        System.out.println(findMin(arr));
    }
}
