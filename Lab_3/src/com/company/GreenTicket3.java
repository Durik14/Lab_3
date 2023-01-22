package Lab_3;


public class GreenTicket3 {


    public GreenTicket2 greenTicket2;

    public GreenTicket3(GreenTicket2 greenTicket2) {
        this.greenTicket2 = greenTicket2;
    }

    private void howLong() {
        greenTicket2.greenTicket.howLong();
    }

    public void getHowLong() {
        howLong();
    }

    private double time() {
        return greenTicket2.greenTicket.time();
    }

    public double time() {
        return time();
    }


    private void advertisement() {
        greenTicket2.advertisement();
    }

    public void getAdvertisement() {
        advertisement();
    }


}
