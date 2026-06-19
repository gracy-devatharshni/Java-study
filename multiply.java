//1054 ->1*5*4=20


import java.util.*;
public class multiply {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 1;
        while (n != 0) {
            int o = n % 10;
            if (o != 0) {
                ans *= o;
            }
            n /= 10;
        }
        System.out.println(ans);

        sc.close();
    }
    
}
