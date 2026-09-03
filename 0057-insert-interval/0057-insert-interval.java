class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

List<int[]> result =new ArrayList<>();

for(int i=0;i<intervals.length;i++){

//current interval is completely before new
if(intervals[i][1]<newInterval[0]){
    result.add(intervals[i]);
}
//current interval is completely after new
else if(intervals[i][0]>newInterval[1]){
    result.add(newInterval);
    newInterval=intervals[i];
}
//overlapping
else{
newInterval[0]=Math.min(intervals[i][0],newInterval[0]);
newInterval[1]=Math.max(intervals[i][1],newInterval[1]);
}

}

result.add(newInterval);
 return result.toArray(new int[result.size()][]);

  
    }
}