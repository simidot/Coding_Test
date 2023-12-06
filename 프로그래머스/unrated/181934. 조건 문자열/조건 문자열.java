class Solution {
    public int solution(String ineq, String eq, int n, int m) {
                int answer = 0;

        switch(ineq) {
            case "<":
                if(eq.equals("=")) {
                    if (n<=m) answer = 1;
                    System.out.println("1 :"+answer);
                } else {
                    if (n<m) answer=1;
                    System.out.println("2 :"+answer);
                }
                break;
            case ">":
                if (eq.equals("=")) {
                    if (n>=m) answer = 1;
                    System.out.println("3 :"+answer);
                } else {
                    if (n>m) answer = 1;
                    System.out.println("4: "+answer);
                }
                break;
        }
        return answer;
    }
}