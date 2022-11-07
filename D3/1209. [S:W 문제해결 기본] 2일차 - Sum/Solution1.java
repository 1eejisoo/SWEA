import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int[][] arr = new int[100][100];

        for (int TC = 1; TC <= 10; TC++) {
            List<Integer> sumList = new ArrayList<>();
            int a = 0, rowSum, columnSum, diagonalSum1 = 0, diagonalSum2 = 0;
            int rowSumMax = 0, columnSumMax = 0;

            sb.append("#").append(TC).append(" ");
            br.readLine();

            for (int i = 0; i < 100; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                for (int j = 0; j < 100; j++){
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for (int i = 0; i < 100; i++) {
                rowSum = 0;
                columnSum = 0;

                for (int j = 0; j < 100; j++) {
                    rowSum += arr[i][j];
                    columnSum += arr[j][i];
                }
                diagonalSum1 += arr[i][i];
                diagonalSum2 += arr[99 - i][99 - i];

                if (rowSumMax < rowSum) rowSumMax = rowSum;
                if (columnSumMax < columnSum) columnSumMax = columnSum;
            }
            sb.append(Math.max(
                    Math.max(rowSumMax, columnSumMax),
                    Math.max(diagonalSum1, diagonalSum2))).append("\n");
        }
        System.out.println(sb);
    }
}