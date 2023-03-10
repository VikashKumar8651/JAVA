import java.util.*;
import java.io.*;
class minimum_path_sum
{
    public static void main(String args[]) throws Exception
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][] array=new int[n][m];
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array[0].length;j++)
            {
                array[i][j]=sc.nextInt();
            }
        }
       int [][] dp = new int[n][m];
         for(int i=dp.length-1;i>=0;i--)
        {
            for(int j=dp[0].length-1;j>=0;j--)
            {
                if(i==dp.length-1 && j==dp[0].length-1)
                {
                    dp [i][j]=array[i][j];
                }else if(i==dp.length-1)
                {
                    dp [i][j]=dp [i][j+1]+array[i][j];
                }else if(j==dp[0].length-1) 
                {
                     dp [i][j]=dp [i+1][j]+array[i][j];
                }else{
                     dp [i][j]=Math.min(dp [i+1][j],dp [i][j+1])+array[i][j];
                }
            }
        } 
        System.out.println("minimum path sum := "+dp[0][0]);
          

        
    }
}