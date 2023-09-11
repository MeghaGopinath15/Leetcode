class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<>();

        if(intervals == null || intervals.length==0)
        {
            return res.toArray(new int [][] {});
        }

       Arrays.sort(intervals,(a,b) -> {
            return a[0]-b[0];
            }); 

        

        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int i=1;i<intervals.length;i++)
        {
            if(intervals[i][1] < end)
            {
                continue;
            }

            if(intervals[i][0] > end)
            {
                res.add(new int[]{start,end});

                start = intervals[i][0];
            }
            end = intervals[i][1];
        }
        res.add(new int[] { start,end});
        return res.toArray(new int[][] {});
    }
}