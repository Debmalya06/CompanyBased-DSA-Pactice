import java.util.Scanner;

public class Main {
    static int N, M;
    static int[] dr = {0, 1}; // right and down direction row deltas
    static int[] dc = {1, 0}; // right and down direction column deltas
    static int[][] dp;

    // Returns the longest path starting from (r, c)
    static int dfs(int r, int c, int[][] grid) {
        if (r == N-1 && c == M-1) {
            return 1;
        }
        if (dp[r][c] != -1) {
            return dp[r][c];
        }
        int res = -1;

        for (int d = 0; d < 2; ++d) {
            int nr = r + dr[d], nc = c + dc[d];
            if (nr < N && nc < M && grid[nr][nc] > grid[r][c]) {
                int path = dfs(nr, nc, grid);
                if (path != -1) {
                    res = Math.max(res, path + 1);
                }
            }
        }
        dp[r][c] = res;
        return res;
    }

    static int longestPathInGrid(int n, int m, int[][] grid) {
        N = n; M = m;
        dp = new int[N][M];
        // Initialize memoization array
        for (int i = 0; i < N; ++i)
            for (int j = 0; j < M; ++j)
                dp[i][j] = -1;

        int ans = dfs(0, 0, grid);
        return ans == -1 ? -1 : ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();

        int[][] grid = new int[n][m];
        for (int i = 0; i < n; ++i)
            for (int j = 0; j < m; ++j)
                grid[i][j] = sc.nextInt();
        int result = longestPathInGrid(n, m, grid);
        System.out.println(result);
        sc.close();
    }
}