class Problem9 {
	public boolean isPalindrome(int x) {
		//if the integer is negative we know that is not a 
		//palindrome number so we return false
       if(x<0) {
           return false;
       } 
       //we convert the integer to a string 
       String str = Integer.toString(x);
       //i will use the two pointer approach to solve this
       //creating the right pointer and the left pointer
       int right = str.length()-1;
       int left = 0;
       //while loop to iterate through the word by right 
       //and left pointers
       while (left < right) {
       		//if the character are not equal we return false
           if(str.charAt(left) != str.charAt(right)) {
               return false;
           }
           //moving the two pointers to the middle
           left++;
           right--;
       }
       //if we didn't return false in the while loop
       //we conclude that the number is a palindrome
       return true;
    }
}