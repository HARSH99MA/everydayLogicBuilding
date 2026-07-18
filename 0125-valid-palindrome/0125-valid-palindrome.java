class Solution {
    public boolean isPalindrome(String s) {
        String str2 = "";
        String str  = s.toLowerCase();
        for(int i = 0 ; i<s.length();i++){
            char ch = str.charAt(i);
            if( (ch >= 'a' && ch<='z') || (ch >= '0' && ch <= '9')){
                str2 += ch;
            }
            continue;
        }
        StringBuilder sb = new StringBuilder(str2);
        sb.reverse();
        String rev = sb.toString();
        return str2.equals(rev);
        
        
    }
}