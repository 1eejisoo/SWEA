import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.Scanner;

class Solution1
{
    public static void main(String args[]) throws Exception
    {

        System.setIn(new FileInputStream("res/input.txt"));
        System.setOut(new PrintStream("res/output.txt"));

        String str = "";
        StringBuilder sb = new StringBuilder();

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            str = sc.next();
            sb.append("#").append(test_case).append(" ");

            char c = 'a';
            int count = 0;

            for (int i = 0; i<str.length(); i++) {
                if (str.charAt(i) == c)
                    count+=1;
                else break;
                c+=1;
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}