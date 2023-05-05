import classes.Person;

public class App {
    public static void main(String[] args) throws Exception {
        Person personOne = new Person("Grace Hopper", 9, 12, 1906);
        Person personTwo = new Person("Ada Lovelace", 10, 12, 1815);

        personOne.calculateAge(4, 5, 2023);
        personTwo.calculateAge(4, 5, 2023);
    }
}
