import java.time.Period;

import classes.Person;

public class App {
    public static void main(String[] args) throws Exception {
        Person person = new Person();
        Period actualAge;

        person.setDateBirth(9, 1, 2023);
        actualAge = person.calculateAge(2, 5, 2023);

        System.out.printf("Age: %d years, %d months, %d days.", actualAge.getYears(), actualAge.getMonths(),
                actualAge.getDays());
    }
}
