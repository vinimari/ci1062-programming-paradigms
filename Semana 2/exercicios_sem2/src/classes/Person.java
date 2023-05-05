package classes;

import java.time.LocalDate;
import java.time.Period;

/**
 * Pessoa
 */
public class Person {
  // Atributes
  String name;
  int age;
  int dayOfBirth;
  int monthOfBirth;
  int yearOfBirth;

  // Constructor
  public Person(String name, int dayOfBirth, int monthOfBirth, int yearOfBirth) {
    this.name = name;
    setDateBirth(dayOfBirth, monthOfBirth, yearOfBirth);
  }

  public void setDateBirth(int day, int month, int year) {
    this.dayOfBirth = day;
    this.monthOfBirth = month;
    this.yearOfBirth = year;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public void calculateAge(int currentDay, int currentMonth, int currentYear) {
    LocalDate givenDate = LocalDate.of(currentYear, currentMonth, currentDay),
        birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);

    Period finalAge = Period.between(birthDate, givenDate);

    System.out.printf("\n%s age: %d years, %d months, %d days.", this.name, finalAge.getYears(), finalAge.getMonths(),
        finalAge.getDays());
  }

}