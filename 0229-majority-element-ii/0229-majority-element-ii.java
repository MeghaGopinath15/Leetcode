class Solution
 {
    public List<Integer> majorityElement(int[] nums)
     {
         List<Integer> result = new ArrayList<>();
        if(nums.length == 0)
        {
            return result;
        }  
        int firstMajor = Integer.MAX_VALUE, secondMajor = Integer.MIN_VALUE,firstsum=0, secondsum=0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] ==firstMajor)
            {
                firstsum++;
            }
            else if(nums[i]==secondMajor)
            {
                secondsum++;
            }
            else if(firstsum==0)
            {
                firstMajor=nums[i];
                firstsum=1;
            }
            else if(secondsum==0)
            {
                secondMajor=nums[i];
                secondsum=1;
            }
            else
            {
                firstsum--;
                secondsum--;
            }
        }
        int count1=0; //3
        int count2=0; 
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==firstMajor)
            {
                count1++;
            }
            else if(nums[i]==secondMajor)
            {
                count2++;
            }
        }
        if(count1>nums.length/3)
        {
            result.add(firstMajor);
        }
         if(count2>nums.length/3)
        {
            result.add(secondMajor);
        }
        return result;
    }

}







// 3 3 4 6 1 3 2 5 3 3 3
                 
/*
firstmajor=3
secondmajor=5
firstsum=4
secondsum=1

*/