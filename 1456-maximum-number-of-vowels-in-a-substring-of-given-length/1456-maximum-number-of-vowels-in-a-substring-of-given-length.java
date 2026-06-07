class Solution {
    public int maxVowels(String s, int k) {

int curr=0;
//first window
for(int i=0;i<k;i++){
    char ch=s.charAt(i);
     if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                curr++;
}
//first window complete
int max=curr;

//rest window travesiong with optimization not checking again all charatcer that e check already in previous window


for(int i=k;i<s.length();i++){
char add=s.charAt(i);
if(add=='a'||add=='e'||add=='i'||add=='o'||add=='u'){
    curr++;
}
char remove=s.charAt(i-k);
if(remove=='a'||remove=='e'||remove=='i'||remove=='o'||remove=='u'){
    curr--;
}
max=Math.max(curr,max);

}
       
       return max; 
    }
}