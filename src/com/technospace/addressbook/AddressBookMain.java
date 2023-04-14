package com.technospace.addressbook;

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
		ContactsOperation contactsOperation = new ContactsOperation();
		int no;
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.println("**Contacts Menu**");
			System.out.println("1.Add Contacts \n2.Show Contacts \n3.Edit Contacts \n4.Delete Contacts");
			System.out.println("Enter the Option :");
			no = sc.nextInt();
		
			switch(no)
			{
				case 1:
					contactsOperation.addContacts();
				break;
				case 2:
					contactsOperation.showContacts();
				break;
				case 3:
					contactsOperation.updateContacts();
				break;
				case 4:
				
				break;
			
				default:
					System.out.println("Enter the Valid Number.");
				break;
			}
		}
		while(no<5);
	}

}
