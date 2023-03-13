class Solution {
    public int solution(int price) {
        int answer = price < 100000 ? price : 
        price < 300000 ? (int)(0.95 * (double)price) : 
        price < 500000 ? (int)(0.9 * (double)price) : (int)(0.8 * (double)price);
        return answer;
    }
}