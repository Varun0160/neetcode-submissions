class Solution {
    public boolean isAnagram(String s, String t) {
       if (s.length() != t.length()) return false;
       HashMap<Character,Integer>set=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            set.put(ch,set.getOrDefault(ch,0)+1);
        }

        for(int j=0;j<t.length();j++){
            char res=t.charAt(j);
            if(set.getOrDefault(res, 0) > 0){
                set.put(res, set.get(res) - 1);
            }else{
                return false;
            }
        }
        return true;

    }
}
