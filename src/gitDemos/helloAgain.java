package gitDemos;

import java.util.Scanner;

public class helloAgain {

	public static void main(String[] args) {
		
		System.out.println("Lets reverse the given String");
		
		System.out.println("Enter any String");
		
		Scanner sc= new Scanner (System.in);
		
		String A= sc.next();
		
		String rev= "";
		
		for (int i=A.length()-1; i>=0;i--) {
			
			rev+= A.charAt(i);
			
		}
		
		System.out.println(rev);
		System.out.println("I m adding this on new branch");
	}

}
