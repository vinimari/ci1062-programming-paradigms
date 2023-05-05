import classes.Person;

public class App {
    public static void main(String[] args) throws Exception {
        Person personOne = new Person("Grace Hopper", 9, 12, 1906);
        Person personTwo = new Person("Ada Lovelace", 10, 12, 1815);
        Person[] persons = { personOne, personTwo };

        for (int i = 0; i < 2; i++) {
            persons[i].calculateAge(4, 5, 2023);
        }
    }
}
