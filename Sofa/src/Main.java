import Sofa.Sofa;  // Importing Sofa class

public class Main {
    public static void main(String[] args) {
        // Create an instance of Sofa
        Sofa sofa = new Sofa();

        sofa.displayDetails();          // From Product class
        sofa.displayCategory();         // From Sofa class (overridden)
        sofa.assemble();                // From Furniture class (overridden)
        sofa.recline();                 // From Sofa class


    }
}
