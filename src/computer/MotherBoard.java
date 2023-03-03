package computer;

public class MotherBoard {

    static class USB {
           static void connected(){
            System.out.println("access the file of USB\"");
        }
    }
    public static void port(){
        System.out.println("USB processing....");
        USB usb = new USB();
        usb.connected();
    }
}
