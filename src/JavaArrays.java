import java.util.Arrays;

public class JavaArrays {

    public static Person[] addPerson(Person[] family, Person person) {
        Person[] oneMore = Arrays.copyOf(family, family.length + 1);
        oneMore[oneMore.length -1] = person;
        return oneMore;
    }

    public static void main(String[] args) {

        Person[] family = new Person[3];
        family[0] = new Person("joe");
        family[1] = new Person("jane");
        family[2] = new Person("john");

        family = addPerson(family, new Person("joseph"));
        for (Person fam: family){
            System.out.println(fam.getName());
        }

    }
}
