class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        for (int i = 0; i < dots.length - 1; i++) {
            for (int j = i + 1; j < dots.length; j++) {
                // 기울기 계산 (double 타입 사용)
                if ((dots[j][0] - dots[i][0]) == 0) {
                    continue; // 분모가 0인 경우 처리
                }
                double firstPair = (double) (dots[j][1] - dots[i][1]) / (dots[j][0] - dots[i][0]);

                // 나머지 두 점의 기울기 계산
                for (int k = 0; k < dots.length; k++) {
                    if (k == i || k == j) continue; // 이미 선택된 점은 건너뜀

                    for (int l = k + 1; l < dots.length; l++) {
                        if (l == i || l == j) continue; // 이미 선택된 점은 건너뜀

                        if ((dots[l][0] - dots[k][0]) == 0) {
                            continue; // 분모가 0인 경우 처리
                        }
                        double secondPair = (double) (dots[l][1] - dots[k][1]) / (dots[l][0] - dots[k][0]);

                        // 기울기가 같은 경우
                        if (firstPair == secondPair) {
                            answer = 1;
                            return answer;
                        }
                    }
                }
            }
        }
        
        return answer;
    }
}