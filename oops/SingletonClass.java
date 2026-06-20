package oops;

public class SingletonClass {
    private SingletonClass(){

    }
    private static SingletonClass instance;
    public static SingletonClass getInstance(){
        if(instance == null){
            instance = new SingletonClass();
        }
        return instance;
    }
}

//A Singleton Class is a class that allows
// only one object to be created throughout the application.