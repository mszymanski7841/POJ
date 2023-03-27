public class Remote {
    public TV tv;
    public Remote(TV tv){
        this.tv = tv;
    }

    public void turnOn(){
        tv.turnOn();
        System.out.println("Włączono telewizor");
    }
    public void turnOff(){
        tv.turnOff();
        System.out.println("Wyłączono telewizor");
    }
    public void changeChannelUp(){
        tv.changeChannelUp();
        System.out.println("Kanał zmieniony na: "+ tv.channel);
    }
    public void changeChannelDown(){
        tv.changeChannelDown();
        System.out.println("Kanał zmieniony na: "+ tv.channel);
    }
    public void changeVolumeUp(){
        tv.changeVolumeUp();
        System.out.println("Głośność: " + tv.volume);
    }
    public void changeVolumeDown(){
        tv.changeVolumeDown();
        System.out.println("Głośność: " + tv.volume);
    }


}
