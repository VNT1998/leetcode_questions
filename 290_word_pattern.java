import java.util.HashMap;
class word_patter {
    public boolean wordPattern(String pattern, String s) {
        String[] patArray = s.split(" ");
        int n = patArray.length;
        if(n != pattern.length()) return false;
        HashMap<String, Character> stringChar = new HashMap<>();
        HashMap<Character, String> charString = new HashMap<>();

        for(int i = 0; i < n; i++){
            String word = patArray[i];
            Character character = pattern.charAt(i);
            if(stringChar.containsKey(word)){
                if(stringChar.get(word) != character) return false;
            }else{
                stringChar.put(word, character);
            }
            if(charString.containsKey(character)){
                if(!charString.get(character).equals(word)) return false;
            }else{
                charString.put(character, word);
            }
        }
        return true;
    }
}