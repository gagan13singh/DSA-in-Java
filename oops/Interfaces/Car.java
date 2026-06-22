package oops.Interfaces;

public class Car implements Engine,Brake{
    @Override
    public void acc() {
        System.out.println("accelerating..");

    }

    @Override
    public void brake() {
        System.out.println("Braking Car");

    }

    @Override
    public void start() {
        System.out.println("Starting Car");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Car");
    }
}
