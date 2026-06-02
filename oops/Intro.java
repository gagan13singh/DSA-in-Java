package oops;
import java.util.Arrays ;

public class Intro {
    public static void main(String[] args) {

        class Student{
            int roll;
            String name;
            float marks;

            void greet(){
                System.out.println("Hello, my name is "+ name);
            }

            Student(){
                this.roll=10;
                this.name="Alex";
                this.marks=(float)93.14;
            }
            Student(int roll,String name,float marks){
                this.roll=roll;
                this.name=name;
                this.marks=marks;
            }
        }
//        Student[] students= new Student[5];

        Student student1=new Student();
        System.out.println(student1.roll);
        System.out.println(student1.name);
        System.out.println(student1.marks);
        student1.greet();

        Student student2=new Student(2,"sohan",95);
        System.out.println(student2.roll);
        System.out.println(student2.name);
        System.out.println(student2.marks);

//        student1.roll=5;
//        student1.name="rohan";
//        System.out.println(student1.roll);
//        students[0]=student1;
//        System.out.println(Arrays.toString(students));
    }
}

//Class: A logical construct or blueprint that defines properties and behaviors.
//It does not occupy memory until an object is created.

//Object: A physical reality or an instance of a class.
//Objects actually occupy space in memory.

//Objects are stored in the heap memory.
//Reference variables are stored in the stack memory.

//new keyword: Allocates heap memory at runtime (dynamically),
//creates an object, and returns a reference variable pointing to it.

//Java constructors: It defines what happens when our object is created,
//It is same as the name of the class, here Student() is a constructor.
//Special function that runs when you create an object and it also allocated some variables.
//2 Types:default(no-argument constructor) and parametrized

// IMPORTANT: Parameter Shadowing

// If a constructor parameter and an instance variable have the same name,
// Java gives priority to the parameter inside the constructor.

// Example:

//class Student {
//    String name;
//
//    Student(String name) {
//        name = name;   // WRONG
//    }
//}

// Here, both 'name' refer to the constructor parameter.
// So Java effectively does:
//
// parameter_name = parameter_name;
//
// The instance variable is never updated.
// Therefore, the instance variable 'name' keeps its default value:
//
// String -> null
//
// Example:
//
// Student s = new Student("Rohan");
// System.out.println(s.name);
//
// Output:
// null

// CORRECT WAY:

//class Student {
//    String name;
//
//    Student(String name) {
//        this.name = name;   // CORRECT
//    }
//}

// 'this.name' -> instance variable of the current object
// 'name'      -> constructor parameter
//
// this.name = name;
//
// means:
//
// object's name = parameter's name

// Quick Rule:
// name = name;       ❌ Wrong
// this.name = name;  ✅ Correct