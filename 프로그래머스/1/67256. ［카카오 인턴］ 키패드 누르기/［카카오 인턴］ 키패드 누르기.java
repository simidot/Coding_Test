class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        // 왼손 *, 오른손 # 위치에서 시작
        // 상하좌우 1칸 거리 1
        // 1,4,7 왼손
        // 3,6,9 오른손
        // 2,5,8,0 현재 키패드 위치에서 더 가까운 엄지손가락 사용 (같다면 손잡이 기준)

        StringBuilder sb = new StringBuilder();

        int curLeft =10;
        int curRight = 12;


        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                sb.append("L");
                curLeft = numbers[i];
            } else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                sb.append("R");
                curRight = numbers[i];
            } else {
                if (numbers[i] == 0) numbers[i] = 11;
                int leftDist = Math.abs(numbers[i] - curLeft) / 3 + Math.abs(numbers[i] - curLeft) % 3;
                int rightDist = Math.abs(numbers[i] - curRight) / 3 + Math.abs(numbers[i] - curRight) % 3;

                if (leftDist < rightDist) {
                    sb.append("L");
                    curLeft = numbers[i];
                } else if (leftDist == rightDist) {
                    if (hand.equals("left")) {
                        curLeft = numbers[i];
                        sb.append("L");
                    } else {
                        curRight = numbers[i];
                        sb.append("R");
                    }
                } else {
                    sb.append("R");
                    curRight = numbers[i];
                }
            }
        }

        answer = sb.toString();
        return answer;
    }
}