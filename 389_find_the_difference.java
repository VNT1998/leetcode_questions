class find_the_difference {
    public char findTheDifference(String s, String t) {
        int diff = 0;
        for(char ch: s.toCharArray()){
            diff = diff ^ (ch - 'a');
        }
        for(char ch: t.toCharArray()){
            diff = diff ^ (ch - 'a');
        }
        return (char) ('a' + diff);
    }
}