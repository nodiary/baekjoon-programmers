
class Solution {
    public String solution(String my_string, int n) {
        String[] words = my_string.split("");
        String answer = "";
        for(int i=0;i<my_string.length();i++){
            answer+=words[i].repeat(n);
        }
        return answer;
    }
}