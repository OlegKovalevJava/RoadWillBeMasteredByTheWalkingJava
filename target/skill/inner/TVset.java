package skill.inner;

import lombok.Getter;

public class TVset {

    private int channel = 5;
    private boolean isOn;
    @Getter
    private Remote remote = new Remote();

    static class Button { // Статический вложенный класс
        private String button;

    }

    class Remote { // Внутренний класс

        public void setChannel(int channel) {
            TVset.this.channel = channel;
        }

        public void turnOn() {
            isOn = true;
        }

        public void turnOff() {
            isOn = false;
        }
    }

    public String toString() {
        if (!isOn) {
            return "The TVset is OFF";
        }
        return "Channel " + channel + " is on the TVset now.";
    }

}