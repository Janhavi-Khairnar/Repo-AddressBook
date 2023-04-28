package com.technospace.addressbook;

import java.util.Scanner;

/***
 * 
 * @author Lenovo
 * Using ContactsOperation class, add and show Information inContacts.
 */

public class ContactsOperation {
					//int a[5]; (in c)   int[] a = new int[5]; (in java)
	Contacts[] contacts = new Contacts[5];
					//contacts[0], contacts[1], contacts[2], contacts[3], contacts[4]
	int i = 0;
	Scanner sc;
	
	public void addContacts() {
		contacts[i] = new Contacts();
		 sc = new Scanner(System.in);
		
		System.out.println("Enter the First Name :");
		contacts[i].setFirstName(sc.next());
		
		System.out.println("Enter the Last Name :");
		contacts[i].setLastName(sc.next());
		
		System.out.println("Enter the Address :");
		contacts[i].setAddress(sc.next());
		
		System.out.println("Enter the City :");
		contacts[i].setCity(sc.next());
		
		System.out.println("Enter the State :");
		contacts[i].setState(sc.next());
		
		System.out.println("Enter the Zip Code :");
		contacts[i].setZip(sc.next());
		
		System.out.println("Enter the Phone Number :");
		contacts[i].setPhoneNumber(sc.next());
		
		System.out.println("Enter the Email ID:");
		contacts[i].setEmail(sc.next());
		i++;
	}
	public void showContacts() {
		
		if(contacts == null)
		{
			System.out.println("Contacts object is not available.");
		}  else{
			for(int i=0 ; i<=4 ; i++) {
				System.out.println("First Name :"+contacts[i].getFirstName());
				System.out.println("Last Name :"+contacts[i].getLastName());
				System.out.println("Address :"+contacts[i].getAddress());
				System.out.println("City :"+contacts[i].getCity());
				System.out.println("State :"+contacts[i].getState());
				System.out.println("Zip Code :"+contacts[i].getZip());
				System.out.println("Phone Number :"+contacts[i].getPhoneNumber());
				System.out.println("Email ID :"+contacts[i].getEmail());
			}
		}
		
	}
	
	/*public void updateContacts() {
	
		if(contacts == null) {
			System.out.println("Contacts object is not available.");
		} else {
			System.out.println("Enter the First Name :");
			String fname = sc.next();
			
			if(fname.equals(contacts[i].getFirstName())) {
				System.out.println("Contact is available.");
				
				System.out.println("Enter the Last Name :");
				contacts[i].setLastName(sc.next());
				
				System.out.println("Enter the Address :");
				contacts[i].setAddress(sc.next());
				
				System.out.println("Enter the City :");
				contacts[i].setCity(sc.next());
				
				System.out.println("Enter the State :");
				contacts[i].setState(sc.next());
				
				System.out.println("Enter the Zip Code :");
				contacts[i].setZip(sc.next());
				
				System.out.println("Enter the Phone Number :");
				contacts[i].setPhoneNumber(sc.next());
				
				System.out.println("Enter the Email ID:");
				contacts[i].setEmail(sc.next());
			}  else{
				System.out.println("Contact is not available.");
			}
		}
		
	}
		public void deleteContacts() {
			
			System.out.println("Enter the First Name for delete the Contact :");
			String fname = sc.next();
			
			if(fname.equals(contacts[i].getFirstName())){
				System.out.println("Contacts is available.");
				contacts = null;
				System.out.println("Contact is deleted.");
			}  else {
				System.out.println("Contact is not available.");
			}
				*/
		
	
	

}

