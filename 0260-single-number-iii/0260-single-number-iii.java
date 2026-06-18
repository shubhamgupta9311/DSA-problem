class Solution {
    public int[] singleNumber(int[] nums) {
        
        // int arr[]=new arr[2];
        int bitmask=0;
        for(int num:nums){
            bitmask^=num;
        }
        int mask=1;
        for(int i=0;i<32;i++){
              if((bitmask&1)==1){
              mask=mask<<i;
              break;
             }
           bitmask= bitmask>>1;
        }

int a=0;
int b=0;
for(int num:nums){
    if((num&mask)==0){
        a^=num;
    }
    else{
        b^=num;
    }
}
        return new int[]{a,b};

      
        
        
       


       
    }
}