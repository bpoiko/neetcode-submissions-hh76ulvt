class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        # use the sorted word as it's key, if the sorted word has been seen again, append the value

        seen = {}
        for word in strs:
            key = tuple(sorted(word))
            seen.setdefault(key,[]).append(word)
        
        return list(seen.values())
        