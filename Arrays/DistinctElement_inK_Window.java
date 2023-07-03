import java.util.*;

class DistinctElement_inK_Window {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 4, 6, 6, 7, 7 };
        int k = 4;

        ArrayList<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        ans.add(map.size());

        int ind = 0;

        for (int i = k; i < arr.length; i++) {

            map.put(arr[ind], map.getOrDefault(arr[ind], 1) - 1);

            if (map.get(arr[ind]) == 0) {
                map.remove(arr[ind]);
            }

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            ans.add(map.size());
            ind++;
        }

        System.out.println(ans);

    }
}