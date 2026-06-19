//[1,2,3,4]   [9,7,6,5,4,4,,3]

import java.util.*;
public class merge {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[] arr1= new int[n];
        int[] arr2= new int[m];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }

        int a=0,b=arr2.length-1,k=0;
        int[] ans = new int[arr1.length+arr2.length];
        while(a<n && b>=0){
            if(arr1[a]<arr2[b]){
                ans[k]=arr1[a];
                k++;
                a++;
            }
            else{
                ans[k]=arr2[b];
                b--;
                k++;
            }
        }
        while(a<n){
            ans[k++]=arr1[a++];
        }
        while(b>=0){
            ans[k++]= arr2[b--];
            
        }

        System.out.println(Arrays.toString(ans));
        
    }
}
