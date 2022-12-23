// rotation of array
import java.util.*;
class rotationofarray{


    public static void reverse(int[] array, int i,int j)
    {
        int li=i;
        int ri=j;
        while(li<ri){
            
            int temp=array[li];
            array[li]=array[ri];
            array[ri]=temp;
            li++;
            ri--;

        }
    }


    public static void rotate(int[] array, int k){
    
    k=k%array.length;
    if(k<0)
    {
        k=k+array.length;
    }
    reverse(array,0,array.length-k-1);
     
    reverse(array,array.length-k,array.length-1);
     
    reverse(array,0,array.length-1);
    }

    public static void main(String[] args) throws
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter numer");
        int n=sc.nextInt();
        System.out.println("enter the element of array");
        int array=new int[n];
        for(int i=0; i<n; i++)
        {
            array[i]=sc.nextInt();
        }
        System.out.println("enther the no of times to rotate"); 
        int k=sc.nextInt();
        rotate(array,k);
        display(array);
    }
}