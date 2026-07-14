class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(int i = 0 ; i < sentences.length; i++){
            int words = sentences[i].trim().split("\\s+").length;
            if(words>max){
                max = words;
            }
           
        }
        return max;
    }
}