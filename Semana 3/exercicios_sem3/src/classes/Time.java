package classes;

public class Time {
  private int hour;
  private int minute;

  // Constructor deafult
  public Time() {
    this.hour = 0;
    this.minute = 0;
  }

  // Contructor with params for hour and minutes
  public Time(int hour, int minute) {
    this.hour = hour;
    this.minute = minute;
  }

  // Constructor with params for total minutes in a day
  public Time(int totalMinutes) {
    this.hour = totalMinutes / 60;
    this.minute = totalMinutes % 60;
  }

  /*
   * Checks if the given hour and minute specified are earlier than the object
   * time
   */
  public boolean previous(int hour, int minute) {
    return (this.hour > hour || this.hour == hour && this.minute > minute);
  }

  /*
   * Checks if the given hour and minute specified are later to object
   * time
   */
  public boolean after(int hour, int minute) {
    return (this.hour < hour || this.hour == hour && this.minute < minute);
  }

  /*
   * Checks if the given hour and minute specified are egual to object
   * time
   */
  public boolean equals(int hour, int minute) {
    return (this.hour == hour && this.minute == minute);
  }

  /*
   * Return a string with the hour and minute, format -> hour:minute
   */
  public String toString() {
    return String.format("%02d", "%02d", this.hour, this.minute);
  }

}
