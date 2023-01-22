package Lab_3;



public class GamePC3 {


    public class GamePC2 gamePC2;


    public GamePC3(GamePC2 gamePC2) {
        this.gamePC2 = gamePC2;
    }

    private int priceGamePC() {
        return gamePC2.gamePC.priceGamePC();
    }

    public int getPriceGamePC() {
        return priceGamePC();
    }

    private void success() {
        gamePC2.gamePC.success();
    }

    public void getSuccess() {
        success();
    }

    private int  lottery(int count) {
        return gamePC.priceGamePC(count);
    }

    public int getlottery(int count) {
        return lottery(count);
    }

    private void advertisement() {
        GamePC2.advertisement();
    }

    public void getAdvertisement() {
        advertisement();
    }
}
