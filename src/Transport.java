abstract class Transport {
    int fare;
    private int carNumber;
    int fuel;
    int speed;
    int maxPassenger;
    int currentPassenger;
    String state;

    public Transport(int fare, int carNumber, String state, int maxPassenger, int currentPassenger) {
        this.fare = fare;
        this.carNumber = carNumber;
        this.fuel = 100;
        this.speed = 0;
        this.state = state;
        this.maxPassenger = maxPassenger;
        this.currentPassenger = currentPassenger;
    }

    public int getCarNumber() {
        return carNumber;
    }
    abstract void start();
    abstract void changeSpeed(int speed);

    abstract void changFuel(int fuel);

    void changeState(String state) {
        this.state = state;
    }
}