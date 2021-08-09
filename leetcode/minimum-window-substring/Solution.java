class Solution {
    public String minWindow(String s, String t) {
        int missing = t.length();
        int start = 0;
        int end = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < missing; i++) {
            char val = t.charAt(i);
            if (map.containsKey(val)) {
                map.put(val, map.get(val) + 1);
            } else {
                map.put(val, 1);
            }
        }
        int i = 0;
        for (int j = 1; j <= s.length(); j++) {
            char cur = s.charAt(j - 1);
            if (map.containsKey(cur)) {
                if (map.get(cur) > 0) {
                    missing -= 1;
                }
            }
            if (map.containsKey(cur)) {
                map.put(cur, map.get(cur) - 1);
            } else {
                map.put(cur, -1);
            }
            if (missing == 0) {
                while (i < j && map.get(s.charAt(i)) < 0) {
                    map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                    i++;
                }
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                missing += 1;
                if (end == 0 || end - start > j - i) {
                    start = i;
                    end = j;
                }
                i += 1;
            }
        }
        return s.substring(start, end);
    }
}