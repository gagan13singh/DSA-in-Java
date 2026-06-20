package oops;

import static oops.ImportantKeywords.message;

public class Greeting {
    public static void main(String[] args) {
        message();

    }
}

//The import statement is used to access classes and interfaces from
// other packages without writing their full package names.
// If classes belong to the same package, importing is not required.
// However, methods of another class cannot be called directly unless
// they belong to the current class.
// A static method can be accessed using ClassName.methodName() or directly
// by using a static import.