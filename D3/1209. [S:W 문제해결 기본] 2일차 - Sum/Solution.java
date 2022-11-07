import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[][] arr = new String[100][100];

        for (int TC = 1; TC <= 10; TC++) {
            List<Integer> sumList = new ArrayList<>();
            int a = 0, rowSum, columnSum, diagonalSum1 = 0, diagonalSum2 = 0;
            int rowSumMax = 0, columnSumMax = 0;

            sb.append("#").append(TC).append(" ");
            br.readLine();

            for (int i = 0; i < 100; i++) {
                arr[i] = br.readLine().split(" ");
            }

            for (int i = 0; i < 100; i++) {
                rowSum = 0;
                columnSum = 0;

                for (int j = 0; j < 100; j++) {
                    rowSum += Integer.parseInt(arr[i][j]);
                    columnSum += Integer.parseInt(arr[j][i]);
                }
                diagonalSum1 += Integer.parseInt(arr[i][i]);
                diagonalSum2 += Integer.parseInt(arr[99 - i][99 - i]);

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