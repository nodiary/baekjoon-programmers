class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int friends : array){
            if(friends>height) answer++;
        }
        return answer;
    }
}