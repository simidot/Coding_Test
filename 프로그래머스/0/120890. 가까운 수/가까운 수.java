import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
    int answer = 0;
    Arrays.sort(array);
    int[] diff = new int[array.length];
    for (int i=0; i<array.length; i++) {
      if (n-array[i] >0) {
        diff[i] = n-array[i];
      } else {
        diff[i] = -(n-array[i]);
      }
    }
    
    int min = 100;
    for (int j = 0; j < diff.length; j++) {
      if (min > diff[j]) {
        min = diff[j];
        System.out.println("min"+min);
        answer = array[j];
        System.out.println("answer:"+answer);
      }
    }
    return answer;
    }
}