import java.util.*;
class MinimumNumberOfJumps
{
    public static void main(String[] args) throws Exception
    {
        int arr[]={1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
         int n=arr.length;
        if(n==1)
        System.out.println(0);
        if(arr[0]==0)
       System.out.println(-1);
        int rng=arr[0];
        int sl=arr[0];
        int jp=1;
        for(int i=1;i<n;i++){
            if(i==n-1)
            System.out.println(jp);
            rng=Math.max(rng,i+arr[i]);
            sl--;
            if(sl==0){
                jp++;
                if(rng<=i)
                System.out.println(-1);
                sl=rng-i;
            }
        }
        // return -1;
    }
}

