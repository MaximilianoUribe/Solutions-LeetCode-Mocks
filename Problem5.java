/*
Given a string s, return the longest palindromic substring in s.
*/

//the approach for this problem is that
//there is only two ways of having a palindrom
//odd or even, so we have to check both possibilities
//we select and index and we find the largest palindrome
//from that index, and we check every index in the string
class Problem5 {
	public String longestPalindrome(String s) {
		//edge case we the length is less than 2 so we return
		//the input since it is a palindrome by definition
        if(s.length()<2)
        	return s;

        //we create the variable to return
        String result = "";
        //iteraste through the word
        for(int i = 0; i < s.length(); i++) {
            //check the even cases
            String even = checkFromIndex(s,i,i);
            //check string is greater than the 
            //result we already have
            if(result.length()<even.length())
            	result = even;

            //cheking the odd cases
            String odd = checkFromIndex(s,i,i+1);

            //checking if the string is greater than what we 
            //alredy have
            if(result.length()<odd.length())
            	result = odd;
        }
        //returning the result
        return result;
    }
    //helper method that expands from the middle of two indeces and
    //return the longest sustring from thos indeces.
    public String checkFromIndex(String s, int left, int right){
        while(left>= 0 && right<s.length() && s.charAt(left)==s.charAt(right)) {
            left--;
            right++;
        }

        return(s.substring(left+1,right));
    }	
}