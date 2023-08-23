package skill.inner;

public class Main {
    public static void main(String[] args) {

        TVset tv = new TVset();
        tv.getRemote().turnOn();
        System.out.println(tv);

        tv.getRemote().setChannel(10);
        tv.getRemote().turnOn();
        System.out.println(tv);

        TVset tVset = new TVset() { // Анонимный класс
            @Override
            public Remote getRemote() {
                return super.getRemote();
            }
        };

        TVset.Button button = new TVset.Button();

    }
}