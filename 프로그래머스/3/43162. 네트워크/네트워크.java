class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;

        // n = 컴퓨터의 개수
        // computers = 연결 정보가 담긴 2차원 배열.
        // 네트워크의 개수 리턴


        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(computers, i, visited);
                answer++;
            }
        }

        return answer;
    }

    private static void dfs(int[][] computers, int node, boolean[] visited) {
        visited[node] = true;

        for (int i = 0; i < computers.length; i++) {
            if (node != i && computers[node][i] == 1 && !visited[i]) {
                dfs(computers, i, visited);
            }
        }
    }
}