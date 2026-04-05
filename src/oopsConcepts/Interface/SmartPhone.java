package oopsConcepts.Interface;

public class SmartPhone implements Camera, MusicPlayer{
    
@Override
public void takePhoto(){
    System.out.println("Capturing a high-resolution photo...");

}
@Override
public void playMusic(){
      System.out.println("Playing your favorite playlist...");

}
public void makeCall(){
    System.out.println("Making a phone call...");
}

public static void main(String[] args) {
    
    SmartPhone sp = new SmartPhone();
    sp.takePhoto();
    sp.playMusic();
    sp.makeCall();
}

}
