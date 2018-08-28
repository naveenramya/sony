import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n/2;
        int flag=0;
        if(n==0 || n==1){
            System.out.print("no");
        }
        else{
            for(int i=2;i<m;i++){
                if(n%i==0){
                    System.out.print("no");
                    flag=1;
                    break;
                }
            }
        if(flag==0){
            System.out.print("yes");
        }
        }
    }
}


		
	
