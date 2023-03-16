public class DefaultConstructor {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println("Person's name: " + person.name); 
        System.out.println("Person's age: " + person.age); 

        Student student = new Student("Vaibhav", 24);
        System.out.println("Student's name: " + student.name); 
        System.out.println("Student's age: " + student.age);

        // What happens when I uncomment the following?
        Student anotherStudent = new Student();
    }
}

class Person {
    String name;
    int age;
}

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

}