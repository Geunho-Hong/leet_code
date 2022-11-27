class Solution {
    public String sortSentence(String s) {
        Map<Integer,String> wordsMap = new TreeMap<>();
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int idxOfWord = word.charAt(word.length()-1) -'0';
            word = word.substring(0,word.length()-1);
            wordsMap.put(idxOfWord, word);
        }

        for(Map.Entry<Integer,String> entry : wordsMap.entrySet()) {
            String value = entry.getValue();
            sb.append(value + " ");
        }

        return sb.toString().trim();
    }
}