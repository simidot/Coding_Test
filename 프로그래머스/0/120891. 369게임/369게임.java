class Solution {
    public int solution(int order) {
        int answer = 0;

    StringBuilder sb = new StringBuilder();

    while(order > 0){
      int remainder = order % 10;
      sb.append(remainder);
      order /= 10;
    }

    for (int i = 0; i < sb.length(); i++) {
      if (sb.charAt(i) == '3' || sb.charAt(i) == '6' || sb.charAt(i) == '9') {
        answer++;
      }
    }

    return answer;
    }
}