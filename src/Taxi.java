public class Taxi extends Transport {

    String destination;
    int distanceToDest;
    int basicDistance;
    int farePerDist;
    int fareToBePaid;
    int sumFare = 0;
    public Taxi() {
        super(3000, (int)(Math.random() * 10000), "일반",4, 0);
        farePerDist = 1000;
        basicDistance = 1;
        destination = "없음";
        distanceToDest = 0;
    }

    @Override
    void start() {
        maxPassenger = 4;
        currentPassenger = 0;
    }

    @Override
    void changeSpeed(int speed) {

    }


    void ridePassenger() {
        changeState("운행중");
        printTaxiInfo();
    }

    void setCurrentPassenger(int currentPassenger) {
        if (state.equals("일반")) {
            if (maxPassenger > currentPassenger) {
                this.currentPassenger = currentPassenger;
                maxPassenger -= currentPassenger;
            } else {
                System.out.println("최대 승객 수 초과");
            }
        }
        else{
            System.out.println("택시가 일반 상태가 아닙니다.");
        }
    }
    void setDestination(String destination) {
        this.destination = destination;
    }
    void setDistanceToDest(int dtd) {
        this.distanceToDest = dtd;
        ridePassenger();
    }
    @Override
    void changFuel(int fuel) {
        sumFare += fareToBePaid;
        this.fuel += fuel;
        if (this.fuel < 10){
            changeState("운행불가");
            System.out.println("주유량 = "+this.fuel);
            System.out.println("상태 = "+this.state);
            System.out.println("누적요금 = "+sumFare);
            System.out.println("주유 필요");
        } else if (fuel < 0) {
            changeState("일반");
            System.out.println("주유량 = "+this.fuel);
            System.out.println("누적요금 = "+sumFare);
        } else {
            changeState("일반");
            System.out.println("상태 = "+this.state);
            System.out.println("주유량 = "+this.fuel);
        }
    }

    void printTaxiName() {
        System.out.println("택시 번호 = "+getCarNumber());
        System.out.println("주유량 = "+fuel);
        System.out.println("상태 = "+state);
    }
    void printTaxiInfo() {
        fareToBePaid = (distanceToDest - basicDistance)*farePerDist + fare;
        System.out.println("탑승 승객 수 = "+currentPassenger);
        System.out.println("잔여 승객 수 = "+maxPassenger);
        System.out.println("기본 요금 확인 = "+fare);
        System.out.println("목적지 = "+destination);
        System.out.println("목적지까지 거리 = "+distanceToDest+"km");
        System.out.println("지불할 요금 = "+fareToBePaid);
        System.out.println("상태 = "+state);
    }
}