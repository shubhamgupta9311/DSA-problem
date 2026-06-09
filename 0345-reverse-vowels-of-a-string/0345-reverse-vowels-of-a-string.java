class Solution {
    public String reverseVowels(String s) {
 
 HashSet<Character> vowels=new HashSet<>() ;
 vowels.add('a');
  vowels.add('e');
   vowels.add('i');
    vowels.add('o');
     vowels.add('u');
      vowels.add('A');
       vowels.add('E');
        vowels.add('I');
         vowels.add('O'); vowels.add('U');
StringBuilder sb=new StringBuilder(s);
        int lp=0;
        int rp=s.length()-1;
        while(lp<rp){
         if(vowels.contains(sb.charAt(lp))  && vowels.contains(sb.charAt(rp))){
            //swapping
            char temp=sb.charAt(lp);
            sb.setCharAt(lp,sb.charAt(rp));
            sb.setCharAt(rp,temp);
            lp++;
            rp--;
         }
else if (vowels.contains(sb.charAt(lp)))
{
    rp--;
}
         else if(vowels.contains(sb.charAt(rp))){
            lp++;
         }
else{
    lp++;
    rp--;
}
        
    }

    return sb.toString();
    }
}