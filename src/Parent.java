import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jeel on 3/31/15.
 */
public class Parent implements Person {
    private String name;
    private int age;
    private List<Person> children = new ArrayList<Person>();

    public Parent(String name, int age){
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
        return children.size();
    }

    @Override
    public void add(Person person) {
        children.add(person);
    }

    @Override
    public void remove(Person person) {
        children.remove(person);
    }

    @Override
    public void introduce() {
        System.out.println("Hello, My Name is " + getName());
        System.out.println("I am " + getAge() +" years old");
        System.out.println("I have " + getNumOfChildren() + " children");

        System.out.println("Children.. Introduce yourselves!");
        for(Person person:children){
            person.introduce();
        }
    }
}
