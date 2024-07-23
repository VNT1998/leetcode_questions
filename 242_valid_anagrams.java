class valid_anagrams {
    public boolean isAnagram(String s, String t) {
        int[] count = new int[26];
        for (Character c : s.toCharArray()) {
            count[c - 'a'] += 1;
        }
        for (Character c : t.toCharArray()) {
            count[c - 'a'] -= 1;
        }
        for (Integer i : count) {
            if (i != 0) return false;
        }
        return true;
    }
}
