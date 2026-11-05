class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        awe = {}

        for word in strs:
            key = tuple(sorted(word))
            awe.setdefault(key, []).append(word)
        
        return list(awe.values())
            
        
