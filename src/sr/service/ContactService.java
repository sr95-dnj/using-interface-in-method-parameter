package sr.service;

import sr.entity.Contact;
import sr.utils.CriteriaSearch;

import java.util.ArrayList;
import java.util.List;

public class ContactService {

    public List<Contact> findContact(List<Contact> contact, CriteriaSearch criteriaSearch){
        List<Contact> list = new ArrayList<>();
        for(Contact c : contact){
            if(criteriaSearch.match(c)){
                list.add(c);
            }
        }
        return list;
    }
}
