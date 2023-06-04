import MobilePhone.MobilePhone;
import MobilePhone.Tablet;

public class Main {
    public static void main(String[] args) {
        MobilePhone myPhone = new MobilePhone();
        myPhone.model = "iPhone 3G";
        myPhone.hasBluetooth = true;
        myPhone.addCredits(10, "afafafafafaf");
        myPhone.call("Mom");
        myPhone.simCard = 2;


        Tablet homeTablet = new Tablet();
        homeTablet.model = "iPad Air";
        homeTablet.addCredits(10, "adadad");
        homeTablet.call("Mom");
        homeTablet.pencil = true;
        homeTablet.simCard = true;
    }
}
