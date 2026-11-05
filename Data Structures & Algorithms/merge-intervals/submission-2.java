class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)-> Integer.compare(a[0],b[0]));
        List<int[]> result = new ArrayList<>();
        result.add(intervals[0]);
        for(int i=1;i<intervals.length; i++){
            int lastE = result.get(result.size()-1)[1];
            if(lastE >= intervals[i][0]){
                 result.get(result.size() - 1)[1] = Math.max(lastE, intervals[i][1]);
            }
            else{
                result.add(new int[]{intervals[i][0], intervals[i][1]});
            }
        }
        return result.toArray(new int[result.size()][]);

    }
}
