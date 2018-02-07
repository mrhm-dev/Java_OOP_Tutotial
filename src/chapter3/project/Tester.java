package chapter3.project;

public class Tester {

//    Contact List APP
//    We can create new contact
//    We can view list of contact
//    Search Contact
//    Delete Contact
//    Contact = name, email, phone
//    Contact Array
//    Insert, Search and Delete

    public static void main(String[] args) {
        Contact contact = new Contact("Twinkle Cats", "01711991199");
//        System.out.println(contact);
        Contact contact1 = new Contact("HM Nayem", "01718223344", "hm.nayem@gmail.com");

        ContactList contactList = new ContactList();
        contactList.createContact(contact);
        contactList.createContact(contact1);
        System.out.println(contactList);

        System.out.println(contactList.getTotalContact());

        Contact searchedContact = contactList.searchContact("Twinkle Cats");

        if (searchedContact != null) {
            System.out.println(searchedContact);
        } else {
            System.out.println("Contact Not Found");
        }

    }
}
