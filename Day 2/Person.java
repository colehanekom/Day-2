public class Person {
    String name;
    int age;
    int height;

    public Person(){ //Constructor which does not accepts a single parameter
    }
    public Person (String name){ //Constructor which accepts a single parameter
    }
    void run(){

    }
    void walk(){

    }
    public static void main(String[] args) {
        Person linda = new Person(); //this statement creates an object from the Person class parameterless constructor
        Person melusi = new Person("melusi"); //this statement creates an object from the Person class using a parameterized contructor
    }
}
