import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution
{
    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T;
        T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case < T+1; test_case++) {
            sb.append("#").append(test_case).append(" ");

            int N = Integer.parseInt(br.readLine());
            int[][] farm = new int[N][N];
            int sum = 0;
            int middle = N/2;
            int start = middle; int end = middle;   

            for (int i = 0; i < N; i++) {
                String[] tmp = br.readLine().split("");
                for (int j = 0; j < tmp.length; j++) {
                    farm[i][j] = Integer.parseInt(tmp[j]);
                }
            }

            for (int i = 0; i < N; i++) {
                if (i < middle) {
                    for (int k = start; k < end+1; k++) {
                        sum += farm[i][k];
                    }
                    start--; end++;
                }
                if (i == middle) {
                    for (int j = 0; j < N; j++) {
                        sum += farm[i][j];
                    }
                }
                if (i > middle) {
                    start++; end--;
                    for (int k = start; k < end+1; k++) {
                        sum += farm[i][k];
                    }
                }
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }
}