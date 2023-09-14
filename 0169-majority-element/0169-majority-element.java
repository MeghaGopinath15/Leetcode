class Solution {
    public int majorityElement(int[] nums)
     {
         int element=nums[0];
         int freq=1;

         for(int i=1;i<nums.length;i++)
         {
             if(freq==0)
             {
                 element =nums[i];
                 freq=1;
             }
             else
             if(nums[i]==element)
             {
                 freq++;
             }
             else
             {
                 freq--;
             }
         }
         return element;
        
    }
}