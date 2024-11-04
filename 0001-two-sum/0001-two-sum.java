class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=target-nums[i];
            if(map.containsKey(sum)){
               
                // If found, return the indices of the two numbers
                return new int[] { map.get(sum), i };
            }
            
            else{
                map.put(nums[i],i);
            }
        }
        return new int[]{};

        // int arr[] = new int[2];
        // for (int i = 0; i < nums.length; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         if (nums[i] + nums[j] == target)
        //             return new int[] { i, j };
        //     }
        // }
        // return new int[] {};
    }
}