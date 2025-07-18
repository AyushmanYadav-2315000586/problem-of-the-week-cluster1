import java.util.HashMap;

public class optimal {

    static int subarraySum(int[]nums, int tar){
        int n=nums.length;
        int count=0;
        int prefixSum=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        for(int i=0; i<n; i++){
            prefixSum+=nums[i];
            if(map.containsKey(prefixSum-tar)){
                count+=map.get(prefixSum-tar);
            }
            map.put(prefixSum,map.getOrDefault(map,0)+1);
        }
        return count;
    }
       public static void main(String[] args) {
        int []arr={1,2,3,-3,1,1};
        System.out.println(subarraySum(arr, 3));
    }
}