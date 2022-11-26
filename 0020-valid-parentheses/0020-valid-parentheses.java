class Solution {
    public boolean isValid(String s) {
        // 1.여는 괄호일때 Stack에 문자열을 저장한다
        // switch 문을 활용할 수도 있지만, java의 map.of library를 활용하면 더욱 쉽게 구현 가능

        Stack<Character> stack = new Stack<>();
        Map<Character,Character> map = Map.of(')','(' , ']','[','}','{');

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '(' || ch =='[' || ch == '{') {
                stack.push(ch);
            } else if(stack.isEmpty() || stack.pop() != map.get(ch)) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}