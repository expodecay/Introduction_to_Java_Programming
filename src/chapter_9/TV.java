package chapter_9;

/**
 * pg. 327
 * Created by Rick on 8/16/2015.
 *The construct and methods in the TV class are defined public so they can be accessed from other classes.
 */
public class TV {
    int channel = 1; // Default channel
    int volumeLevel = 1; // Default volume
    boolean on = false; // TV is off

    public  TV(){       // constructor
                            // You don't actually need this. A class may be defined without a constructor. In that case,
                            // a public no-argument constructor with an empty body is implicitly defined in the class.
    }                    // It must have same name as class and does not have a return type -- not even void.
                         // Note: Constructors can be overloaded (same name with different parameters)

    public void turnOn(){
        on = true;
    }

    public void turnOff(){
        on = false;
    }

    public void setChannel(int newChannel){                  // Channel and volume are not changed if the TV is not on
        if (on && newChannel >= 1 && newChannel <= 120)
            channel = newChannel;
    }

    public void setVolume(int newVolumeLevel){
        if (on && newVolumeLevel >= 1 && newVolumeLevel<= 7)
            volumeLevel = newVolumeLevel;
    }

    public void channelUp(){
        if (on && channel < 120)
            channel++;
    }

    public void channelDown(){
        if (on && channel > 1)
            channel--;
    }

    public void volumeUp(){
        if (on && volumeLevel < 7)
            volumeLevel++;
    }

    public void volumeDown(){
        if (on && volumeLevel > 1)
            volumeLevel--;
    }
}
