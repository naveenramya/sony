import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int x=m-n;
        if(x%2==0){
            System.out.print("even");
        }
        else{
            System.out.print("odd");
        }
    }
}
		
	
