package RemoteDevices.devices;

public interface Device {
    boolean isEnabled();
    void enabled();
    void disable();

    int getVolume();
    void setVolume(int percent);

    int getChannel();
    void setChannel(int channel);

    void printStatus();
}
