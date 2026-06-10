class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> map= new HashMap<>();
        //storing stones string characer in map
        for(int i=0;i<stones.length();i++){
            char ch=stones.charAt(i);

            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int count=0;
for(int i=0;i<jewels.length();i++){
    char ch=jewels.charAt(i);
if(map.containsKey(ch)){
 count+=map.get(ch);
}

}
return count;


    }
}