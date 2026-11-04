class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] temp = new int[intervals.length+1][2];
        int i=0;
        int k=0;
        while(i<intervals.length && intervals[i][0] < newInterval[0]){
            temp[k++] = intervals[i++];
        }
        temp[k++] = newInterval;
        while(i<intervals.length){
            temp[k++] = intervals[i++];
        }
        List<int[]> res = new ArrayList<>();
        res.add(temp[0]);
        i=1;
        while(i<temp.length){
          int[]last = res.get(res.size()-1);
          if(last[1] >= temp[i][0]){
            last[1] = Math.max(last[1],temp[i][1]);
            res.remove(res.size()-1);
            res.add(last);
          }
          else 
            res.add(temp[i]);
          i++;  
        } 
        return res.toArray(new int[res.size()][]);
    }
}
