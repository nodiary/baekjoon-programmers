import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        numbers = Arrays.stream(numbers).sorted().toArray();
        int yang = numbers[0]*numbers[1];
        int eum = numbers[numbers.length-2]*numbers[numbers.length-1];
        return yang >= eum ? yang : eum;
    }
}