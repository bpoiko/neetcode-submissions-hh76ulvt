class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> group = new HashMap<>();

        for(String str : strs){
            char[] b1 = str.toCharArray();
            Arrays.sort(b1);
            String key = new String(b1); // groups them together based off a sorted key

            group.putIfAbsent(key, new ArrayList<>());

            group.get(key).add(str);
        }
        return new ArrayList<>(group.values());
    }
}
