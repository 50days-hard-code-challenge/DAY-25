class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left=1;
        int right=0;
        for(int i:nums)
        {
            right=Math.max(i,right);
        }
        //traverse from 1 to max number in nums[] array
        while(left<right)
        {
            int mid=(left+right)/2;
            int sum=0;
            for(int i:nums)
            {
                sum+=(i+mid-1)/mid;
                //Math.ceil((double)i/mid);
            }
            if(sum>threshold)
            {
                left=mid+1;
            }
            else
            {
                right=mid;
            }
        }
        return left;
        
    }
}
