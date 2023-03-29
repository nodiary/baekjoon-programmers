import java.util.Arrays;
class Solution {
    public int[] solution(String my_string) {
        my_string = my_string.replaceAll("[^0-9]","");        
        return Arrays.stream(my_string.split("")).mapToInt(Integer::parseInt).sorted().toArray();
    }
}