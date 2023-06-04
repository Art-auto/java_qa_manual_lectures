package MobilePhone;

public class MobilePhone {
    public boolean hasSensor;
    public boolean wiFi;
    public double size;
    public boolean hasBluetooth;
    public String model;

    public int simCard;
    private int credits;

//    public MobilePhone (boolean wiFi, boolean hasSensor, double size){
 //       this.wiFi = wiFi;
  //      this.hasSensor = hasSensor;
  //      this.size = size;
  //  }

    public void call(String contact) {
        if (this.credits > 0) {
        if(contact == "Mom") {
            System.out.println("Hello dear Mom!" + "I am calling from " + this.model);
        }
        if (contact == "friend") {
            System.out.println("wats up bro!" + "I am calling from " + this.model);
            }else {
            System.out.println("Hello" + contact);
        }
        this.credits = this.credits - 1;
        } else {
            System.out.println("Please add some money!");
        }
    }

    public void addCredits(int amount, String code) {
        this.credits = this.credits + amount;
    }
}