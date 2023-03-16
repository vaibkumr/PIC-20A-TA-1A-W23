public class Interfaces {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.moveForward(); // Output: "The bicycle moves forward"
        bicycle.moveBackward(); // Output: "The bicycle moves backward"
    }
}

interface Movable {
    void moveForward();
    void moveBackward();
}


class Car implements Movable {
    public void moveForward() {
        System.out.println("The car moves forward");
    }
}

class Bicycle implements Movable {
    public void moveForward() {
        System.out.println("The bicycle moves forward");
    }

    public void moveBackward() {
        System.out.println("The bicycle moves backward");
    }
}


