package com.bridgelabz;
import java.util.*;

public class Contacts {
	public static String first_name;
	public static String last_name;
	public static String Address;
	public static String city;
	public static String state;
	public static int zip;
	public static long phone_number;
	public static String email;
	public Contacts(String first_name, String last_name,String Address,String city,String state,long phone_number,String email) {
		this.first_name=first_name;
		this.last_name=last_name;
		this.Address=Address;
		this.city=city;
		this.state=state;
		this.zip=zip;
		this.phone_number=phone_number;
		this.email=email;
		
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first name");
		first_name=sc.next();
		System.out.println("enter the last name");
		last_name=sc.next();
		System.out.println("enter the Address");
		Address=sc.next();
		System.out.println("enter the city");
		city=sc.next();
		System.out.println("enter the state");
		state=sc.next();
		System.out.println("enter the zip");
		zip=sc.nextInt();
		System.out.println("enter the phone number");
		phone_number=sc.nextInt();
		System.out.println("enter the email");
		email=sc.next();
		
		
		Contacts c1=new Contacts(first_name,last_name,Address,city,state,phone_number,email); 
		System.out.println("my name is :"+c1.first_name+" "+c1.last_name+"\nAddress: "+c1.Address+".\nmy city :"+c1.city+"\nmy state"+c1.state+"\nphone number:"+c1.phone_number+"\nemail"+c1.email);
		
	}
	}