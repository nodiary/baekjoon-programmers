class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] charArr = my_string.toCharArray();
        for(int i=0;i<charArr.length;i++){
            if(Character.isUpperCase(charArr[i])) answer += String.valueOf(charArr[i]).toLowerCase();
            else answer += String.valueOf(charArr[i]).toUpperCase();
        }
        return answer;
    }
}