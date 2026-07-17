public class Solution {
    public String defangIPaddr(String address) {
        String result = "";
        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);
            if (c == '.') {
                result += "[.]"; // Highly unoptimized: creates a new String object each time
            } else {
                result += c;     // Creates a new String object here too
            }
        }
        return result;
    }
}