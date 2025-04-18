//{ Driver Code Starts
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.getSecondLargest(arr);
            System.out.println(ans);
            System.out.println("~");
        }
        sc.close();
    }
}
// } Driver Code Ends

//{ User function Template for Java
class Solution {
    public int getSecondLargest(int[] a) {
        int largest = -1;
        int second = -1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest) {
                second = largest;
                largest = a[i];
            } else if (a[i] < largest && a[i] > second) {
                second = a[i];
            }
        }

        return second;
    }
}
// } Driver Code Ends
