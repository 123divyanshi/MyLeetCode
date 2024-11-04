class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg=0.0;
        int index=0;
        int sum=0;
        double maxavg;
        while(index<nums.length && index <k){
            sum+=nums[index];
            index++;
        }
        avg=(double)sum/k;
        maxavg=avg;
        for(int i=1;i<nums.length-k+1;i++){
            sum=sum-nums[i-1]+nums[i+k-1];
            avg=(double)sum/k;
            maxavg=Math.max(avg,maxavg);
        }
        
        return maxavg;
    }
}