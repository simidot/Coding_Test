class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];

        // strlist의 각 원소의 길이를 담은 배열
        for(int i=0; i<strlist.length; i++) {
            answer[i] = strlist[i].length();
        }

        return answer;
    }
}