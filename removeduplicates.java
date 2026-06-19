import java.util.*;

public class removeduplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");

        ArrayList<Integer> arr = new ArrayList<>();

        for (String s : input) {
            arr.add(Integer.parseInt(s));
        }

        LinkedHashSet<Integer> set = new LinkedHashSet<>(arr);

        arr = new ArrayList<>(set);

        System.out.println(arr);

    }

}
