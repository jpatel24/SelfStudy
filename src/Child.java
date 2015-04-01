/**
 * Created by Jeel on 3/31/15.
 */
public class Child implements Person{
    private String name;
    private int age;

    public Child(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public int getNumOfChildren() {
        return 0;
    }

    @Override
    public void add(Person person) {
        // no implementation needed
    }

    @Override
    public void remove(Person person) {
        // no implementation needed
    }

    @Override
    public void introduce() {
        System.out.println("Hello, My name is " + getName());
        System.out.println("I am " + getAge() + " years old");

    }
}
