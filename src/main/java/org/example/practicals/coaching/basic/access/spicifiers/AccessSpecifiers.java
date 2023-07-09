package org.example.practicals.coaching.basic.access.spicifiers;

public class AccessSpecifiers {

    /*
        Access Range
        __________________________________________
        private                         -
        default(not keyword)          -----
        protected                  -----------
        public                  -----------------

     */

    private static String privateStaticVariable;
    static String defaultStaticVariable;
    protected static String protectedStaticVariable;
    public static String publicStaticVariable;

    private String privateVariable;
    String defaultVariable;
    protected String protectedVariable;
    public String publicVariable;


    public static void main(String[] args) {
        // calling static methods
        privateStaticMethod();
        defaultStaticMethod();
        protectedStaticMethod();
        publicStaticMethod();

        System.out.println(privateStaticVariable);
        System.out.println(defaultStaticVariable);
        System.out.println(protectedStaticVariable);
        System.out.println(publicStaticVariable);

        // calling non-static methods
        AccessSpecifiers accessSpecifiers = new AccessSpecifiers();
        accessSpecifiers.privateMethod();
        accessSpecifiers.defaultMethod();
        accessSpecifiers.protectedMethod();
        accessSpecifiers.publicMethod();

        System.out.println(accessSpecifiers.privateVariable);
        System.out.println(accessSpecifiers.defaultVariable);
        System.out.println(accessSpecifiers.protectedVariable);
        System.out.println(accessSpecifiers.publicVariable);
    }

    public static void publicStaticMethod() {

    }

    private static void privateStaticMethod() {

    }

    protected static void protectedStaticMethod() {

    }

    static void defaultStaticMethod() {

    }

    public void publicMethod() {

    }

    private void privateMethod() {

    }

    protected void protectedMethod() {

    }

    void defaultMethod() {

    }
}
