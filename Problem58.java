class Problem58 {
	public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
    
        String wordToCount = words[words.length-1];
        
        return wordToCount.length();
    }
}