/*
If percentage >= 90% : Grade A
If percentage >= 80% : Grade B
If percentage >= 70% : Grade C
If percentage >= 60% : Grade D
If percentage >= 40% : Grade E
If percentage < 40%  : Grade F
*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int s1,s2,s3,s4,s5; 
	    float  percent;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the Five Subjects Marks: ");
		s1 = s.nextInt();	
		s2 = s.nextInt();	
		s3 = s.nextInt();	
		s4 = s.nextInt();	
		s5 = s.nextInt();	
	    percent=((s1+s2+s3+s4+s5)/5);    
	    System.out.println("Percentage=" +percent);
	    
	    if(percent >= 90)
            System.out.println("Grade A");
    
        else if(percent >= 80)
            System.out.println("Grade B");
    
        else if(percent>= 70)
            System.out.println("Grade C");
                
        else if(percent>= 60)
            System.out.println("Grade D");
                 
        else if(percent>= 40)
            System.out.println("Grade E");
                  
        else
            System.out.println("Grade F");
	}
}

/* OUTPUT:

Enter the Five Subjects Marks: 
44 90 83 91 60
Percentage=73.0
Grade C

Enter the Five Subjects Marks: 
90 90 94 97 88
Percentage=91.0
Grade A




*/
