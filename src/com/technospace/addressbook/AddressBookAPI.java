package com.technospace.addressbook;

import java.util.Scanner;

	public class AddressBookAPI {
		
		Scanner sc = new Scanner(System.in);
		int no;
		
		public void contactsOperation(ContactsOperation myAddressbook)	{
			
			do
			{
				System.out.println("**Contacts Menu**");
				System.out.println("1.Add Contacts \n2.Show Contacts \n3.Edit Contacts \n4.Delete Contacts");
				System.out.println("Enter the Option :");
				no = sc.nextInt();
			
				switch(no)
				{
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
						System.out.println("Enter the Valid Number.");
					break;
			}
		}
		while(no<5);

	}
}


