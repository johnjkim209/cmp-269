public class SmartThermostat extends SmartDevice implements Adjustable {
    private int temperature;  // 60 to 80

    public SmartThermostat(String deviceName) {
        super(deviceName);
        temperature = 60;
    }

    @Override
    public void turnOn() {
        System.out.println("HVAC System Starting...");
        super.turnOn();
    }

    @Override
    public void setLevel(int level) {
        if (!isOn) {
            System.out.println("Cannot adjust: Device is OFF.");
            } else {
                if (level >= 60 && level <= 80) {
                    System.out.println("Adjusting temperature to " + Integer.toString(level));
                    temperature = level;
                } else {
                    System.out.println("Cannot adjust: level out of bounds (60-80).");
                }
        }
        
    }

    @Override
    void performSelfDiagnostic() {
        // TODO Auto-generated method stub
        
    }
}
