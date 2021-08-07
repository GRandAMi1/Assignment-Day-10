package com.blz.addressbook;

import java.util.ArrayList;

public class AddressBook {

    public static String[] index = {"First Name", "Last Name", "Address", "City", "State", "Zip Code", "Mobile Number", "Email ID"};

    public static void main(String[] args) {
        ArrayList<String> fName = new ArrayList<>();
        ArrayList<String> sName = new ArrayList<>();
        ArrayList<String> adrs = new ArrayList<>();
        ArrayList<String> city = new ArrayList<>();
        ArrayList<String> state = new ArrayList<>();
        ArrayList<String> zipCode = new ArrayList<>();
        ArrayList<String> no = new ArrayList<>();
        ArrayList<String> mail = new ArrayList<>();

        ArrayList<ArrayList<String>> addBook = new ArrayList<>();
        addBook.add(fName);
        addBook.add(sName);
        addBook.add(adrs);
        addBook.add(city);
        addBook.add(state);
        addBook.add(zipCode);
        addBook.add(no);
        addBook.add(mail);

        System.out.print("How many Details you want to enter : ");
        int temp = UserInputUtils.intInput();

        InterAddressBook impl2 = new UserInput();
        impl2.UserInputs(temp,addBook,index);

        InterAddressBook impl = new DisplyOutput();
        impl.Display(temp,addBook,index);
    }

}