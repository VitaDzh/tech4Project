package accessModifiers.package2;

import accessModifiers.package1.Honda;


public class TestPackage2 extends Honda{ //TestPackage becomes a parent for Honda by extendign it
    public static void main(String[] args) {
        Honda h1 = new Honda();
       // Tesla t1 = new Tesla(); can not be created, because Tesla belongs to default class.
        // It can be only created in the created package
    }
}
