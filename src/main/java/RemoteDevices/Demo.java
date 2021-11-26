package RemoteDevices;

import RemoteDevices.devices.Device;
import RemoteDevices.devices.Radio;
import RemoteDevices.devices.Tv;
import RemoteDevices.remotes.AdvanceRemote;
import RemoteDevices.remotes.BasicRemote;

public class Demo {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    private static void testDevice(Device device) {
        System.out.println("Tests with basic remote");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("test with advanced remote.");
        AdvanceRemote advanceRemote = new AdvanceRemote(device);
        advanceRemote.power();
        advanceRemote.mute();
        device.printStatus();
    }
}
