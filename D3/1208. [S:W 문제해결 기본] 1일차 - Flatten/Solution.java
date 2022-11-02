import java.util.Scanner;

class Solution
{
    static int getMaxNum(int[] arr) {
        int max = arr[0];
        
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) max = arr[i];
        }   
        return max;
    }
    
    static int getMinNum (int[] arr) {
        int min = arr[0];
        
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) min = arr[i];
        }
        return min;
    }
    
    static void dumpMaxNum(int[] arr, int max) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                arr[i] -= 1;
                break;
            }
        }
    }
    
    static void dumpMinNum(int[] arr, int min) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                arr[i] += 1;
                break;
            }
        }
    }

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
                dumpMaxNum(arr, getMaxNum(arr));
                dumpMinNum(arr, getMinNum(arr));
            }
            sb.append(getMaxNum(arr) - getMinNum(arr)).append("\n");
        }
        System.out.println(sb);
    }
}