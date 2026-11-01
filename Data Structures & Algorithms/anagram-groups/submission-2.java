class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs){
            char[] b1 = str.toCharArray();
            Arrays.sort(b1);
            String key = new String(b1);
            map.putIfAbsent(key,new ArrayList<>());
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
