class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));
        List<int[]> res = new ArrayList<>();
        res.add(intervals[0]);
        for(int i =1; i < intervals.length; i++){
            int[] l = res.get(res.size()-1);
            if(l[1] >= intervals[i][0]){
                l[0] = Math.min(l[0], intervals[i][0]);
                l[1] = Math.max(l[1], intervals[i][1]);
                res.remove(res.size()-1);
                res.add(l);
            }
            else
              res.add(intervals[i]);
        }
        return res.toArray(new int[res.size()][]);

    }
}
