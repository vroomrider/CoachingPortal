package org.example.practicals.coaching.basic.packages;

// When Two Classes with same name but different packages are present then below msg can be observed
// Already Defined Error
//import org.example.practicals.coaching.basic.packages.fullyqualifiedclassname.Sample;
import org.example.practicals.coaching.basic.packages.fullyqualifiedclassname.sub.Sample;

public class PackagesExample {
    public static void main(String[] args) {
        // Fully Qualified Class Name
        org.example.practicals.coaching.basic.packages.fullyqualifiedclassname.Sample sample
                = new org.example.practicals.coaching.basic.packages.fullyqualifiedclassname.Sample();
        sample.printMe();


        // Imported Sample class which is under the package "sub".
        // Imported the fullyQualified Class Name
        Sample subSample = new Sample();
        subSample.printMe();

    }
}
