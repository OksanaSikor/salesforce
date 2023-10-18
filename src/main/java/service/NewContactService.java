package service;

import model.Contact;
import pages.NewContactPage;
import pages.SavedContactPage;

public class NewContactService {

    private NewContactPage newContactPage = new NewContactPage();

    public SavedContactPage createContact(Contact contact){
        newContactPage.openContactPage()
                .fillInSalutation(contact)
                .fillInLastName(contact)
                .fillInPhone(contact)
                .clickSave();
        return new SavedContactPage();
    }
}
