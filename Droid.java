public class Droid {

    String name;
    int batteryLevel;
  
    public Droid(String droidName) {
      name = droidName;
      batteryLevel = 100;
    }
  
    public void energyReport() {
      System.out.println("Current battery level is " + batteryLevel);
    }
  
    public void toString(String task) {
      System.out.println("Christopher is performing task: " + task);
      batteryLevel -= 10;
    }
  
    public static void main(String[] args) {
      Droid codey = new Droid("Codey");
      System.out.println(codey.name);
      codey.toString("Dishes");
      codey.energyReport();
    }
  }