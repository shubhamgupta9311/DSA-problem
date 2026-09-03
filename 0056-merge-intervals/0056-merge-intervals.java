class Solution {
    public int[][] merge(int[][] intervals) {
    //1.sort by start
    Arrays.sort(intervals,(a,b)->(a[0]-b[0]));
    //2. creating a list
    List<int[]> result=new ArrayList<>();
//3.current element
int [] current=intervals[0];

//4.logic
for(int i=1;i<intervals.length;i++){
    int next[]=intervals[i];

    if(current[1]>=next[0]){
        //merge
        current[1]=Math.max(current[1],next[1]);

    }
    else{
        result.add(current);
        current=next;
    }
}

result.add(current);

return result.toArray(new int[result.size()][]);


    }
}