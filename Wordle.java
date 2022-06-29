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
	        String str=sc.next();
	        String str1=sc.next();
	        String str2="";
	        if(str.length()==str1.length()) {
	        	for(int j=0;j<str.length();j++) {
	        		if(str.charAt(j)==(str1.charAt(j))) {
	        			str2=str2+"G";
	        		} else if(str.charAt(j)!=str1.charAt(j)){
	        			str2=str2+"B";
	        		}
	        	}
	        }
	        System.out.println(str2);	  
	    }
	}
}
