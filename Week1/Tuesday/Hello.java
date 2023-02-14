public class Hello {

    public static void main(String[] args){

        Student obj = new Student("Andrews");
        Student obj2 = new Student("Andrews");
        // Student obj3 = new Student("Micheal");

        // System.out.println(obj.equals(obj3));
        System.out.println(obj.hashCode());
        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());
    }
}

class Student{
    public String name;
    Student(String name){
        this.name = name;
    }

    public boolean equals(Student obj){
        return true;
        // return (Boolean)this.name.equals(obj.name);
    }

    public int hashcode(){
        return 1;
    }
}

class Parent{
    Parent(){
        System.out.println("Parent's Constructor");
    }

    Parent(String message){
        System.out.println("Parent's Constructor says: " + message);
    }    
}

class Child extends Parent{
    Child(){
        super("Hi!");
        System.out.println("Child's Constructor");
    }
    Child(String message){
        System.out.println("Child's Constructor says: " + message);
    }    

    public String toString(){
        return "O| |X\n ---\nO| |X\nO| |X";
    }
}

// class GrandChild extends Child{
//     GrandChild(){
//         System.out.println("GrandChild's Constructor");
//     }
// }