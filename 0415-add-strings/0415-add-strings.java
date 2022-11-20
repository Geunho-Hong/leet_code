class Solution {
    public String addStrings(String num1, String num2) {
        // 1. num1 :  11
        // 2. num2 : 123

        // 3. num1 : 27
        // 4. num2 : 78

        StringBuilder sb = new StringBuilder();

        int sum = 0;
        int num1OfLength = num1.length() -1;
        int num2OfLength = num2.length() -1;

        while(sum > 0 || num1OfLength >= 0 || num2OfLength >= 0) {
            if(num1OfLength >= 0) {
                sum += num1.charAt(num1OfLength--) - '0';
            }
            if(num2OfLength >= 0) {
                sum += num2.charAt(num2OfLength--) - '0';
            }
            sb.append(sum % 10);
            sum /= 10;
        }
        return sb.reverse().toString();
    }
}