public class TV {
    int channel;
    int volume;
    boolean on;

    public TV(){
        channel = 1;
        volume = 5;
        on = false;
    }
    public void turnOn(){
        on = true;
    }
    public void turnOff(){
        on = false;
    }
    public void changeChannelUp(){
        if(on && channel < 20){
            channel++;
        }
    }
    public void changeChannelDown(){
        if(on && channel > 1){
            channel--;
        }
    }
    public void changeVolumeUp(){
        if(on && volume < 10){
            volume++;
        }
    }
    public void changeVolumeDown(){
        if(on && volume > 1){
            volume--;
        }
    }
}
