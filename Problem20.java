/*
Given a string s containing just the 
characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.

*/
/*
for my approach to this problem i will taverse through the 
string by each character and look for a closing parentheses that
adjacent to it has an open parentheses(to the right).
if there is no closing parenthesees i will add the characters
to a stack to remember them in order, another possiblity is that
i find a closing bracket and not find the open bracke, in this
case i will just add the character to the stack and continue.
if at the end of my for loop my stack is not empty, this means that
something went wrong and the string is not valid.
*/
class Problem20 {
	public boolean validParentheses(String str) {
		Stack <Character> stack = new Stack<>();	

		for(int i = 0; i<str.length();i++) {
			switch(str.charAt(i)) {
				case '}':
					if(!stack.isEmpty() && stack.peek() == '{') {
						stack.pop();
					}else {
						stack.push(str.charAt(i));
					}
				break;

				case ')':
					if(!stack.isEmpty() && stack.peek() == '(') {
						stack.pop();
					}else {
						stack.push(str.charAt(i));
					}
				break;

				case ']':
					if(!stack.isEmpty() && stack.peek() == '[') {
						stack.pop();
					}else {
						stack.push(str.charAt(i));
					}
				break;

				default:
					stack.push(str.charAt(i));
			}
		}
		return stack.isEmpty();
	}
}