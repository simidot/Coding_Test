class Solution {
    public long solution(String numbers) {
        long answer = 0;
        
        String[] numbers_arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for (int i=0; i<numbers_arr.length; i++) {
            numbers = numbers.replaceAll(numbers_arr[i], String.valueOf(i));
        }

        answer = Long.parseLong(numbers);
        return answer;
    }
}