/*
Write a function to find the longest common prefix 
string amongst an array of strings.

If there is no common prefix, return an empty string "".
*/


class Problem14{
	public String longestCommonPrefix(String[] strs) {
		//creating the prefix with the first word of the array
        String prefix = strs[0];
        //iterate through the array starting at index 1 
        //because we already have the index 0 in prefix
        for(int i = 1; i<strs.length; i++) {
        	//while loop to check what is the longer prefix comparing
        	//the prefix we already have and the next word
        	//when the longest prefix appears on the word we 
        	//exit the while loop
            while(strs[i].indexOf(prefix) != 0 && prefix.length() != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
            //if the prefix is empty at this point there is
            //no point on keep going we only return ""
            if(prefix=="")
            	return "";
        }
        //we return the longest prefix we found
        return prefix;
    }
}