import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world!");


        ArrayList<SmartDevice> homeHub = new ArrayList<>();
        SmartLight livingRoomLight = new SmartLight("livingRoomLight");
        SmartLight kitchenLight = new SmartLight("kitchenLight");
        SmartThermostat hallwayThermostat = new SmartThermostat("hallwayThermostat");
        homeHub.add(livingRoomLight);
        homeHub.add(kitchenLight);
        homeHub.add(hallwayThermostat);

        livingRoomLight.turnOn();
        hallwayThermostat.turnOn();
        kitchenLight.setLevel(75);

        System.out.println(SmartDevice.activeDevicesCount);

        for (SmartDevice device : homeHub) {
            device.performSelfDiagnostic();
        }
    }
}
