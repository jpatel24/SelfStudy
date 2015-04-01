/**
 * Created by Jeel on 3/31/15.
 */
public class Client {
    public static void main(String[] agrs){

        //Make parent objects
        Person parent1 = new Parent("Ethan", 35);
        Person parent2 = new Parent("Christine", 33);

        //Make child Objects
        Person child1 = new Child("Ethine", 10);
        Person child2 = new Child("Christian",22);

        //Associate the children to the parents
        parent1.add(child1);
        parent1.add(child2);

        parent2.add(child1);
        parent2.add(child2);

        //Let the introductions begin.
        parent1.introduce();
        parent2.introduce();

    }

}
