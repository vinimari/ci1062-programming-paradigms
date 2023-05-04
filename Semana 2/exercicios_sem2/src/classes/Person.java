package classes;

import java.time.LocalDate;
import java.time.Period;

/**
 * Pessoa
 */
public class Person {

  String name;
  int age;
  int dayOfBirth;
  int monthOfBirth;
  int yearOfBirth;

  public void setDateBirth(int day, int month, int year) {
    dayOfBirth = day;
    monthOfBirth = month;
    yearOfBirth = year;
  }

  public String getName() {

    return name;
  }

  public int getAge() {

    return age;
  }

  public Period calculateAge(int currentDay, int currentMonth, int currentYear) {
    LocalDate givenDate = LocalDate.of(currentYear, currentMonth, currentDay),
        birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);

    Period finalAge = Period.between(birthDate, givenDate);

    return finalAge;
  }

}