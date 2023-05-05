package com.technospace.addressbook;


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
		
		Scanner sc = new Scanner(System.in);
		int choice;
		HashMap<String,ContactsOperation> contactsOperationMap = new HashMap<String,ContactsOperation>();
		
		do 
		{
			System.out.println("******Address Book Menu******");
			System.out.println("1)Create New Address Book\n2)Show Address Book\n3)Select Address Book"
					+ "\n4)Update Address Book\n5)Delete Address Book");
			
			System.out.println("Enter the Choice :");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
					System.out.println("Which type of Address Book you have? :");
					String contactsOperationName = sc.next();
					ContactsOperation contactsOperation = new ContactsOperation();
					contactsOperationMap.put(contactsOperationName,contactsOperation);
				break;
			case 2:
					System.out.println(contactsOperationMap.keySet());
				break;
			case 3:
				System.out.println("Enter the Address Book Name in which you want to store the contacts :");
				String contactsOperationName2 = sc.next();
				ContactsOperation myAddressbook = contactsOperationMap.get(contactsOperationName2);
				AddressBookAPI addressBookAPI = new AddressBookAPI();
				addressBookAPI.contactsOperation(myAddressbook);
				break;
			case 4:
				break;
			case 5:
				break;
			}
		}while(choice<5);
			
	}			
}			
			
			
			
	
