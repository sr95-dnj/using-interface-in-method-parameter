package sr.utils;

import sr.entity.Contact;

public interface CriteriaSearch {

    boolean match(Contact contact);

    default boolean match2(Contact contact) {
        return true;
    }



}
