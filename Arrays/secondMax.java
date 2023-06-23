import java.util.*;

public class secondMax {

    public static void smaxelement(int[] arr) {

        int smax = arr[0];
        int max = arr[0];

        for (int x : arr) {
            max = Math.max(max, x);
            if (x != max) {
                smax = Math.max(smax, x);
            }
        }

        System.out.println("Second maximum Element Using Loop is : " + smax);

    }

    public static void smaxelementstream(int arr[]) {
        int ans = Arrays
                .stream(arr)
                .sorted()
                .skip(arr.length - 2)
                .findFirst()
                .getAsInt();

        System.out.println("Maximun element using stream : " + ans);
    }

    public static void main(String[] args) {

        smaxelement(new int[] { 1, 5, 3, 7, 89, 33 });
        smaxelementstream(new int[] { 1, 5, 3, 7, 89, 33 });
    }

}
