package practical;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AddressBook {
    public ArrayList<Contact> phoneList;

    public void addContact(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Name");
        String name = sc.nextLine();
        System.out.println("Phone");
        String phone = sc.nextLine();
        Contact c = new Contact();
        c.info.put("ContactName",name);
        c.info.put("PhoneNumber",phone);
        phoneList.add(c);
    }
}
