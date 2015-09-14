package chapter_9;

/**
 * pg. 328
 * Created by Rick on 8/16/2015.
 * The program creates two objects (tvs) and invokes the methods on the objects to perform actions for setting channels
 * and volume levels and for increasing channels and volumes.
 */
public class TestTV {
    public static void main(String[] args) {
        TV tv1 = new TV();      // A constructor is invoked to create an object using the 'new' operator
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);

        TV tv2 = new TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();

        System.out.println("tv1's channel is " + tv1.channel + " and volume level is " + tv1.volumeLevel);
        System.out.println("tv2's channel is " + tv2.channel + " and volume level is " + tv2.volumeLevel);
    }
}
