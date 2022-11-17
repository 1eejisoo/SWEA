import java.util.*;

class Solution {
    static int T, n, sec, count;
    static int[] people;
    static int bread;

    public static boolean logic() {
        int index = 0;

        for (int i = 0; i <= 11111; i++) {
            if (i !=0 && i % sec == 0) bread += count;
            if (people[index] == i) {
                if (people[index] < sec || bread == 0) return false;
                bread--; index++;
                if (index == people.length) return true;
            }
        }
        return true;
    }

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            sb.append("#").append(tc).append(" ");

            bread = 0;
            n = sc.nextInt(); // 오는 손님 수
            // sec초 마다 count개의 빵이 생산된다
            sec = sc.nextInt();
            count = sc.nextInt();
            people = new int[n];

            for (int i = 0; i < n; i++) {
                people[i] = sc.nextInt();
            }
            Arrays.sort(people);

            if (logic()) {
                sb.append("Possible");
            } else sb.append("Impossible");

            sb.append("\n");
        }
        System.out.println(sb);
    }
}