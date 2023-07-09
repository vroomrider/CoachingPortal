package org.example.practicals.coaching.basic.access.spicifiers;

public class ClassLevel {

    public static void main(String[] args) {

        AccessSpecifiers accessSpecifiers = new AccessSpecifiers();

        System.out.println(accessSpecifiers.defaultVariable);
        System.out.println(accessSpecifiers.protectedVariable);
        System.out.println(accessSpecifiers.publicVariable);

        accessSpecifiers.defaultMethod();
        accessSpecifiers.protectedMethod();
        accessSpecifiers.publicMethod();

    }
}
