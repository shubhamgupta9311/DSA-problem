class Solution {
    public String reverseWords(String s) {
        String arr[]=s.trim().split("\\s+");
        // String ans="";
//         for(int i=arr.length-1;i>=0;i--){
//         ans+=arr[i];
//         if(i!=0){
//             ans+=" ";
//         }
//         }
// return ans;


//using stringbuilder-more optimized
StringBuilder ans=new StringBuilder();

for(int i=arr.length-1;i>=0;i--){
ans.append(arr[i]);
if(i!=0){
    ans.append(" ");
}
}
return ans.toString();    //here i got the error as i write only ans ans now ans is stringbulider not a string

    }
}