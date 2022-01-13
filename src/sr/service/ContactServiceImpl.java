package sr.service;

import sr.entity.Contact;
import sr.enums.Gender;
import sr.utils.CriteriaSearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ContactServiceImpl {


    public static void main(String[] args) {
        ContactService contactService = new ContactService();

        List<Contact> list = Arrays.asList(new Contact(1,"Siddiquer", "siddiquer@gmail.com", Gender.MALE, "Dinajpur",23),
                new Contact(2,"Rakibul", "siddiquer@gmail.com", Gender.MALE, "Dhaka", 43),
                new Contact(3,"Fahim", "siddiquer@gmail.com", Gender.MALE, "Dinajpur", 45),
                new Contact(4,"Shariful", "siddiquer@gmail.com", Gender.MALE, "Dhaka", 15));


        /// using inner class.........................
        List<Contact> contactList = contactService.findContact(list, new CriteriaSearch() {
            @Override
            public boolean match(Contact contact) {
                return contact.getAddress() == "Dhaka";
            }
        });

        System.out.println(contactList);


        ///   using lamda expresion.........................
        List<Contact> numberList = contactService.findContact(list, (Contact contact)-> 18 <= contact.getAge() && contact.getName() == "Siddiquer");

        System.out.println(numberList);
    }




}
