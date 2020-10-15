/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	//	System.out.println("Hello World");
		Scanner s=new Scanner(System.in);
	System.out.println("Enter the number of elements of the array");
	int n=s.nextInt();
	int sum=0;
	int arr[]=new int[n];
	 for(int i=0;i<n;i++){
	     System.out.println("Enter the " +(i+1)+ " element");
	     arr[i]=s.nextInt();
	     sum=sum+arr[i];
	 }
	     System.out.println("The sum of the array elements is :" +sum);
	}
}
/*OUTPUT

Enter the number of elements of the array                                                                                       
5                                                                                                                               
Enter the 1 element                                                                                                             
5                                                                                                                               
Enter the 2 element                                                                                                             
7                                                                                                                               
Enter the 3 element                                                                                                             
4                                                                                                                               
Enter the 4 element                                                                                                             
11                                                                                                                              
Enter the 5 element                                                                                                             
23                                                                                                                              
The sum of the array elements is :50   


Enter the number of elements of the array                                                                                       
7                                                                                                                               
Enter the 1 element                                                                                                             
100                                                                                                                             
Enter the 2 element                                                                                                             
203                                                                                                                             
Enter the 3 element                                                                                                             
359                                                                                                                             
Enter the 4 element                                                                                                             
472                                                                                                                             
Enter the 5 element                                                                                                             
589                                                                                                                             
Enter the 6 element                                                                                                             
638                                                                                                                             
Enter the 7 element                                                                                                             
766                                                                                                                             
The sum of the array elements is :3127                                                                                          
                                           

*/