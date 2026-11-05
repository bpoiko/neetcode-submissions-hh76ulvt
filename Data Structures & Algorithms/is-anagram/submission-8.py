class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        # racecar carrace 
        # Same amount of times regardless of order sounds to me like a K,V question where I could count char in string 1, and 2 then for each key inside if the values match for every character true!
        if len(s) != len(t): 
            return False

        count = {}
        count2 = {}
        for c in s:
            count[c] = count.get(c,0) + 1
        for w in t:
            count2[w] = count2.get(w, 0) + 1

        for key in count:
            if(count[key] != count2.get(key,0)):
                return False

        return True