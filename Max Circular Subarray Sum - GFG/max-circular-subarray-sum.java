// { Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());// input size of array
		    int arr[] = new int[n];
		    String inputLine2[] = br.readLine().trim().split(" ");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine2[i]); // input elements of array
		    }
		    
		    Solution obj = new Solution();
		    
		    System.out.println(obj.circularSubarraySum(arr, n));// print the circularSubarraySum
		}
	}
}


// } Driver Code Ends


class Solution{

    // a: input array
    // n: size of array
    //Function to find maximum circular subarray sum.
    static int circularSubarraySum(int a[], int n) {
        
        // Your code here
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
        }
        int max=a[0],max1=a[0],min=a[0],min1=a[0];
        for(int i=1;i<n;i++){
            max=Math.max(max+a[i],a[i]);
            max1=Math.max(max,max1);
            min=Math.min(min+a[i],a[i]);
            min1=Math.min(min,min1);
        }
        if(min1==sum){
            return max1;
        }
        return Math.max(max1,sum-min1);
    }
    
}

