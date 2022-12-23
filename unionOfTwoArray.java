import java.util.*;
import java.io.*;
class unionOfTwoArray
{
    public static void UNION(int arr[],int n,int arr1[],int k)
    {
        HashSet<Integer> list=new HashSet<Integer>();
        for(int i=0;i<n;i++)
         {
             list.add(arr[i]);
         }
         for(int i=0;i<k;i++)
         {
             list.add(arr1[i]);
         }
        System.out.print(list);
    }
    public static void main(String args[]) throws Exception
    {
          int arr[]={1,2,3,4,5};
    int n=arr.length;
    int arr1[]={1,2,3,9};
    int k=arr1.length;
        UNION(arr,n,arr1,k);
    }
}
      
