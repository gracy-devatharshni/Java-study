// 1,2,3,4,5,6,7  R-2   op->,6,7,1,2,3,4,5
//1,2,3,4,5,6,7  l-2    op->3,4,5,6,7,1,2    
// 

import java.util.*;
class rotate{

    public static void reverse(int start,int end,int[] arr){
    
        while(start<end){
            int temp = arr[start];
            arr[start++]=arr[end];
            arr[end--]=temp;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char dir = sc.next().charAt(0);
        int k = sc.nextInt();
        int[] arr = {1,2,3,4,5,6,7};
        if(dir=='l'){
            k=k%arr.length;
        }
        else{
            k=(arr.length-k)%arr.length;
        }

        reverse(0,k-1,arr);
        reverse(k,arr.length-1,arr);
        reverse(0,arr.length-1,arr);
        System.out.println(Arrays.toString(arr));

    }
}