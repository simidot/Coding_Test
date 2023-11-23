class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int sumArr1 = 0;
        int sumArr2 = 0;
        
        if (arr1.length != arr2.length) { //길이가 다를 때 
            if (arr1.length>arr2.length) {
                answer = 1;
            } else {
                answer = -1;
            }
        } else { // 길이가 같을 때 모든 원소의 합 비교.
            for (int arr:arr1) {
                sumArr1 += arr;
            }
            for (int arr:arr2) {
                sumArr2 += arr;
            }
            if (sumArr1 > sumArr2) {
                answer = 1;
            } else if (sumArr1 < sumArr2) {
                answer = -1;
            } else {
                answer = 0;
            }
        }
        
        return answer;
    }
}