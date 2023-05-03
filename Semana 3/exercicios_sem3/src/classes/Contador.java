package classes;

public class Contador {
  private int itemsCounter; 
  private int eventsCounter;

  // Constructor
  public Contador(int itemCounterValue, int eventCounterValue) {
    this.setCounterItems(itemCounterValue);
    this.setCounterEvents(eventCounterValue); 
  }

  // Get methods
  public int getCounterItems() {
    return itemsCounter; 
  }

  public int getCounterEvents() {
    return eventsCounter;
  }

  // Set methods 
  public void setCounterItems(int valueCount) {
    this.itemsCounter = valueCount; 
  }

  public void setCounterEvents(int valueCount) { 
    this.itemsCounter = valueCount; 
  }

  // Reset counters
  public void resetCounterItems() {
    this.itemsCounter = 0; 
  }

  public void resetCounterEvents() {
    this.eventsCounter = 0;
  }

  // Add counters
  public void addCounterItems() {
    this.itemsCounter++;
  }

  public void addCounterEvents() {
    this.eventsCounter++; 
  }

  // Decrement counters
  public void decrementCounterItems() {
    if (itemsCounter - 1 >= 0)
    {
      this.itemsCounter--;
    }
  }

  public void decrementCounterEvents() {
    if (eventsCounter - 1 >= 0)
    {
      this.eventsCounter--;
    }
  }
}
