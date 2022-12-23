import java.util.*;
import java.lang.*;
class KthMinimumElemnetOfArray
{
    public static void kthSmallest(int[] arr,int k, int n) 
    { 
        // Arrays.sort(arr);
        // return arr[k-1];
          TreeSet<Integer> al=new TreeSet<Integer>(); 
          for(int i=0;i<n;i++)
          {
              al.add(arr[i]);
          }
         ArrayList<Integer> as=new ArrayList<Integer>(al);
         
          System.out.println(as.get(k-1));
        //Your code here
    } 
    public static void main(String args[]) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k;
        System.out.print("Enter the Kth element:");
        k=sc.nextInt();
        kthSmallest(arr,k,n);
    }
}