public class SmartLight extends SmartDevice implements Adjustable {
    private int brightness;  // 0 to 100

    public SmartLight(String deviceName) {
        super(deviceName);
        brightness = 50;
    }

    @Override
    public void setLevel(int level) {
        if (!isOn) {
            System.out.println("Cannot adjust: Device is OFF.");
        } else {
            if (level >= 0 && level <= 100) {
                System.out.println("Adjusting brightness to " + Integer.toString(level));
                brightness = level;
            } else {
                System.out.println("Cannot adjust: level out of bounds (0-100).");
            }
        }
    }

    @Override
    void performSelfDiagnostic() {
        System.out.println("Checking LED Health...");
        System.out.println("Brightness is set to " + Integer.toString(brightness));
    }
}
