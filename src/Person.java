import java.util.HashSet;

public class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Person)) {
            return false;
        }
        Person other = (Person) obj;
        return name.equals(other.name) && age == other.age;
    }

    @Override
    public int hashCode() {
        return name.hashCode() ^ Integer.hashCode(age);
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

    public static void main(String[] args) {
        HashSet<Person> people = new HashSet<>();
        people.add(new Person("Mihai", 25));
        people.add(new Person("Valeria", 30));
        people.add(new Person("Ion", 65));
        people.add(new Person("Victor", 75));

        for (Person person : people) {
            if (person.getAge() > 60) {
                System.out.println(person);
            }
        }
    }
}