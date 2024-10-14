import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
                // 전화번호 중 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려고 한다.
        // 어떤 번호가 다른 번호의 접두어인 경우 false, 없으면 true를 리턴
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length-1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                answer = false;
                break;
            }
        }
        return answer;
    }
}