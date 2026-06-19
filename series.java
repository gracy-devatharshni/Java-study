//1,2,1,3,2,5,3,7,5,11,8,13,.....(fibonnaci+prime) n=10 op:11
//n : odd->fibo(n/2)+1  even->prime(n/2) 

import java.util.*;

public class series {
    public static int fibo(int n) {
        int f = 1, s = 1, t = 1;
        int count = 2;
        while (count < n) {
            t = f + s;
            f = s;
            s = t;
            count++;
        }
        return t;
    }
/* 
    public static int prime(int n) {// 4 [2,3,5,7,11,..] 7
        int count = 1;
        int k = 2;

        while (count <= n) {
            boolean prime = true;
            for (int i = 2; i * i <= k; i++) {
                if (k % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                count++;
            }

            k++;

        }

        return k - 1;
    }
        */

    /*
     * public static int prime(int n) {
     * int count = 0;
     * int k = 2;
     * 
     * while (true) {
     * boolean prime = true;
     * 
     * for (int i = 2; i <= Math.sqrt(k); i++) {
     * if (k % i == 0) {
     * prime = false;
     * break;
     * }
     * }
     * 
     * if (prime) {
     * count++;
     * if (count == n) {
     * return k;
     * }
     * }
     * 
     * k++;
     * }
     * }
     */

    public static int prime(int n){
        int k=2;
        int count = 1;
        while(count<=n){
            boolean prime = true;
            for(int i=2;i<=Math.sqrt(n);i++){
                if(k%i==0){
                    prime = false;
                    break;
                }
            }
            if(prime){
                count++;
            }
            k++;
        }
        return k-1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println(prime(n / 2));
        } else {
            System.out.println(fibo(n / 2 + 1));
        }

    }
}
