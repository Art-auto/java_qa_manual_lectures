import MobilePhone.MobilePhone;
import MobilePhone.tablet;

public class Main {
    public static void main(String[] args) {
        MobilePhone myPhone = new MobilePhone();
        myPhone.model = "iPhone3G";
        myPhone.hasBluetooth = true;
        myPhone.size = 6.7;
        myPhone.addCredits(10, "gfdgfdgdfgd");
        myPhone.call("Mom");
        myPhone.simCard =2;

        tablet homeTablet = new tablet();
        homeTablet.model = "iPad Air";
        homeTablet.addCredits(10, "hfkjfjfjdfj");
        homeTablet.call("Mom");
        homeTablet.pencil = true;
        homeTablet.simCard = true;

    }
}
