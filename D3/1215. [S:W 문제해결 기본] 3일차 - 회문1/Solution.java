import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
    public static int logic(int n, String[] palindrome) {
        int count = 0;
        int position = 0;
        int flag = 0;

        for (int j = 0; j < 9 - n; j++) {
            String[] temp = new String[n];
            int front = 0;
            int back = n - 1;

            for (int k = 0; k < n; k++) {
                temp[k] = palindrome[position++];
            }
            for (int k = 0; k < n / 2; k++) {
                if (temp[front].equals(temp[back])) {
                    front += 1;
                    back -= 1;

                } else break;
                if (k == n / 2 - 1) count++;
            }
            flag += 1;
            position = flag;
        }
        return count;
    }

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n;

        for (int tc = 1; tc <= 10; tc++) {
            sb.append("#").append(tc).append(" ");
            n = Integer.parseInt(br.readLine());

            String[][] palindrome = new String[8][8];
            String[] row = new String[8];
            String[] column = new String[8];
            int count = 0;

            for (int i = 0; i < 8; i++) {
                palindrome[i] = br.readLine().split("");
            }

            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    row[j] = palindrome[i][j];
                    column[j] = palindrome[j][i];
                }
                int a = logic(n, row);
                int b = logic(n, column);
                count += a + b;
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}