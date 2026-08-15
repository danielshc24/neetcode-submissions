class Solution {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            int[] count = new int[26];

            for (char ch : str.toCharArray()) {
                count[ch - 'a']++;
            }

            StringBuilder key = new StringBuilder();

            for (int c : count) {
                key.append('#').append(c);
            }

            map.computeIfAbsent(key.toString(), k -> new ArrayList<>())
                    .add(str);
        }

        return new ArrayList<>(map.values());
}
}

