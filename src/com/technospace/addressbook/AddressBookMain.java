package com.technospace.addressbook;

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
		
		contactsOperation.addContacts();
		contactsOperation.showContacts();
	}

}
