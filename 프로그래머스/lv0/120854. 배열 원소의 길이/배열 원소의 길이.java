class Solution {
    public int[] solution(String[] strlist) {
        int arrLength = strlist.length;
        int[] array = new int[arrLength];
        
        for(int i=0;i<arrLength;i++){
            array[i]=strlist[i].length();
        }
        return array;
    }
}