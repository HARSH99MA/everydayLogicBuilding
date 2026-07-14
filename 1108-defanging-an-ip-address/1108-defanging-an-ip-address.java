class Solution {
    public String defangIPaddr(String address) {
        String str = "";
        for (int i = 0; i < address.length(); i++) {
            str += (address.charAt(i) == '.') ? "[.]" : address.charAt(i);
        }
        return str;
    }
}