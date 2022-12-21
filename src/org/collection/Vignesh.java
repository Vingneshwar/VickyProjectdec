package org.collection;
import java.util.Scanner;

public class Vignesh {
	
  public static void main(String[] args) {
	
	  Scanner s=new Scanner(System.in);
	  
	  System.out.println("Enter the age");
	  byte age=s.nextByte();
	  System.out.println("my ageis"+age);

	  System.out.println("Enter the atmpin");
	  short atmpin=s.nextShort();
	  System.out.println("my atmpin is"+atmpin);
	  
	  System.out.println("enter the pincode");
	  int pincode=s.nextInt();
	  System.out.println("my pincode is"+pincode);
	  
	  System.out.println("enter the phone");
	  long phone=s.nextLong();
	  System.out.println("my phone is"+phone);
	  
	  System.out.println("enter the salary");
	  float salary=s.nextFloat();
	  System.out.println("my salary is"+salary);
	  
	  System.out.println("enter the loan");
	  double loan=s.nextDouble();
	  System.out.println("my loan is"+loan);
	  
	  System.out.println("enter the name");
	  String name=s.next();
	  System.out.println("my name is"+name);
	  
	  System.out.println("enter the code");
	  boolean code=s.nextBoolean();
	  System.out.println("my code is"+code);
	  
	  String n=s.next();
	  char gender=n.charAt(0);
	  System.out.println("my gender is"+gender);
	  
	  
	  
	  
	  
	  
	  
	  
}

}
