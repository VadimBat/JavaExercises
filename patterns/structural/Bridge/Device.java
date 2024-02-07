package Bridge;

public interface Device {
    boolean isEnabled();

    void enable();

    void disable();

    int getDeviceVolume();

    void setVolume(int percent);

    int getChannel();

    void setChannel(int channel);

    void printStatus();

}
