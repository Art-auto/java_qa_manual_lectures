package MobilePhone;

public class MobilePhone {
    private boolean hasSensor;
   private boolean wifi;
    private double size;

    public boolean hasBluetooth;
    public String model;
public int simCard;
private int credits;

/*public MobilePhone (boolean wifi, boolean hasSensor, double size) {
    this.wifi = wifi;
    this.hasSensor = hasSensor;
    this.size = size;

}*/

    public void call(String contact) {
        if (this.credits > 0) {
            if (contact == "Mom") {
                System.out.println("Hello dear Mom!" + "I'm calling from " + this.model);
            } else if (contact == "friend") {
                System.out.printf("wats up bro!" + "I'm calling from " + this.model);
            } else {
                System.out.println("Hello"+contact);
            }

            this.credits = this.credits - 1;
        } else {
            System.out.println("Please add some money!");
        }
    }

    public void addCredits(int amount, String code){
        this.credits = this.credits + amount;
    }
}