import MobilePhone.MobilePhone;
import MobilePhone.Tablet;
public class Main {
    public static void main(String[] args) {
        MobilePhone myPhone = new MobilePhone();
        myPhone.hasSensor = true;
        myPhone.model = "iPhone 3G";
        myPhone.hasBluetooth = true;
        myPhone.size = 6.7;
        System.out.println(myPhone.size);
        System.out.println(myPhone.model);
        myPhone.addCredits(10, "gfdgfdgdfgd");
        myPhone.call("Mom");

        Tablet homeTablet = new Tablet();
        homeTablet.model = "iPad Air";
        homeTablet.addCredits( 10,"asdsad");
        homeTablet.call( "Mom");
    }
}
