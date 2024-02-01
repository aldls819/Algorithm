class Solution {
    public int[] solution(int start_num, int end_num) {
        int len = end_num - start_num + 1;
        
        int [] arr = new int [len];
        int num = start_num;
        
        for(int i=0; i<len; i++) {
            arr[i] = num;
            num++;
        }
        return arr;
    }
}