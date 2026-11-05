class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        # Use the sorted word as the key!
        anas = {}

        for word in strs:
            key = tuple(sorted(word))
            anas.setdefault(key,[]).append(word)
        
        return list(anas.values())