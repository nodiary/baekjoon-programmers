class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int maxNum = 0;
        int idx = 0;
        for(int i=0;i<array.length;i++){
            if(array[i]>=maxNum){
                maxNum = array[i];
                idx = i;
            }
        }
        answer[0] = maxNum; //가장 큰 수
        answer[1] = idx;    //인덱스
        return answer;
    }
}