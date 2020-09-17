public class Person {


    private String name;
    public Person(String name) {
        this.setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void sayHello() {
        System.out.println("Hello " + this.name + "!");
    }

    public static void main(String[] args) {

        Person john = new Person("John");
        Person jane = new Person("Jane");

        john.sayHello();
        jane.sayHello();

        Person p1 = new Person("Joe");
        Person p2 = new Person("Joe");
        System.out.println(p1.getName().equals(p2.getName()));
        System.out.println(p1 == p2);

        Person p3 = new Person("Joe");
//        Person p2 = p3;
        System.out.println(p3 == p2);

//        Person p3 = p2;
        System.out.println(p1.getName());
        System.out.println(p2.getName());
        p2.setName("Jane");
        System.out.println(p1.getName());
        System.out.println(p2.getName());


    }

}
