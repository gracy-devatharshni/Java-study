import java.util.*;

class combination {
    public static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int a = sc.nextInt();
        int b = sc.nextInt();

        char c= sc.next().charAt(1);

        int ncp = fact(x) / (fact(a) * fact(x - a));
        int nce = fact(y) / (fact(b) * fact(y - b));

        System.out.println(ncp * nce);

    }
}
