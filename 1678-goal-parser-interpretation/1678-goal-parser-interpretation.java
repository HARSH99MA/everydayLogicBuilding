class Solution {
    public String interpret(String command) {
        //  return command.replace("()", "o")
        //       .replace("(", "")
        //       .replace(")", "");

        String str = "";
        for(int i = 0; i<command.length();i++){
            if(i + 1 < command.length() && command.charAt(i) == '(' && command.charAt(i+1) == ')'){
                str += "o";
            }
            else if(command.charAt(i) == '(' || command.charAt(i) == ')'){
                str += "";
            } else
            str += command.charAt(i);
        }
        return str;
    }
}