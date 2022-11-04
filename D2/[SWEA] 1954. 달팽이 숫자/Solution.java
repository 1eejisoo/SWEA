import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T;
        T = Integer.parseInt(br.readLine());

        // 방향 벡터 설계
        // [우 -> 하 -> 좌 -> 상]의 패턴
        // [우] (0,0) -> (0,1)
        // [하] (0,0) -> (1,0)
        // [좌] (0,0) -> (0,-1)
        // [상] (0,0) -> (-1,0)
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        for (int test_case = 1; test_case <= T; test_case++) {
            sb.append("#").append(test_case).append(" ").append("\n");

            int N = Integer.parseInt(br.readLine());
            int[][] arr = new int[N][N];
            int dir = 0, x = 0, y = 0;

            arr[x][y] = 1; // (0,0)은 1로 채워둔다.

            for (int i = 2; i < N * N + 1; i++) {
                x += dx[dir];
                y += dy[dir];
                arr[x][y] = i;

                // 움직이는 좌표가 범위 안에 있고 값을 0으로 가지고 있으면 방향을 바꾸지 않고 반복해서 값을 채운다.
                if (0 <= x + dx[dir] && x + dx[dir] < N &&
                        0 <= y + dy[dir] && y + dy[dir] < N &&
                        arr[x + dx[dir]][y + dy[dir]] == 0) continue;  // for문 처음으로

                // 방향 바꾸기
                // [우 -> 하 -> 좌 -> 상]의 패턴으로 배열을 채운다.
                // [우] dir = 0
                // [하] dir = 1
                // [좌] dir = 2
                // [상] dir = 3
                if (dir != 3) dir += 1;
                else dir = 0;  // '상'의 상태가 되면 dir = 0으로 초기화시켜 '우' 방향으로 갈 수 있게 설정한다.

            }
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    sb.append(arr[i][j]).append(" ");
                }
                sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}