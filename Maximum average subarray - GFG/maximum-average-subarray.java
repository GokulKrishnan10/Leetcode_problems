// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int k = Integer.parseInt(inputLine[0]);
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().findMaxAverage(arr, n, k);
            for(int i=ans; i<ans+k; i++)
                System.out.print(arr[i]+" ");
            System.out.println();
        }
    }
}
// } Driver Code Ends
//User function Template for Java
class Solution {
    int findMaxAverage(int[] arr, int n, int k) {
        // code here
        int sum=0;
        if(k>n){
           k=n;   
        }
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
     //   System.out.println("Sum: "+sum);
        int max=sum,maxIn=0;
        for(int i=0;i<n-k;i++){
            sum-=arr[i];
            sum+=arr[i+k];
           // System.out.println("Sum: "+sum);
            if(sum>max){
                max=sum;
                maxIn=i+1;
            }
        }

        return maxIn;
    }
}
