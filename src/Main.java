import MobilePhone.MobilePhone;
import MobilePhone.Tablet;

public class Main {
    public static void main(String[] args) {
   MobilePhone myPhone = new MobilePhone();

    myPhone.model = "iPhone 3G";
    myPhone.hasBluetooth = true;
    myPhone.simCard =2;

        System.out.println(myPhone.model);
myPhone.addCredits(10, "gogo");
myPhone.call("Mom");

Tablet homeTablet = new Tablet();
homeTablet.model = "X 112";
homeTablet.addCredits(10,"goho");
homeTablet.call("Mom");
homeTablet.pencil = true;
homeTablet.simCard = true;


    }
}
