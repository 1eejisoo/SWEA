import java.util.Scanner;

class Solution
{
    static int count(String search, String target) {
        return (search.length() - search.replace(target, "").length()) / target.length();
    }
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String target, search;
        int T;

        for (int tc = 1; tc <= 10; tc++)
        {
            T = sc.nextInt();
            target = sc.next();   // 개수를 셀 문자열
            search = sc.next();   // 주어진 문자열

            sb.append("#").append(T).append(" ").append(count(search, target)).append("\n");
        }
        System.out.println(sb);
    }
}