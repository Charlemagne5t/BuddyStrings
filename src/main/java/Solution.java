import java.util.Arrays;

public class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        char replaceS = '0';
        char replaceGoal = '0';
        boolean wasReplaced = false;
        if(s.equals(goal)){
            int originalSize = s.length();
            int distinctSize = 0;

               distinctSize = (int) s.chars().distinct().count();

            if(distinctSize != originalSize){
                return true;
            }else return false;
        }
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != goal.charAt(i) && replaceS == '0' && i != s.length() - 1){
                replaceS = s.charAt(i);
                replaceGoal = goal.charAt(i);
            }else if(i == s.length() - 1 && s.charAt(i) != goal.charAt(i) && replaceS == '0'){
                return false;
            }else if(s.charAt(i) != goal.charAt(i) && replaceS != '0'){
                if(wasReplaced){
                    return false;
                }
                if(!wasReplaced && (s.charAt(i) != replaceGoal || goal.charAt(i) != replaceS)){
                    return false;
                }else if(!wasReplaced && s.charAt(i) == replaceGoal && goal.charAt(i) == replaceS){
                    wasReplaced = true;
                }
            } else if (replaceS != '0' && s.charAt(i) != goal.charAt(i)) {
                return false;
            }
        }
        if(replaceS != '0' && !wasReplaced){
            return false;
        }
        return true;
    }
}
