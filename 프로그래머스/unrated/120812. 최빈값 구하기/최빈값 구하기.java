import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        int answer = 0;

        Arrays.sort(array); //오름차순 정렬

        int max = array[array.length-1]; //최댓값은 정렬 후 배열의 마지막 원소
        int[] count = new int[max+1]; // 숫자를 셀 예정인데, 사이즈는 마지막 원소크기만큼

        for(int i=0; i<array.length; i++) { // 반복문을 돌며 각 숫자가 얼마나 나오는지 세준다.
            count[array[i]]++;
        }
        
        int top = count[0]; //가장 많은 것을 찾기 위한 변수
        
        for(int i=1; i<count.length; i++) {
            if(top<count[i]) {
                top = count[i];
                answer = i;
            } else if (top==count[i]) { //갯수가 같아버리면 -1
                answer = -1;
            }
        }
        return answer;
    }
}