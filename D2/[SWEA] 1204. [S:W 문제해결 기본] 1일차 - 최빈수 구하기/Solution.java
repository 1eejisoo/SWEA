import java.util.*;
import java.util.stream.Collectors;

class Solution
{
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            sb.append("#").append(sc.nextInt()).append(" ");
            sc.nextLine();

            String[] tmp = sc.nextLine().split(" ");
            int[] nums = Arrays.stream(tmp).mapToInt(Integer::parseInt).toArray();   // String 배열 tmp를 int 배열로 변환
            List<Integer> numsList = Arrays.stream(nums).boxed().collect(Collectors.toList()); // int 배열 nums를 리스트로 변환
            List<Integer> frequencyList = new ArrayList<>();

            for (int n : nums) {
                frequencyList.add(Collections.frequency(numsList, n));   // numsList 값들의 빈도수를 담는다
            }
            
            // frequencyList에서 최대값의 인덱스를 찾고, 그 인덱스를 이용해서 numsList에서 값을 찾는다.
            sb.append(numsList.get(frequencyList.indexOf(Collections.max(frequencyList)))).append("\n");   
        }
        System.out.println(sb);
    }

}