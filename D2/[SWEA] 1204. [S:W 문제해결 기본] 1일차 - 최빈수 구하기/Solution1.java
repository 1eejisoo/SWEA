import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

class Solution
{
    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int T;
        T = Integer.parseInt(br.readLine());

        for(int test_case = 1; test_case <= T; test_case++)
        {
            sb.append("#").append(br.readLine()).append(" ");
            st = new StringTokenizer(br.readLine());

            List<String> tmp = new ArrayList<>();

            while(st.hasMoreTokens()){
                tmp.add(st.nextToken());
            }

            List<Integer> numsList = tmp.stream().map(Integer::parseInt).collect(Collectors.toList()); // List<String> to List<Integer>
            List<Integer> frequencyList = new ArrayList<>();

            for (int n : numsList) {
                frequencyList.add(Collections.frequency(numsList, n));   // numsList 값들의 빈도수를 담는다
            }

            // frequencyList에서 최대값의 인덱스를 찾고, 그 인덱스를 이용해서 numsList에서 값을 찾는다.
            sb.append(numsList.get(frequencyList.indexOf(Collections.max(frequencyList)))).append("\n");
        }
        System.out.println(sb);
    }

}