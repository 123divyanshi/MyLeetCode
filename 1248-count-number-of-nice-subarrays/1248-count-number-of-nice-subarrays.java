class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int startIndex=0,count=0;
        int endIndex=0,result=0,tempcount=0;
        
       while(endIndex<nums.length){
           if(nums[endIndex]%2!=0){
               count++;
               tempcount=0;
               
           }
           while(count==k){
               tempcount++;
               if(nums[startIndex]%2!=0){
                   count--;
               }
               startIndex++;
               
           }
           result+=tempcount;
           endIndex++;
           
       }
        
        return result;
        
        
    }
}