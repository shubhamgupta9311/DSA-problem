class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
// int[] arr=new int[2];
        List<int[]>result=new ArrayList<>();
//         //edge case
//         if(firstList.length==0 || secondlist.length==0){
// return new int[];
//         }

        int pt1=0;
        int pt2=0;

        while(pt1<firstList.length && pt2<secondList.length){
int[] arr=new int[2];
   //intersection condition
   if(firstList[pt1][1]>=secondList[pt2][0] && firstList[pt1][0]<=secondList[pt2][1]){
arr[0]=Math.max( firstList[pt1][0],secondList[pt2][0]);
arr[1]=Math.min(firstList[pt1][1],secondList[pt2][1]);

result.add(arr);
if(firstList[pt1][1]<secondList[pt2][1]){
    pt1++;
}
else{
    pt2++;
}
   }

   else{
if (firstList[pt1][1] < secondList[pt2][1]) {
    pt1++;
} else {
    pt2++;
}

}
   
        }

return result.toArray(new int[result.size()][]);
    }
}