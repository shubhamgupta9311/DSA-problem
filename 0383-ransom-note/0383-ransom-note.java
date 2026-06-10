class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        // int rp=0;
        // int mp=0;

        // while(rp<ransomNote.length() && mp<magazine.length()){
         
        //  if(ransomNote.charAt(rp)==magazine.charAt(mp)){
        //     rp++;
        //     mp++;
        //  }
        //  else{
        // mp++;
        //  }
    

        // }

        // return rp==ransomNote.length();
        
HashMap<Character,Integer> map= new HashMap<>();


//frquency counting or putting string value in my  hashmap with values
for(int i=0;i<magazine.length();i++){
 char ch=magazine.charAt(i);
 map.put(ch,map.getOrDefault(ch,0)+1);
}


for(int i=0;i<ransomNote.length();i++){
 char ch=ransomNote.charAt(i);

            if( !(map.containsKey(ch)) || map.get(ch)==0) {
                return false;
            }
       
    //if it contains
        map.put(ch,map.get(ch)-1);
    
}
return true;


 


    }
}