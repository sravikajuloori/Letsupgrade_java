/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Scanner s=new Scanner(System.in);
		int arr[]=new int[5];
		for(int i=0;i<5;i++){
		    System.out.println("Enter the "+(i+1)+ " element");
		    arr[i]=s.nextInt();
		   // if((arr[i]%2)!=0)
		           // System.out.println(arr[i]);
		}
		System.out.println("Odd numbers in the array are:");
		for(int i=0;i<5;i++){
		    if((arr[i]%2)!=0)
		            System.out.println(arr[i]);
		}
		
	}
}
/*OUTPUT:
Enter the 1 element                                                                                                             
68                                                                                                                              
Enter the 2 element                                                                                                             
39                                                                                                                              
Enter the 3 element                                                                                                             
77                                                                                                                              
Enter the 4 element                                                                                                             
93                                                                                                                              
Enter the 5 element                                                                                                             
52                                                                                                                              
Odd numbers in the array are:                                                                                                   
39                                                                                                                              
77                                                                                                                              
93          



Enter the 1 element                                                                                                             
1087                                                                                                                            
Enter the 2 element                                                                                                             
2984                                                                                                                            
Enter the 3 element                                                                                                             
3073                                                                                                                            
Enter the 4 element                                                                                                             
45555                                                                                                                           
Enter the 5 element                                                                                                             
5665                                                                                                                            
Odd numbers in the array are:                                                                                                   
1087                                                                                                                            
3073                                                                                                                            
45555                                                                                                                           
5665              

*/
