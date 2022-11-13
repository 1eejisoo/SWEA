import java.util.*;

class Solution
{
    public static List<Integer> cycle(List<Integer> list) {
        int temp = 0;
    
        while (true) {
            for (int count = 1; count <= 5; count++) {
                temp = list.get(0)-count;
                list.remove(0);
                list.add(temp);

                if (list.get(list.size()-1) < 0 ||
                        list.get(list.size()-1) == 0) {
                    list.set(list.size()-1, 0);
                    return list;
                }
            }
        }
    }
    
    public static void main(String args[]) throws Exception
     {  
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        List<Integer> list;
        int n;
        
        for (int tc = 1; tc <= 10 ; tc++) {
            sb.append("#").append(sc.nextInt()).append(" ");
            list = new ArrayList<>();
            
            for (int i = 0; i < 8; i++) {
                list.add(sc.nextInt());
            }
            
            list = cycle(list);
            
            for (int number : list) {
                sb.append(number).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
     }
}