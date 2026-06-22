package oops.Interfaces;

public interface Engine {

    int price=50000;
    void start();
    void stop();
    void acc();


}

// Interface:-
// 1. Cannot create objects.
// 2. Used to achieve abstraction.
// 3. Supports multiple inheritance.
// 4. Variables are public static final.
// 5. Methods are public abstract by default.
// 6. No constructors.
// 7. Can have default and static methods (Java 8+).
// 8. Implemented using 'implements' keyword.
// Don't use interfaces in performance critical code.(but not in modern java)
