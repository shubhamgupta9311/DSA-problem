class Solution {
    public int findUnsortedSubarray(int[] nums) {

// if(nums.length==1){
//     return 0;
// }
// int fbk=-1;
// int lbk=-1;
// int min=Integer.MAX_VALUE;
// int max=Integer.MIN_VALUE;
// //first break point
//  for(int i=0;i<nums.length-1;i++){
// if(nums[i]>nums[i+1]){
//    fbk=i;
//    break;
// }
//  }
//  if(fbk==-1){
//     return 0;
//  }



//  //last break point
//   for(int i=nums.length-1;i>0;i--){
// if(nums[i]<nums[i-1] ){
//    lbk=i;
 
//    break;
// }
//  }
//  //finding min and max in current range
//  for(int i=fbk; i<=lbk;i++){
//     min=Math.min(min,nums[i]);
//     max=Math.max(max,nums[i]);
//  } 

//  //left expansion,checking is there any elemnt in left exits that is greater than min if it then include in range
//  while(fbk>0 && nums[fbk-1]>min){
//     fbk--;
//  }
//  //right expansion,checking is there any element in right exits which is smaller then max if it then include in range
//  while(lbk<nums.length-1 && nums[lbk+1]<max){
//     lbk++;
//  }

//   return (lbk-fbk)+1;


//revision code

//finding fbk and lbk
  int fbk=-1;
  int lbk=-1;
  int min=Integer.MAX_VALUE;
  int max=Integer.MIN_VALUE;
for(int i=0;i<nums.length-1;i++){

if(nums[i]>nums[i+1]){
fbk=i;
break;
}

}

if(fbk==-1){
    return 0;
}
for(int i=nums.length-1;i>0;i--){

if(nums[i]<nums[i-1]){
lbk=i;
break;
}

}


//minimum and maximum
for(int i=fbk;i<=lbk ;i++){
min=Math.min(min,nums[i]);
max=Math.max(max,nums[i]);
}

//left side expansion
for(int i=fbk-1;i>=0;i--){
    if(nums[i]>min){
        fbk--;
    }
}
//right side expasion
for(int i=lbk+1;i<=nums.length-1;i++){
    if(nums[i]<max){
        lbk++;
    }
}


return (lbk-fbk)+1;

    }
}