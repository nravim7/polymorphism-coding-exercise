public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public String startEngine() {
        return "Car -> engine is starting and type is " + getClass().getSimpleName();

    }

    public String accelerate() {
        return "Car -> accelerating";
    }

    public String brake() {
        return "Car -> braking";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}

class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
       return "Mitsubishi -> engine is starting and type is " + getClass().getSimpleName();

    }

    @Override
    public String accelerate() {
        return "Mitsubishi -> accelerating";
    }

    @Override
    public String brake() {
        return "Mitsubishi -> braking";
    }
}

class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Holden -> engine is starting and type is " + getClass().getSimpleName();

    }

    @Override
    public String accelerate() {
        return "Holden -> accelerating";
    }

    @Override
    public String brake() {
        return "Holden -> braking";
    }
}

class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford -> engine is starting and type is " + getClass().getSimpleName();

    }

    @Override
    public String accelerate() {
        return "Ford -> accelerating";
    }

    @Override
    public String brake() {
        return "Ford -> braking";
    }
}
