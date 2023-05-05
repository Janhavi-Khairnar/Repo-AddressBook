package com.technospace.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

/***
 * 
 * @author Lenovo
 * Using ContactsOperation class, add and show Information inContacts.
 */

public class ContactsOperation {
					
	ArrayList<Contacts> contactsList = new ArrayList<Contacts>();
	
	Scanner sc = new Scanner(System.in);
	
	public void addContacts() {
		Contacts contacts = new Contacts();
		
		 sc = new Scanner(System.in);
		
		System.out.println("Enter the First Name :");
		contacts.setFirstName(sc.next());
		
		System.out.println("Enter the Last Name :");
		contacts.setLastName(sc.next());
		
		System.out.println("Enter the Address :");
		contacts.setAddress(sc.next());
		
		System.out.println("Enter the City :");
		contacts.setCity(sc.next());
		
		System.out.println("Enter the State :");
		contacts.setState(sc.next());
		
		System.out.println("Enter the Zip Code :");
		contacts.setZip(sc.next());
		
		System.out.println("Enter the Phone Number :");
		contacts.setPhoneNumber(sc.next());
		
		System.out.println("Enter the Email ID:");
		contacts.setEmail(sc.next());
		
		contactsList.add(contacts);
	}
	
	public void showContacts() {
		for(int j=0 ; j<contactsList.size() ; j++) {
				
				Contacts contacts = contactsList.get(j);
				
				System.out.println("First Name :"+contacts.getFirstName());
				System.out.println("Last Name :"+contacts.getLastName());
				System.out.println("Address :"+contacts.getAddress());
				System.out.println("City :"+contacts.getCity());
				System.out.println("State :"+contacts.getState());
				System.out.println("Zip Code :"+contacts.getZip());
				System.out.println("Phone Number :"+contacts.getPhoneNumber());
				System.out.println("Email ID :"+contacts.getEmail());
				System.out.println("#############################");
			}
				
		}
		
	
	public void updateContacts() {
	
		System.out.println("Enter the First Name for Update the Contact :");
		String fname = sc.next();
		
		for(int i = 0; i < contactsList.size(); i++)	{
			
			Contacts contacts = contactsList.get(i);
			
			if(fname.equals(contacts.getFirstName())) {
				System.out.println("Contact is available.");
				
				System.out.println("Enter the Last Name :");
				contacts.setLastName(sc.next());
				
				System.out.println("Enter the Address :");
				contacts.setAddress(sc.next());
				
				System.out.println("Enter the City :");
				contacts.setCity(sc.next());
				
				System.out.println("Enter the State :");
				contacts.setState(sc.next());
				
				System.out.println("Enter the Zip Code :");
				contacts.setZip(sc.next());
				
				System.out.println("Enter the Phone Number :");
				contacts.setPhoneNumber(sc.next());
				
				System.out.println("Enter the Email ID:");
				contacts.setEmail(sc.next());
			}
			contactsList.add(contacts);
		}
			
	}
		
	public void deleteContacts() {
			
			System.out.println("Enter the First Name for delete the Contact :");
			String fname = sc.next();
			
			for(int i = 0; i < contactsList.size(); i++)	{
				Contacts contacts = contactsList.get(i);
				if(fname.equals(contacts.getFirstName())){
					System.out.println("Contacts is available.");
					contactsList.remove(contacts);
					System.out.println("Contact is deleted.");
				}  else {
					System.out.println("Contact is not available.");
				}
			}
			
		}	
}
	



