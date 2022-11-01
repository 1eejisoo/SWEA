import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Solution
{
    public static void main(String args[]) throws Exception
    {
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        String str = "";
        List<String> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            str = sc.next();
            for (int i = 0; i<str.length(); i++) {
                if (str.charAt(i) == alpha.charAt(i))
                    list.add(String.valueOf(alpha.charAt(i)));
                else break;
            }
            System.out.println("#" + test_case + " "  + list.size());
            list.clear();

        }
    }
}