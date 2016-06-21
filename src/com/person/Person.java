package com.person;

/**
 * Created by Mikron.Licud on 20/06/2016.
 */
public class Person implements IPerson {

    private String name = "";

    private String address = "";


    @Override
    public void printName() {
        System.out.println(name);
    }

    @Override
    public void printAddress() {
        System.out.println(address);
    }

    @Override
    public void setName(String _name) {
        name = _name;
    }

    @Override
    public void setAddress(String _address) {
        address = _address;
    }
}
