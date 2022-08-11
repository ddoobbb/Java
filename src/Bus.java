public class Bus extends Transport{
    public Bus() {
        super(1000, (int)(Math.random() * 100), "운행",30, 0);
    }

    @Override
    void start() {
        maxPassenger = 30;
        currentPassenger = 0;
    }

    @Override
    void changeSpeed(int speed) {
        if (fuel >= 10) {
            this.speed += speed;
        } else {
            System.out.println("주유량을 확인해 주세요");
        }
    }

    void ridePassenger(int num) {
        if (state.equals("운행")) {
            if (maxPassenger > num) {
                currentPassenger += num;
                maxPassenger -= num;
                fare = num * 1000;
                printBusInfo();
            } else {
                System.out.println("최대 승객 수 초과");
            }
        } else {
            System.out.println("버스가 운행 중이 아닙니다.");
        }
    }

    @Override
    void changFuel(int fuel) {
        this.fuel += fuel;
        if (this.fuel < 10){
            System.out.println("주유량 = "+this.fuel);
            System.out.println("상태 = "+this.state);
            System.out.println("주유 필요");
            changeState("차고지행");
        } else if (fuel < 0) {
            System.out.println("주유량 = "+this.fuel);
            changeState("운행");
        } else {
            System.out.println("상태 = "+this.state);
            System.out.println("주유량 = "+this.fuel);
            changeState("운행");
        }
        start();
    }

    void printBusInfo(){
        System.out.println("탑승 승객 수 ="+currentPassenger);
        System.out.println("잔여 승객 수 ="+maxPassenger);
        System.out.println("요금 확인 ="+fare);
    }
    void printBusInfoAll(){
        System.out.println("버스번호 = "+getCarNumber());
        System.out.println("상태 = "+state);
        System.out.println("주유량 = "+fuel);
        System.out.println("탑승 승객 수 ="+currentPassenger);
        System.out.println("잔여 승객 수 ="+maxPassenger);
        System.out.println("요금 확인 ="+fare);
    }
}