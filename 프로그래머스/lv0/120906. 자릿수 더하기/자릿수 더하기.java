import java.lang.Math;
class Solution {
    public int solution(int n) {
        int lngth = Integer.toString(n).length();
        int answer = 0;
        for(int i=0;i<lngth;i++){            
            answer+=n%10;
            n=(int)n/10;                
        }
        return answer;
    }
}