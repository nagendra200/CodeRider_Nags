Input Format
First line will contain T, number of test cases. Then the test cases follow.
First line of each test case consists of an integer NN - denoting the size of array AA.
Second line of each test case consists of NN space-separated integers A_1, A_2, \dots, A_NA 
  - denoting the array AA.
Output Format
For each test case, output the minimum number of operations required to make all the elements equal.
input:-                                 output:-
4                                        2
3                                        0
1 2 3                                    2
4                                        1
5 5 5 5
4
2 2 1 1
3
1 1 2
  
  
  
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    for(int i=0;i<t;i++){
	        int n=sc.nextInt();
	        int[] arr=new int[n];
	        for(int j=0;j<n;j++){
	            arr[j]=sc.nextInt();
	        }
	        int temp,count;
	        count=0;
	 
	        for(int j=0;j<n;j++)
		    {
		        temp=0;
		       for(int k=j;k<n;k++)
		       {
		           if(arr[j]==arr[k])
		           temp++;
		       }
		       if(temp>count)
		       count=temp;
		     }
		    int w=n-count;
	         System.out.println(w);
	    }
	}
}
