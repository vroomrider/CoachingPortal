package org.example.practicals.coaching.basic.blocks;

public class Blocks {

    static int staticNum = 1;

    {
        System.out.println("Non-Static 1 Block");
    }

    {
        System.out.println("Non-Static 2 Block");
    }

    static {
        System.out.println("Static 1 Block");
    }

    static {
        System.out.println("Static 2 Block");
        initialExecutionMethod();

        Blocks blocks = new Blocks();
        blocks.initialNonstaticExecutionMethod();
    }

    public static void initialExecutionMethod() {
        System.out.println("Execute Initially");
    }

    public void initialNonstaticExecutionMethod() {
        System.out.println("Execute non static Initially");
    }

    public static void main(String[] args) {

        // Everytime an Object is created then
        // the non-static blocks will be executed accordingly

        Blocks blockObj1 = new Blocks();

        Blocks blockObj2 = new Blocks();
    }

    static {
        System.out.println("Static 4 Block");
    }

    static {
        System.out.println("Static 3 Block");
    }

    {
        System.out.println("Non-Static 4 Block");
    }

    {
        System.out.println("Non-Static 3 Block");
    }
}
