/*
Given a string s consisting of some words 
separated by some number of spaces, 
return the length of the last word in the string.

A word is a maximal substring consisting of non-space 
characters only.
*/
class Problem58 {
	public int lengthOfLastWord(String s) {
		//saving the word separated by a space in a array
        String[] words = s.split(" ");
    	//returning the length of the last word
        return words[words.length-1].length();
    }
}