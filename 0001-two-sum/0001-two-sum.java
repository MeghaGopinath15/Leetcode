class Solution
 {
    public int[] twoSum(int[] nums, int target)
     {
         int[] res=new int[2];
         HashMap<Integer,Integer> map=new HashMap<>();
         for(int i=0;i<nums.length;i++)
         {
             int num1=nums[i];
             int need=target-num1;
             
             int j=0;
             if(map.containsKey(need)==true)
             {
                 res[0]=map.get(need);
                 res[1]=i;
             }
             else
             {
                 map.put(num1,i);
             }
         }
        return res;
    }
}