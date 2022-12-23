import java.util.*;
import java.io.*;
class KadaneAlgorithm
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }     
        int max=0;
        int msf=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            max +=arr[i];
            if(max < arr[i])
            {
                max = arr[i];
            }
            if(msf < max)
            {
                msf=max;
            }
        }        
        System.out.println(msf);
    }
}