
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        String merged = new String();
        while ((i < word1.length()) && (i < word2.length())){
            merged += word1.charAt(i);
            merged += word2.charAt(i);
            i++;
        }
        if ((i == word1.length()) && (i == word2.length())){
            return merged;
        }
        else if (i == word1.length()){
            return merged + word2.substring(i);
        }
        else{
            return merged + word1.substring(i);
        }
        
    }
}

/*
while i < sizeof(w1) || i < sizeof(w2)
    merged.append(w1[i])
    merged.append(w2[i])
if (i == sizeof(w1)) AND (1 == sizeof(w2))
    merged += w2 remaining
else if 1 == sizeof(w2)
    merged += w1 remaing
else if i == sizeof(w1)
    merged += w2 remaining

*/




/*
while i < sizeof(w1) || i < sizeof(w2)
    merged.append(w1[i])
    merged.append(w2[i])
if (i == sizeof(w1)) AND (1 == sizeof(w2))
    merged += w2 remaining
else if 1 == sizeof(w2)
    merged += w1 remaing
else if i == sizeof(w1)
    merged += w2 remaining

*/