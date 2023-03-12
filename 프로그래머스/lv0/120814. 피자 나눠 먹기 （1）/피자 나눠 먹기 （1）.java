class Solution {
    public int solution(int n) {
        int answer = 1;
        int pizza = (n<=7 ?  1 : n/7 + (n%7!=0 ? 1 : 0) );
        return pizza;                       
    }
}