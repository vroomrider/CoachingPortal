package org.example.practicals.coaching.basic.access.spicifiers.packagelevel;

import org.example.practicals.coaching.basic.access.spicifiers.AccessSpecifiers;

public class PackageLevel {

    public static void main(String[] args) {

        AccessSpecifiers accessSpecifiers = new AccessSpecifiers();

        System.out.println(accessSpecifiers.publicVariable);

        accessSpecifiers.publicMethod();
    }

}
