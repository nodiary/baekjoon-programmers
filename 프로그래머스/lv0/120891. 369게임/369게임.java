class Solution {
    public int solution(int order) {
        int answer = 0;
        String orderStr= ""+order;
        for(int i=0;i<orderStr.length();i++){
            char cha = orderStr.charAt(i);
            if(cha=='3' || cha=='6' || cha=='9'){
                answer++;
            }
        }
        return answer;
    }
}