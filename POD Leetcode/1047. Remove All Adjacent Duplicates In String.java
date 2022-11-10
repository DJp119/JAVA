class Solution {
    public String removeDuplicates(String S) {
		Stack<Character> st = new Stack<>();
		
		for(char c : S.toCharArray()) {
			if(!st.isEmpty()) {
				if(c == st.peek()) st.pop();
				else st.push(c);
			} else st.push(c);
		}
		
		StringBuilder builder = new StringBuilder();
		for(char c : st)
			builder.append(c);
		
		return builder.toString();    }
}
