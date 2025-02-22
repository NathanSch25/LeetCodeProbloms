class Solution {
    public boolean isSubsequence(String s, String t) {
        int count = 0;
        int ssize = s.length();
        //Set<Charater> sortedV = map.keySet();
        if (s.length() > 0){
            for (int i =0; i < t.length(); i++){
                if (s.charAt(count) == t.charAt(i)){
                    count++;
                    if (count == s.length())
                        break;

                }
            }
        }
        return (count == ssize);
    }
}