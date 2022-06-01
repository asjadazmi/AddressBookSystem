package com.bridgelabz;

public class AddressBookMain{
	public static void main(String[] args) {
		System.out.println("welcome to the Adress book Program");
		Contact c1=new Contact(first_name,last_name,Address,city,state,phone_number,email); 
		System.out.println("my name is :"+c1.first_name+" "+c1.last_name+"\nAddress: "+c1.Address+".\nmy city :"+c1.city+"\nmy state"+c1.state+"\nphone number:"+c1.phone_number+"\nemail"+c1.email);
		
	}
}
