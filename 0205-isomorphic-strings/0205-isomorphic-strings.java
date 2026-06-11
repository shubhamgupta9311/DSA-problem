class Solution {
    public boolean isIsomorphic(String s, String t) {
     
        HashMap<Character,Character> map_s=new HashMap<>();
          HashMap<Character,Character> map_t=new HashMap<>();
//mapping from s to t
        for(int i=0;i<s.length();i++){
            char  chs=s.charAt(i);
            char cht=t.charAt(i);
          if(map_s.containsKey(chs)){
             if(map_s.get(chs)!=cht){
                return false;
             }
          }
            map_s.put(chs,cht);
         
        }

        //mapping from  t to s
         for(int i=0;i<s.length();i++){
            char  chs=s.charAt(i);
            char cht=t.charAt(i);
          if(map_t.containsKey(cht)){
             if(map_t.get(cht)!=chs){
                return false;
             }
          }
            map_t.put(cht,chs);
         
        }


        return true;

    }
}