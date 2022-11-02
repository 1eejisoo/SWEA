import java.util.Arrays;
import java.util.Scanner;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);

        for(int test_case = 1; test_case <= 10; test_case++)
        {
            sb.append("#").append(test_case).append(" ");
            
            int[] arr = new int[100];
            int N = sc.nextInt(); 
            sc.nextLine();
            
            for (int i = 0; i < 100; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                Arrays.sort(arr);
                arr[0]++;
                arr[99]--;
            }
            Arrays.sort(arr);
            sb.append(arr[99] - arr[0]).append("\n");
        }
        System.out.println(sb);
    }
}