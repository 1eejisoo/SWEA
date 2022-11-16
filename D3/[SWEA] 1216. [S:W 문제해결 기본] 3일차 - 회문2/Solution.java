import java.util.Scanner;

class Solution {
    public static boolean calc(char[][] palindrome, int index, int i, int j, int flag) {
        int start = i, end = j;

        for (int k = 0; k < (j + 1 - i) / 2; k++) {
            if (flag == 0) {   // 행 계산
                if (palindrome[index][start] != palindrome[index][end])
                    return false;
            }
            if (flag == 1) {   // 열 계산
                if (palindrome[start][index] != palindrome[end][index])
                    return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static int logic(char[][] palidrome, int index) {
        int rowMax = 1, columnMax = 1;

        for (int i = 0; i < palidrome.length; i++) {
            for (int j = palidrome.length - 1; j >= 0; j--) {
                if (calc(palidrome, index, i, j, 0) && j + 1 - i > rowMax) {
                    rowMax = j + 1 - i;
                }
                if (calc(palidrome, index, i, j, 1) && j + 1 - i > columnMax)
                    columnMax = j + 1 - i;
            }
        }
        return Math.max(rowMax, columnMax);
    }

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        String str;
        char[][] palindrome;
        int T, max;

        for (int test_case = 1; test_case <= 10; test_case++) {
            sb.append("#").append(test_case).append(" ");
            T = sc.nextInt();
            max = 0;
            palindrome = new char[100][100];

            for (int i = 0; i < 100; i++) {
                str = sc.next();
                palindrome[i] = str.toCharArray();
            }

            for (int i = 0; i < 100; i++) {
                max = Math.max(max, logic(palindrome, i));
            }
            sb.append(max).append("\n");
        }
        System.out.println(sb);
    }
}