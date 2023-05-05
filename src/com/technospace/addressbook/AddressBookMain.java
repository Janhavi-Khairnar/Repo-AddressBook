package com.technospace.addressbook;

import java.awt.Choice;
import java.util.HashMap;
import java.util.Scanner;

/***
 * 
 * @author Lenovo
 * AddressBookMain class is used for various operation on AddressBook.
 */
public class AddressBookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/***
		 * Welcome message for user
		 */
		System.out.println("Welcome to Address Book Program");
		
		/***
		 * Creating the object of the ContactsOperation class and 
		 * perform the various operation.
		 */
		
		
		Scanner sc = new Scanner(System.in);
		int choice;
		HashMap<String,ContactsOperation> contactsOperationMap = new HashMap<String,ContactsOperation>();
		
		do 
		{
			System.out.println("Which type of Address Book you have? :");
			String contactsOperationName = sc.next();
			
			
			ContactsOperation contactsOperation = new ContactsOperation();
			
			contactsOperationMap.put(contactsOperationName,contactsOperation);
			
			System.out.println("Enter the Address Book Contacts in which you want store the contacts :");
			String contactsOperationName2 = sc.next();
			
			ContactsOperation myAddressbook = contactsOperationMap.get(contactsOperationName2);
		
		
		do	{
				System.out.println("******Address Book Menu******");
				
				System.out.println("1)Add Contacts\n2)Show Contacts\n3)Update Contacts\n4)Delete Contacts");
				
				System.out.println("Enter the Choice :");
				choice = sc.nextInt();
				
				switch(choice){
				case 1:
						myAddressbook.addContacts();
					break;
				case 2:
						myAddressbook.showContacts();
					break;
				case 3:
						myAddressbook.updateContacts();
					break;
				case 4:
						myAddressbook.deleteContacts();
					break;
				default:
					System.out.println("Invaild number.");
					break;
			}
		}while(choice<5);
	}while(true);
		
	}
} 

