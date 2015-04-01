/**
 * Created by Jeel on 3/31/15.
 */
public interface Person {

    public String getName();

    public int getAge();

    public int getNumOfChildren();

    public void add(Person person);

    public void remove(Person person);

    public void introduce();
}
