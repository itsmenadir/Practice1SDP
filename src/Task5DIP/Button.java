package Task5DIP;

import java.awt.*;

public class Button {
    private Light light;
    private Switchable device;
    public Button(Light light, Switchable device) {
        this.light = light;
        this.device = device;
    }
    public void press() {
        light.turnOn();
        device.turnOn();
    }



}

